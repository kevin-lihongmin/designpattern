package com.kevin.designpattern.other.proxy.dynamicproxy.cglib;

import com.kevin.designpattern.other.proxy.DemoService;
import com.kevin.designpattern.other.proxy.DemoServiceImpl;

/**
 *  cglib动态代理测试
 *
 *  方法入参为：["我是cglib参数！"]
 * ------------------
 * 我执行完成了任务!!!
 * ------------------
 * 方法出参为：ok
 *
 * @author kevin
 * @date 2019/11/12 13:29
 * @since 1.0.0
 */
public class DemoCglibProxyTest {
    public static void main(String[] args) {
        DemoServiceImpl target = new DemoServiceImpl();
        DemoService proxy = (DemoService) new DemoCglibProxy().getInstance(target);
        proxy.doSomething("我是cglib参数！");
    }
}
