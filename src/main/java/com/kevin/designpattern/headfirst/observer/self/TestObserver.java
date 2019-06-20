package com.kevin.designpattern.headfirst.observer.self;

import com.kevin.designpattern.headfirst.observer.self.pub.WeatherData;
import com.kevin.designpattern.headfirst.observer.self.sub.CurrentConditionsDisplay;

/**
 *   模拟变更
 *
 *      初始化了天气实现！
 *      初始化了订阅者列表容器！
 *      初始化了需要订阅的其中一个气象显示板（我只是其中之一）！
 *      我将自己注册到观察者通知列表！
 *      有一个订阅者订阅了我们的变更通知！
 *      气象变更了
 *      收到数据变化了，先赋值再通知吧！
 *      有主题变更了，我要安装注册列表挨个通知他们，真麻烦！
 *      哈哈，订阅了那么久，我收到变更通知了！
 *      现在变更布告板了， 现在的温度为： 20.5 ,现在的湿度为：10.5
 *
 * @author lihongmin
 * @date 2018/9/1 15:28
 */
public class TestObserver {

    public static void main(String[] args) {
        System.out.println("初始化了天气实现！");
        WeatherData weatherData = new WeatherData();

        System.out.println("初始化了需要订阅的其中一个气象显示板（我只是其中之一）！");
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        System.out.println(" 气象变更了");
        weatherData.setChangeParam(20.5F, 10.5F, 24);

    }
}
