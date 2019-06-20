package com.kevin.designpattern.headfirst.decorator;

import com.kevin.designpattern.headfirst.decorator.beverage.Beverage;
import com.kevin.designpattern.headfirst.decorator.beverage.DarkRoast;
import com.kevin.designpattern.headfirst.decorator.beverage.Espresso;
import com.kevin.designpattern.headfirst.decorator.beverage.HouseBlend;
import com.kevin.designpattern.headfirst.decorator.decorator.Mocha;
import com.kevin.designpattern.headfirst.decorator.decorator.Soy;
import com.kevin.designpattern.headfirst.decorator.decorator.Whip;

/**
 *   测试装饰者模式
 *
 * 我单独点了一杯Espresso，什么都不加先尝尝！
 * 我是Espresso Espresso饮料哦！ , 花了我1.99 钱
 * ---------------------------------------------------------------------------------------------------
 * 我在点一杯DarkRoast, 但是需要double Mocha，还要加一份Whip，这样比较美味吧！
 * 在装饰前时候，我加上了Whip(奶泡)的钱！
 * 我现在的价钱是委托之前的，加上Mocha的钱了，切记！
 * 我现在的价钱是委托之前的，加上Mocha的钱了，切记！
 * 我的 DarkRoast 哦！, 得到委托描述后， 我又在里面加了些摩卡（装饰）！, 得到委托描述后， 我又在里面加了些摩卡（装饰）！, 得到委托描述后， 我又在里面加了些奶泡（装饰）！ , 花了我44.3 钱
 * ---------------------------------------------------------------------------------------------------
 * 我再点一个HouseBlend咖啡，里面多加几样调味品吧，一样来一点，哈哈哈！
 * 我加上了Soy的钱！
 * 在装饰前时候，我加上了Whip(奶泡)的钱！
 * 我现在的价钱是委托之前的，加上Mocha的钱了，切记！
 * 我的 HouseBlend 哦！, 得到委托描述后， 我又在里面加了些摩卡（装饰）！, 得到委托描述后， 我又在里面加了些奶泡（装饰）！, 得到委托描述后， 我又在里面加了些豆浆（装饰）！ , 花了我31.49 钱
 *
 * @author lihongmin
 * @date 2018/9/1 19:42
 */
public class TestDecorator {

    public static void main(String[] args) {
        System.out.println("我单独点了一杯Espresso，什么都不加先尝尝！");
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " , 花了我" + beverage.cost() + " 钱");

        System.out.println("---------------------------------------------------------------------------------------------------");

        System.out.println("我在点一杯DarkRoast, 但是需要double Mocha，还要加一份Whip，这样比较美味吧！");
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " , 花了我" + beverage1.cost() + " 钱");

        System.out.println("---------------------------------------------------------------------------------------------------");

        System.out.println("我再点一个HouseBlend咖啡，里面多加几样调味品吧，一样来一点，哈哈哈！");
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " , 花了我" + beverage2.cost() + " 钱");
    }
}
