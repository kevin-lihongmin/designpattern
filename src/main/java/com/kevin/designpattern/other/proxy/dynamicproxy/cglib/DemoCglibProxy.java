package com.kevin.designpattern.other.proxy.dynamicproxy.cglib;


import com.alibaba.fastjson.JSON;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *  cglib动态代理实现
 * @author kevin
 * @date 2019/11/12 13:21
 * @since 1.0.0
 */
public class DemoCglibProxy implements MethodInterceptor {

    /**
     *  被代理对象
     */
    private Object target;

    /**
     *  cglib创建代理对象
     * @param target 被代理对象
     */
    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法入参为：" + JSON.toJSONString(objects));
        System.out.println("------------------");
        // 调用正在的方法
        Object result = methodProxy.invokeSuper(target, objects);

        System.out.println("------------------");
        System.out.println("方法出参为：" + result);
        return result;
    }
}
