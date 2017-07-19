package com.xtt.dp.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by zhaoteng on 2017/7/19.
 */
public class SingletonEnumTest {
    @Test
    public void getInstance() throws Exception {
        //获取第一个实例
        SingletonEnum s1 = SingletonEnum.instance;

        //测试拿到第二个实例
        Class c = SingletonEnum.class;
        Constructor[] constructors = c.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        SingletonEnum s2 = (SingletonEnum) constructor.newInstance(null);

        System.out.println(s1 + "/" + s2);
        System.out.println(s1 == s2);
    }
}