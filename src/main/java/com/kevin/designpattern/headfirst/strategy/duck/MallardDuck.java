package com.kevin.designpattern.headfirst.strategy.duck;

import com.kevin.designpattern.headfirst.strategy.fly.FlyWithWings;
import com.kevin.designpattern.headfirst.strategy.quack.Quack;

/**
 *  每一种鸭子的实现
 *
 * @author lihongmin
 * @date 2018/9/1 19:26
 *
 * @see Duck
 */
public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am Mallard Duck！");
    }

    public MallardDuck() {
        // 组合方式实现每一种鸭子行为
        flyBehavior = new FlyWithWings();
        quackBehivior = new Quack();
    }


}
