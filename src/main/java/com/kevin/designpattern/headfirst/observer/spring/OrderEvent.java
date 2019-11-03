package com.kevin.designpattern.headfirst.observer.spring;

import org.springframework.context.ApplicationEvent;


/**
 *  定义事件类型
 *
 * @author lihongmin
 * @date 2019/11/3 20:30
 */
public class OrderEvent extends ApplicationEvent {

    public OrderEvent(Object source) {
        super(source);
    }
}
