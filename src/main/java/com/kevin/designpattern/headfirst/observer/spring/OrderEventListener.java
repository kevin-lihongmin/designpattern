package com.kevin.designpattern.headfirst.observer.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


/**
 *  订单事件监听
 * @author lihongmin
 * @date 2019/11/3 20:33
 */
@Component
public class OrderEventListener implements ApplicationListener<OrderEvent> {

    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我受到了一个事件：" + orderEvent.getSource());
    }
}
