package com.kevin.designpattern.headfirst.strategy.duck;

import com.kevin.designpattern.headfirst.strategy.fly.FlyBehavior;
import com.kevin.designpattern.headfirst.strategy.quack.QuackBehivior;

/**
 *
 * @author lihongmin
 * @date 2018/9/1 19:03
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehivior quackBehivior;

    public abstract void display();

    /**
     *  鸭子飞行行为，委托给{@link FlyBehavior}
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     *  鸭子的叫行为，委托给{@link QuackBehivior}
     */
    public void performQuack() {
        quackBehivior.quack();
    }

    /**
     *  鸭子的游泳行为没有差异性，不需要委托
     */
    public void swim() {
        System.out.println("我是直接实现游泳的哦！");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehivior(QuackBehivior quackBehivior) {
        this.quackBehivior = quackBehivior;
    }
}
