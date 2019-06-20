package com.kevin.designpattern.headfirst.decorator.decorator;

import com.kevin.designpattern.headfirst.decorator.beverage.Beverage;

/**
 *   豆浆
 *
 * @author lihongmin
 * @date 2018/9/2 3:11
 */
public class Soy extends CondimentDecorator {

    private static final double COST = 3.4;

    Beverage beverage;

    public Soy(Beverage beverage) {

        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 委托的形式得到描述
        final String description = beverage.getDescription();
        String result = description + ", 得到委托描述后， 我又在里面加了些豆浆（装饰）！";
        return result;
    }

    @Override
    public double cost() {
        System.out.println("我加上了Soy的钱！");
        return beverage.cost() + COST;
    }
}
