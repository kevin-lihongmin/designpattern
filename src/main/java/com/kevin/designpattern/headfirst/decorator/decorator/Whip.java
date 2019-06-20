package com.kevin.designpattern.headfirst.decorator.decorator;

import com.kevin.designpattern.headfirst.decorator.beverage.Beverage;

public class Whip extends CondimentDecorator {

    private static final double COST = 13.7;

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 委托的形式得到描述
        final String description = beverage.getDescription();
        String result = description + ", 得到委托描述后， 我又在里面加了些奶泡（装饰）！";
        return result;
    }

    @Override
    public double cost() {
        System.out.println("在装饰前时候，我加上了Whip(奶泡)的钱！");
        return beverage.cost() + COST;
    }
}
