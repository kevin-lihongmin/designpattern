package com.kevin.designpattern.headfirst.decorator.beverage;

/**
 *  Espresso饮料
 *
 * @author lihongmin
 * @date 2018/9/2 2:39
 */
public class Espresso extends Beverage {

    private static final double COST = 1.99;

    public Espresso() {
        description = "我是Espresso Espresso饮料哦！";
    }

    @Override
    public double cost() {

        return COST;
    }
}
