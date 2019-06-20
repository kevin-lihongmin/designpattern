package com.kevin.designpattern.headfirst.observer.jdk;

import com.kevin.designpattern.headfirst.observer.jdk.pub.WeatherData;
import com.kevin.designpattern.headfirst.observer.jdk.sub.CurrentConditionsDisplay;

/**
 *   Jdk的观察者模式 模拟变更
 *
 *      主题变更了，我需要new一个对象 (设置变更的温度湿度等...)!
 *      数据变化，设置了值，可以让观察者以拉取的方式获取数据哦!
 *      准备好了，通知变更，哈哈哈!
 *      将Observable的变更标示更改了，并通知观察者来拉取数据了!
 *      收到数据变更了!
 *      原来是我订阅的WeatherData数据，我还订阅了很多种类型的数据哦!
 *      观察者拉取了温度数据!
 *      观察者拉取了湿度数据!
 *      拿到数据了，通知变更显示了!
 *      现在变更布告板了， 现在的温度为： 20.5 ,现在的湿度为：10.5
 *
 * @author lihongmin
 * @date 2018/9/1 16:03
 *
 * @see java.util.Observer
 * @see java.util.Observable
 */
public class TestJdkObserver {

    public static void main(String[] args) {

        System.out.println("主题变更了，我需要new一个对象 (设置变更的温度湿度等...)! ");
        WeatherData weatherData = new WeatherData(20.5F, 10.5F);

        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        System.out.println("准备好了，通知变更，哈哈哈! ");
        weatherData.onChanged();
    }
}
