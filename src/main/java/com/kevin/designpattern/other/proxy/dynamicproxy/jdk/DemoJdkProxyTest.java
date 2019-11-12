package com.kevin.designpattern.other.proxy.dynamicproxy.jdk;

import com.kevin.designpattern.other.proxy.DemoService;
import com.kevin.designpattern.other.proxy.DemoServiceImpl;

/**
 *  测试 jdk 动态代理
 *
 *  方法入参为：["我是jdk参数！"]
 * ------------------
 * 我执行完成了任务!!!
 * ------------------
 * 方法出参为：ok
 *
 * @author kevin
 * @date 2019/11/12 11:29
 * @since 1.0.0
 */
public class DemoJdkProxyTest {

    public static void main(String[] args) {
        DemoServiceImpl demoService = new DemoServiceImpl();
        DemoService proxy = (DemoService) new DemoJdkProxy(demoService).createProxy();
        proxy.doSomething("我是jdk参数！");
    }
}
