package com.example.singleton;

import java.util.Arrays;

/**
 * 问题：为什么这种内部静态类的方式，是线程安全的？
 * 答：首先要了解类加载过程中的最后一个阶段：即类的初始化，类的初始化阶本质就是执行类构造器的<clinit>方法。那么什么是<clinit>方法？
 * 这不是由程序员写的程序，而是根据代码由javac编译器生成的。它是由类里面所有的【静态成员的的赋值语句】和【静态代码块】组成的。JVM内部会保证一个类的
 * <clinit>方法在多线程环境下被正确的加锁同步，也就是说如果多个线程同时去进行“类的初始化”，那么只有一个线程会去执行类的<clinit>方法，其他的线程
 * 都要阻塞等待，直到这个线程执行完<clinit>方法。然后执行完<clinit>方法后，其他线程唤醒，但是不会再进入<clinit>方法。也就是说同一个加载器下，
 * 一个类型只会初始化一次。
 *
 * 那么回到这个代码中，这里的静态变量的赋值操作进行编译之后实际上就是一个<clinit>代码，当我们执行getInstance方法的时候，会导致SingletonClassInstance
 * 类的加载，类加载的最后会执行类的初始化，但是即使在多线程情况下，这个类的初始化的<clinit>代码也只会被执行一次，所以他只会有一个实例。
 *
 * @description 单例模式——静态内部类（线程安全，调用效率高，可以延时加载）
 * @author: muse
 */
public class SingletonDemo4 {
    private SingletonDemo4(){
        System.out.println("SingletonDemo4");
    }

    /** 静态内部类 */
    private static class SingletonClassInstance {
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    /** 只有在第一次调用时，才会被创建，可以认为是懒加载的升级版本 */
    public static SingletonDemo4 getInstance(){
        return SingletonClassInstance.instance;
    }

    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        SingletonDemo4.getInstance();
        SingletonDemo4.getInstance();
    }
}
