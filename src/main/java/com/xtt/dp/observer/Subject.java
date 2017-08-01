package com.xtt.dp.observer;

import java.util.Vector;

/**
 * 观察者目标类
 * Created by zhaoteng on 2017/7/30.
 */
public class Subject {

    private boolean changed =  false;
    private Vector obs;

    public Subject(){
        obs = new Vector();
    }

    public synchronized void addObserver(IObserver observer){

        if(null == observer){
            throw new NullPointerException();
        }
        if(!obs.contains(observer)){
            obs.addElement(observer);
        }

    }

    public synchronized void deleteObserver(IObserver observer){
        obs.removeElement(observer);
    }

    public synchronized void deleteObservers(){
        obs.removeAllElements();
    }


    public void notifyObservers(Object arg){

        Object[] arrLocal;

        synchronized (this){

            if(!changed)
                return;
            arrLocal = obs.toArray();
            clearChanged();
        }

        for(int i = arrLocal.length - 1; i >= 0; i--){
            ((IObserver)arrLocal[i]).update(this, arg);
        }

    }

    public synchronized void clearChanged(){
        changed = false;
    }

    public synchronized void setChanged(){
        changed =  true;
    }

    public synchronized boolean hasChanged(){
        return changed;
    }

    public synchronized int countObservers(){
        return obs.size();
    }
}
