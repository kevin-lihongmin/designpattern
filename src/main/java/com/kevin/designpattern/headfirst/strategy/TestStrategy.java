package com.kevin.designpattern.headfirst.strategy;


import com.kevin.designpattern.headfirst.strategy.duck.MallardDuck;
import com.kevin.designpattern.headfirst.strategy.fly.FlyNoWay;

/**
 *   测试策略模式
 *
 *      我是MallardDuck，下面的默认的飞行和叫行为 ！
 *      我会飞！！！
 *      quack!
 *      我切换了飞行方式！
 *      我不会飞，呜呜呜！！！
 *
 * @author lihongmin
 * @date 2018/9/1 18:59
 */
public class TestStrategy {

    public static void main(String[] args) {
        System.out.println("我是MallardDuck，下面的默认的飞行和叫行为 ！");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        // 切换行为
        System.out.println("我切换了飞行方式！");
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performFly();
    }
}
