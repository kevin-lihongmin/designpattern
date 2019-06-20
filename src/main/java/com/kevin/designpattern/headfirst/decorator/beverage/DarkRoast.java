package com.kevin.designpattern.headfirst.decorator.beverage;

/**
 *  重炒
 *
 * @author lihongmin
 * @date 2018/9/2 3:18
 */
public class DarkRoast extends Beverage {

    private static final double COST = 3.6;

    public DarkRoast() {
        description = "我的 DarkRoast 哦！";
    }

    @Override
    public double cost() {
        return COST;
    }
}
