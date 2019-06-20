package com.kevin.designpattern.gupao.singleton;

/**
 *   饿汉式单例模式
 *
 *   优点：对用户体验好
 *   缺点：可能造成资源的浪费
 *
 * @author lihongmin
 * @date 2018/9/8 13:02
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

}

