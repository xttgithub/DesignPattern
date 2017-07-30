package com.xtt.dp.observer;

/**
 * 观察者类
 * Created by zhaoteng on 2017/7/30.
 */
public class ConcreteObserverA implements IObserver {

    @Override
    public void update(Subject subject, Object arg) {
        System.out.println("ConcreteObserverA received msg: " + arg + " from " + subject);
    }

}
