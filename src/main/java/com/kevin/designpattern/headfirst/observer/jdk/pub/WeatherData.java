package com.kevin.designpattern.headfirst.observer.jdk.pub;


import java.util.Observable;

/**
 *
 * @author lihongmin
 * @date 2018/9/1 16:05
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public WeatherData(float temperature, float humidity) {
        System.out.println("数据变化，设置了值，可以让观察者以拉取的方式获取数据哦!");
        this.temperature = temperature;
        this.humidity = humidity;
    }

    /**
     *  变更时调用父类方法
     *  1、{@link Observable#setChanged()} 修改状态
     *  2、{@link Observable#notifyObservers()} 采用拉取的方式
     */
    public void onChanged() {
        // 调用父类Observable的方法
        System.out.println("将Observable的变更标示更改了，并通知观察者来拉取数据了!");
        setChanged();
        notifyObservers();
    }

    /**
     *  为观察者提供拉取{@link WeatherData#temperature}的方法
     *
     * @return 温度数据
     */
    public float getTemperature() {
        System.out.println("观察者拉取了温度数据!");
        return temperature;
    }

    /**
     *  为观察者提供拉取{@link WeatherData#humidity}的方法
     *
     * @return
     */
    public float getHumidity() {
        System.out.println("观察者拉取了湿度数据!");
        return humidity;
    }

    /**
     *  为观察者提供拉取{@link WeatherData#pressure}的方法
     *
     * @return
     */
    public float getPressure() {
        return pressure;
    }
}
