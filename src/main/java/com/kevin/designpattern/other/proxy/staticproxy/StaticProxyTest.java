package com.kevin.designpattern.other.proxy.staticproxy;

/**
 *  静态代理测试方法
 *
 * 方法入参为：我是参数！
 * ------------------
 * 我执行完成了任务!!!
 * ------------------
 * 方法出参为：ok
 *
 * @author kevin
 * @date 2019/11/12 10:52
 * @since 1.0.0
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        // 当前Main函数的类就是调用者，没有DemoService的引用，却实现了调用（进行了隔离）
        new DemoProxy().doSomething("我是参数！");
    }
}
