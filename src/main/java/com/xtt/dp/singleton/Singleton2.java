package com.xtt.dp.singleton;

/**
 * 单例模式-饿汉式
 * Created by zhaoteng on 2017/7/19.
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    static {
        instance = new Singleton2();
    }

    //构造函数
    private Singleton2(){}

    public static Singleton2 getInstance(){
        return instance;
    }

    /**
     * 只是写法与 Singleton1 有点不同，都是在类初始化时创建对象的，
     * 它的优缺点和Singleton1一样，可以归为一种写法。
     *
     * 可用
     */

}
