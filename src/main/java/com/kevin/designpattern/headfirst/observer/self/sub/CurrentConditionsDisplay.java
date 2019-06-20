package com.kevin.designpattern.headfirst.observer.self.sub;

import com.kevin.designpattern.headfirst.observer.self.pub.Subject;

/**
 *   布告板实现
 *
 * @author lihongmin
 * @date 2018/9/1 15:22
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        // 初始化
        this.subject = subject;
        // 将自己注册到观察者通知列表
        System.out.println("我将自己注册到观察者通知列表！");
        subject.registerObserver(this);
    }

    @Override
    public void display() {

        System.out.println("现在变更布告板了， 现在的温度为： " + temperature + " ,现在的湿度为：" + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println("哈哈，订阅了那么久，我收到变更通知了！");
        display();
    }
}
