package com.xtt.dp.observer;

import java.util.Observable;
import java.util.Scanner;

/**
 * 观察目标类
 * Created by zhaoteng on 2017/7/30.
 */
public class EventSource extends Observable implements Runnable {

    @Override
    public void run() {

        while (true){
            String response = new Scanner(System.in).nextLine();
            setChanged();
            notifyObservers(response);
        }

    }
}
