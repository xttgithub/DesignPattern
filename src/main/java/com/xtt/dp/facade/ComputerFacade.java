package com.xtt.dp.facade;

import com.xtt.dp.facade.complex.CPU;
import com.xtt.dp.facade.complex.HardDriver;
import com.xtt.dp.facade.complex.Memory;

/**
 * 计算机外观类
 * Created by zhaoteng on 2017/7/30.
 */
public class ComputerFacade {
    private static final int BOOT_ADDRESS = 0;
    private static final int BOOT_SECTOR = 2;
    private static final int SECTOR_SIZE = 10;

    private CPU processor;
    private HardDriver hd;
    private Memory ram;

    public ComputerFacade(){
        processor = new CPU();
        hd = new HardDriver();
        ram = new Memory();
    }

    public void start(){
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR,SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }


}
