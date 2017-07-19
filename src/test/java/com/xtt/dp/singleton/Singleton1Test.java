package com.xtt.dp.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by zhaoteng on 2017/7/19.
 */
public class Singleton1Test {

    @Test
    public void getInstance() throws Exception {
        //获取第一个实例
        Singleton1 s1 = Singleton1.getInstance();

        //测试拿到第二个实例
        Class c = Singleton1.class;
        Constructor[] constructors = c.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        Singleton1 s2 = (Singleton1) constructor.newInstance(null);

        System.out.println(s1 + "/" + s2);
        System.out.println(s1 == s2);

    }

}