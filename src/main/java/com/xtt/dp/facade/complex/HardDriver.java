package com.xtt.dp.facade.complex;

/**
 * 硬盘类
 * Created by zhaoteng on 2017/7/30.
 */
public class HardDriver {

    public byte[] read(long lba, int size) {
        String str = "从硬盘读取数据：lba=" + lba + ",size=" + size;

        return str.getBytes();
    }
}
