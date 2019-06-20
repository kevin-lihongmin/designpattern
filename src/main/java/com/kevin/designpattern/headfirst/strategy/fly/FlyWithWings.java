package com.kevin.designpattern.headfirst.strategy.fly;

/**
 *   会飞行鸭子的实现
 *
 * @author lihongmin
 * @date 2018/9/1 19:09
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 我会飞！！！");
    }
}
