package com.xtt.dp.facade;

/**
 * 应用类
 * Created by zhaoteng on 2017/7/30.
 */
public class MyApp {

    public static void main(String[] args) {

        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquar();
        shapeFacade.drawCircle();

        /*ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();*/

    }

}
