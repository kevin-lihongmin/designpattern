package com.kevin.designpattern.headfirst.observer.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *  事件触发模拟
 *
 *  我受到了一个事件：我发布了事件！！！
 *  我执行完毕了！！！
 *
 * @author lihongmin
 * @date 2019/11/3 20:35
 */
@Controller
public class OrderEventController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @GetMapping("publishOrderEvent")
    public String publishOrderEvent() {
        applicationContext.publishEvent(new OrderEvent("我发布了事件！！！"));
        System.out.println("我执行完毕了！！！");
        return "发送事件了！";
    }
}
