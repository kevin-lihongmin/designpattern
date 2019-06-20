package com.kevin.designpattern.headfirst.factory.abstractfactory;

import com.kevin.designpattern.headfirst.factory.abstractfactory.pizza.Pizza;
import com.kevin.designpattern.headfirst.factory.abstractfactory.pizza.PizzaEnum;
import com.kevin.designpattern.headfirst.factory.abstractfactory.store.NYPizzaStore;
import com.kevin.designpattern.headfirst.factory.abstractfactory.store.PizzaStore;

/**
 *   测试抽象工厂
 *
 * 抽象工厂创建好，先开一家纽约披萨店！
 * 有客人下单要意大利香肠披萨了！
 * 我是Pepperoni披萨，利用工厂传入的方式创建好了！
 * 披萨的烘烤环节
 * 披萨的切片环节
 * 披萨的装箱环节
 * 客人的披萨做好了，上菜， 流口水了！！！
 *
 * @author lihongmin
 * @date 2018/9/2 22:13
 *
 * @see PizzaStore
 * @see Pizza ;
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        System.out.println("抽象工厂创建好，先开一家纽约披萨店！");
        PizzaStore nYPizzaStore = new NYPizzaStore();
        System.out.println("有客人下单要意大利香肠披萨了！");
        nYPizzaStore.orderPizza(PizzaEnum.PEPPERONI_PIZZA);

    }
}
