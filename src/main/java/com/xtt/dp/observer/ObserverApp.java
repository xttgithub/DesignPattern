package com.xtt.dp.observer;

/**
 * 应用类
 * Created by zhaoteng on 2017/7/30.
 */
public class ObserverApp {

    public static void main(String[] args) {

        Subject sub1 = new Subject();
        sub1.addObserver(new ConcreteObserverA());
        sub1.addObserver(new ConcreteObserverB());

        sub1.setChanged();
        sub1.notifyObservers("第一目标对象通知观察者");

        Subject sub2 = new Subject();
        sub2.addObserver(new ConcreteObserverB());

        sub2.setChanged();
        sub2.notifyObservers("第二目标对象通知观察者");

    }
}
