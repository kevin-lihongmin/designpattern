package com.kevin.designpattern.headfirst.observer.self.pub;

import com.kevin.designpattern.headfirst.observer.self.sub.Observer;

import java.util.ArrayList;

/**
 *   观察者模式的实现
 * @author lihongmin
 * @date 2018/9/1 15:08
 */
public class WeatherData implements Subject {

    /**
     *  所有的观察者
     */
    private ArrayList<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
        System.out.println("初始化了订阅者列表容器！");
    }

    @Override
    public boolean registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("有一个订阅者订阅了我们的变更通知！");
        return true;
    }

    @Override
    public boolean removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            System.out.println("有一个订阅者取消订阅了！");
            observers.remove(observer);
            return true;
        }
        return false;
    }

    @Override
    public void notifyObservers() {
        System.out.println("有主题变更了，我要安装注册列表挨个通知他们，真麻烦！");
        // 便利，并变更通知
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void onChanged() {
        notifyObservers();
    }

    public void setChangeParam(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        System.out.println("收到数据变化了，先赋值再通知吧！");
        onChanged();
    }
}
