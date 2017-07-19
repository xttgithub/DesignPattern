package com.xtt.dp.singleton;

/**
 * 单例模式-懒汉式
 * Created by zhaoteng on 2017/7/19.
 */
public class Singleton5 {
    private static Singleton5 instance = null;

    //构造函数
    private Singleton5(){}

    public static Singleton5 getInstance(){

        if(null == instance){
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }

        return instance;
    }

    /**
     * 其实这种写法跟 Singleton3 一样是线程不安全的，当一个线程还没有实例化 Singleton5 时，
     * 另一个线程执行到 if(null == instance) 这个判断语句时就会进入if语句，虽然加了锁，
     * 但是等到第一个线程执行完 instance=new Singleton5() 跳出这个锁时，
     * 另一个进入if语句的线程同样会实例化另外一个 Singleton5 对象，线程不安全的原理和 Singleton3 类似，
     *
     * 因此这种改进方式并不可行，该写法不可用
     *
     * 所以经过大神们的不断探索和研究，写出了懒汉式的双重校验锁。
     *
     */
}
