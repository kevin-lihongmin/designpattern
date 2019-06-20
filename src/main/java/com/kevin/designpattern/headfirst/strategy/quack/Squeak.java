package com.kevin.designpattern.headfirst.strategy.quack;

/**
 *
 * @author lihongmin
 * @date 2018/9/1 19:18
 */
public class Squeak implements QuackBehivior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
