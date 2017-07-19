package com.xtt.dp.singleton;

/**
 * 单例模式-枚举
 * Created by zhaoteng on 2017/7/19.
 */
public enum SingletonEnum {

    instance;

    private SingletonEnum(){}

    public void method(){

    }


    /**
     * 可以看到枚举的书写非常简单，访问也很简单在这里 SingletonEnum.instance 这里的 instance
     * 即为 SingletonEnum 类型的引用所以得到它就可以调用枚举中的方法了。
     *
     * 优点：不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
     *
     * 另外当我们使用反射机制时可能不能保证 Singleton1-7 实例的唯一性，
     * 而枚举始终可以保证唯一性，但是一般情况下很少遇到这种情况。
     * 参见test
     *
     * 注意：JDK1.5 之前的版本没有枚举。
     *
     * 极推荐使用
     *
     */

}
