package com.kevin.designpattern.headfirst.observer.self.sub;

/**
 *   观察者对象定义
 *
 * @author lihongmin
 * @date 2018/9/1 14:51
 */
public interface Observer {

    /**
     *  订阅变更通知定义，当发生变更时会用参数的方式通知（下发具体实现）
     *
     * @param temperature   变更的温度
     * @param humidity      变更的湿度
     * @param pressure      变更的。。
     */
    void update(float temperature, float humidity, float pressure);
}
