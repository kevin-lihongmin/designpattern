package com.kevin.designpattern.other.proxy.dynamicproxy.jdk;

import com.alibaba.fastjson.JSON;
import com.kevin.designpattern.other.proxy.DemoServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DemoJdkProxy implements InvocationHandler {

    /**
     *  被代理对象
     */
    private Object target;

    /**
     *  有参数构造
     * @param target 需要执行的任务
     */
    public DemoJdkProxy(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        System.out.println("方法入参为：" + JSON.toJSONString(args));
        System.out.println("------------------");
        // 调用正在的方法
        Object result = method.invoke(target, args);

        System.out.println("------------------");
        System.out.println("方法出参为：" + result);
        return result;
    }

    /**
     *  创建代理对象
     * @return 代理对象
     */
    public Object createProxy() {
        return Proxy.newProxyInstance(DemoJdkProxy.class.getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
