package com.kevin.designpattern.headfirst.strategy.quack;

/**
 *
 *
 * @author lihongmin
 * @date 2018/9/1 19:15
 */
public class Quack implements QuackBehivior {
    @Override
    public void quack() {
        System.out.println("quack!");
    }
}
