package com.xtt.dp.observer;

/**
 * 应用类
 * Created by zhaoteng on 2017/7/30.
 */
public class MyApp {

    public static void main(String[] args) {

        System.out.println("Enter Text: ");

        EventSource eventSource = new EventSource();

        eventSource.addObserver(new EventObserver());

        new Thread(eventSource).start();

    }

}
