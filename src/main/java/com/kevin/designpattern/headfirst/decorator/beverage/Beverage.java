package com.kevin.designpattern.headfirst.decorator.beverage;

/**
 *   装饰顶层的抽象(饮料)
 *
 * @author lihongmin
 * @date 2018/9/2 2:29
 */
public abstract class Beverage {

    String description = "我还不知道什么饮料类型，呵呵！";

    public String getDescription() {

        return description;
    }

    /**
     *  饮料当前的总价钱
     *
     * @return 装饰后钱的总和
     */
    public abstract double cost();
}
