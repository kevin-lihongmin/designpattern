package com.kevin.designpattern.headfirst.decorator.beverage;

/**
 *  HouseBlend饮料
 * @author lihongmin
 * @date 2018/9/2 2:42
 */
public class HouseBlend extends Beverage {

    private static final double COST = 0.89;

    public HouseBlend() {
        description = "我的 HouseBlend 哦！";
    }

    @Override
    public double cost() {
        return COST;
    }
}
