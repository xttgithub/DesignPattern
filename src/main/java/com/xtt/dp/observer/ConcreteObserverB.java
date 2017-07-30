package com.xtt.dp.observer;

/**
 * 观察者类
 * Created by zhaoteng on 2017/7/30.
 */
public class ConcreteObserverB implements IObserver {

    @Override
    public void update(Subject subject, Object arg) {
        System.out.println("ConcreteObserverB received msg: " + arg + " from " + subject);
    }
}
