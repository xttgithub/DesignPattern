package com.xtt.dp.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者类
 * Created by zhaoteng on 2017/7/30.
 */
public class EventObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Received response: " + arg);
    }
}
