package com.kevin.designpattern.headfirst.factory.factorymethod;

import com.kevin.designpattern.headfirst.factory.factorymethod.factory.*;

/**
 *   测试工厂方法
 *
 *      在纽约开了一个披萨分店！
 *      有客人点了意大利香肠披萨！
 *      初始化：我是纽约意大利香肠披萨！
 *      披萨的准备环节
 *      披萨的烘烤环节
 *      披萨的切片环节
 *      披萨的装箱环节
 *      客人的披萨做好了，上菜， 流口水了！！！
 * --------------------------------------------------------------------
 *      在芝加哥开了一个披萨分店！
 *      有客人点了蔬菜披萨！
 *      初始化：我是芝加哥蔬菜披萨！
 *      披萨的准备环节
 *      披萨的烘烤环节
 *      披萨的切片环节
 *      披萨的装箱环节
 *      客人的披萨做好了，上菜， 流口水了！！！
 * --------------------------------------------------------------------
 *      在加州开了一个披萨分店！
 *      有客人点了芝士披萨！
 *      初始化：我是加州芝士披萨！
 *      披萨的准备环节
 *      披萨的烘烤环节
 *      披萨的切片环节
 *      披萨的装箱环节
 *      客人的披萨做好了，上菜， 流口水了！！！
 *  ==，又有客人点了CLAM披萨！
 *      初始化：我是加州海鲜披萨！
 *      披萨的准备环节
 *      披萨的烘烤环节
 *      披萨的切片环节
 *      披萨的装箱环节
 *      客人的披萨做好了，上菜， 流口水了！！！
 *
 * @author lihongmin
 * @date 2018/9/2 15:59
 */
public class TestFactoryMethod {

    public static void main(String[] args) {

        System.out.println("在纽约开了一个披萨分店！");
        PizzaStore nYStore = new NYStyleStore();
        System.out.println("有客人点了意大利香肠披萨！");
        nYStore.orderPizza(PizzaEnum.PEPPERONI_PIZZA);

        System.out.println("--------------------------------------------------------------------");

        System.out.println("在芝加哥开了一个披萨分店！");
        PizzaStore chicagoStore = new ChicagoStyleStore();
        System.out.println("有客人点了蔬菜披萨！");
        chicagoStore.orderPizza(PizzaEnum.VEGGIE_PIZZA);

        System.out.println("--------------------------------------------------------------------");

        System.out.println("在加州开了一个披萨分店！");
        PizzaStore californiaStore = new CaliforniaStyleStore();
        System.out.println("有客人点了芝士披萨！");
        californiaStore.orderPizza(PizzaEnum.CHEESE_PIZZA);
        System.out.println("==，又有客人点了CLAM披萨！");
        californiaStore.orderPizza(PizzaEnum.CLAM_PIZZA);
    }
}
