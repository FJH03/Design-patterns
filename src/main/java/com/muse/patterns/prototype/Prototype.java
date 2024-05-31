package com.muse.patterns.prototype;

/**
 * @description 原型模式（通过clone方法创建的Prototype对象不会执行构造方法）
 * @author: muse
 */
public class Prototype implements Cloneable {
    public static void main(String[] args) {
        System.out.println("【步骤1】开始执行Prototype类型的对象创建工作");
        Prototype prototype = new Prototype();

        /** 执行clone方法创建的Prototype对象 */
        System.out.println("【步骤2】开始执行clone操作");
        Prototype prototype1 = prototype.clone();
    }

    public Prototype() {
        System.out.println("-----Prototype的构造方法被执行了！-----");
    }

    @Override
    protected Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
