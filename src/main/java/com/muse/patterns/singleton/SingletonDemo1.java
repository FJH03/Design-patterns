package com.muse.patterns.singleton;

/**
 * @description 单例模式——饿汉式(线程安全，调用效率高，但是不能延时加载)
 * @author: muse
 */
public class SingletonDemo1 {

    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1(){}

    public static SingletonDemo1 getInstance(){
        return instance;
    }
}
