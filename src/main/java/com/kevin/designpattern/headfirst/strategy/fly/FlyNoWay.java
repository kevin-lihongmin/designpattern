package com.kevin.designpattern.headfirst.strategy.fly;

/**
 *   不会飞的鸭子实现
 *
 * @author lihongmin
 * @date 2018/9/1 19:10
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我不会飞，呜呜呜！！！");
    }
}
