package com.xtt.dp.facade.complex;

/**
 * 内存类
 * Created by zhaoteng on 2017/7/30.
 */
public class Memory {

    public void load(long position, byte[] data) {
        System.out.println("从内存加载数据：position=" + position + ",data={" + new String(data) + "}" );
    }
}
