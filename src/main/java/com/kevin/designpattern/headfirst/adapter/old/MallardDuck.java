package com.kevin.designpattern.headfirst.adapter.old;

/**
 *   绿头鸭
 *
 * @author lihongmin
 * @date 2018/9/7 22:37
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying !");
    }

}
