package com.xtt.dp.observer;

/**
 * 观察者接口
 * Created by zhaoteng on 2017/7/30.
 */
public interface IObserver {

    void update(Subject subject, Object arg);

}
