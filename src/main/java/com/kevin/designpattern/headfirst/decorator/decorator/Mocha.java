package com.kevin.designpattern.headfirst.decorator.decorator;

import com.kevin.designpattern.headfirst.decorator.beverage.Beverage;

/**
 *   摩卡
 *
 * @author lihongmin
 * @date 2018/9/2 2:48
 */
public class Mocha extends CondimentDecorator {

    private static final double COST = 13.5;

    /**
     *  被装饰者
     */
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 委托的形式得到描述
        final String description = beverage.getDescription();
        String result = description + ", 得到委托描述后， 我又在里面加了些摩卡（装饰）！";
        return result;
    }

    @Override
    public double cost() {
        System.out.println("我现在的价钱是委托之前的，加上Mocha的钱了，切记！");
        return beverage.cost() + COST;
    }

}
