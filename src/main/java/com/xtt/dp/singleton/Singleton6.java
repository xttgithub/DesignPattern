package com.xtt.dp.singleton;

/**
 * 单例模式-双重校验锁
 * Created by zhaoteng on 2017/7/19.
 */
public class Singleton6 {
    private static Singleton6 instance = null;

    private Singleton6(){}

    public static Singleton6 getInstance(){

        if(null == instance){
            synchronized (Singleton6.class){
                if(null == instance){
                    instance = new Singleton6();
                }
            }
        }

        return instance;
    }

    /**
     *
     * Double-Check概念对于多线程开发者来说不会陌生，如代码中所示，
     * 我们进行了两次 if(null == instance) 检查，这样就可以保证线程安全了。
     * 这样，实例化代码只用执行一次，后面再次访问时，判断 if(null == instance)，直接return实例化对象。
     *
     * 优点：线程安全；延迟加载；效率较高。
     *
     * 推荐使用
     *
     */

}
