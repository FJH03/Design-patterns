package com.example.singleton;

/**
 * @description 单例模式——枚举类
 * @author: muse
 */
public enum SingletonDemo5 {

    // 枚举元素本身就是单例
    INSTANCE;

    // 添加自己需要的操作，直接通过SingletonDemo5.INSTANCE.doSomething()的方式调用即可。
    public void doSomething() {
        System.out.println("doSomething");
    }
}

class Test {
    public static void main(String[] args) {
        SingletonDemo5.INSTANCE.doSomething();
    }
}

