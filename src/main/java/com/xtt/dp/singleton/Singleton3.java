package com.xtt.dp.singleton;

/**
 * 单例模式-懒汉式
 * Created by zhaoteng on 2017/7/19.
 */
public class Singleton3 {

    private static Singleton3 instance = null;

    //构造函数
    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(null == instance){
            instance = new Singleton3();
        }

        return instance;
    }

    /**
     * 这种方式是在调用getInstance方法的时候才创建对象的，所以它比较懒因此被称为懒汉式。
     * 单例模式的懒汉式是存在线程安全问题的。
     *
     * 不可用
     *
     * 既然它存在问题，那么可能有解决这个问题的方法，那么究竟怎么解决呢？
     * 对这种问题可能很多人会想到加锁于是出现了下面这种写法。
     */
}
