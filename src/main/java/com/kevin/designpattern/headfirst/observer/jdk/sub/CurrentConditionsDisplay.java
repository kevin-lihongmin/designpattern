package com.kevin.designpattern.headfirst.observer.jdk.sub;


import com.kevin.designpattern.headfirst.observer.jdk.pub.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author lihongmin
 * @date 2018/9/1 16:13
 *
 * @see Observer
 * @see Observable
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    Observable observable;

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        // 将自己进行注册
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("现在变更布告板了， 现在的温度为： " + temperature + " ,现在的湿度为：" + humidity);
    }

    @Override
    public void update(Observable obs, Object arg) {
        System.out.println("收到数据变更了!");
        if (obs instanceof WeatherData) {
            System.out.println("原来是我订阅的WeatherData数据，我还订阅了很多种类型的数据哦!");
            WeatherData weatherData = WeatherData.class.cast(obs);
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();

            System.out.println("拿到数据了，通知变更显示了!");
            display();
        }
    }
}
