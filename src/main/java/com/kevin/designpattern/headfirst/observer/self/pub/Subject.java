package com.kevin.designpattern.headfirst.observer.self.pub;

import com.kevin.designpattern.headfirst.observer.self.sub.Observer;

/**
 *   观察者模式的订阅接口
 *
 * @author lihongmin
 * @date 2018/9/1 14:45
 */
public interface Subject {

    /**
     *  订阅（注册观察）
     *
     * @param observer  观察者对象
     * @return 是否订阅成功
     */
    boolean registerObserver(Observer observer);

    /**
     *  退订（取消观察）
     *
     * @param observer  观察者对象
     * @return 是否取消成功
     */
    boolean removeObserver(Observer observer);

    /**
     *  观察变更的通知接口
     */
    void notifyObservers();
}
