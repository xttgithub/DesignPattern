package com.xtt.dp.singleton;

/**
 * 单例模式-懒汉式
 * Created by zhaoteng on 2017/7/19.
 */
public class Singleton4 {
    private static Singleton4 instance = null;

    //构造函数
    private Singleton4(){}

    public static synchronized Singleton4 getInstance(){
        if(null == instance){
            instance = new Singleton4();
        }

        return instance;
    }

    /**
     * 缺点：效率太低了，每个线程在想要获得类的实例时候，执行getInstance()方法都要进行同步。
     *      而其实这个方法只执行一次实例化代码就可以，后面的线程想获得该类实例，直接return就行了。
     *
     *      不推荐用
     *
     *      方法进行同步效率太低，要改进
     *
     */


}
