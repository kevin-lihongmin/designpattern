package com.kevin.designpattern.other.proxy.staticproxy;

import com.kevin.designpattern.other.proxy.DemoService;
import com.kevin.designpattern.other.proxy.DemoServiceImpl;

/**
 *  静态代理
 * @author kevin
 * @date 2019/11/12 10:48
 * @since 1.0.0
 */
public class DemoProxy implements DemoService {

    @Override
    public String doSomething(String arg) {
        System.out.println("方法入参为：" + arg);
        System.out.println("------------------");
        // 调用正在的方法
        String result = new DemoServiceImpl().doSomething(arg);

        System.out.println("------------------");
        System.out.println("方法出参为：" + result);
        return result;
    }
}
