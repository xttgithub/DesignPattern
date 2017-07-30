package com.xtt.dp.facade.complex;

/**
 * CPU类
 * Created by zhaoteng on 2017/7/30.
 */
public class CPU {
    public void freeze() {
        System.out.println("处理器加锁");
    }
    public void jump(long position) {
        System.out.println("跳转到启动地址：" + position);
    }
    public void execute() {
        System.out.println("开始处理");
        System.out.println();
    }
}
