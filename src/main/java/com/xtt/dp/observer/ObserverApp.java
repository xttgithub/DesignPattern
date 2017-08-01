package com.xtt.dp.observer;

/**
 * 应用类
 * Created by zhaoteng on 2017/7/30.
 */
public class ObserverApp {

    public static void main(String[] args) {

        Subject first = new Subject();
        first.addObserver(new ConcreteObserverA());
        first.addObserver(new ConcreteObserverB());

        first.setChanged();
        first.notifyObservers("第一目标对象通知观察者");

        Subject second = new Subject();
        second.addObserver(new ConcreteObserverB());

        second.setChanged();
        second.notifyObservers("第二目标对象通知观察者");

    }
}
