package com.kevin.designpattern.headfirst.adapter.news;

/**
 *   火鸡的实现
 *
 * @author lihongmin
 * @date 2018/9/7 22:41
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    @Override
    public void flying() {
        System.out.println("I am flying a short diatance !");
    }
}
