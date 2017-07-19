package com.xtt.dp.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by zhaoteng on 2017/7/19.
 */
public class Singleton6Test {
    @Test
    public void getInstance() throws Exception {
        //获取第一个实例
        Singleton6 s1 = Singleton6.getInstance();

        //测试拿到第二个实例
        Class c = Singleton6.class;
        Constructor[] constructors = c.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        Singleton6 s2 = (Singleton6) constructor.newInstance(null);

        System.out.println(s1 + "/" + s2);
        System.out.println(s1 == s2);
    }
}