package com.kevin.designpattern.headfirst.factory.simple;

import com.kevin.designpattern.headfirst.factory.simple.product.Pizza;
import com.kevin.designpattern.headfirst.factory.simple.simplefactory.PizzaEnum;
import com.kevin.designpattern.headfirst.factory.simple.simplefactory.SimplePizzaFactory;

/**
 *   测试简单工厂
 *
 *      简单披萨工厂运转了，开始生产披萨了！
 *      我是Veggie披萨，创建好了！
 *      披萨的准备环节
 *      披萨的烘烤环节
 *      披萨的切片环节
 *      披萨的装箱环节
 *      一份披萨制作完成了，完美！
 *
 * @author lihongmin
 * @date 2018/9/2 15:58
 */
public class TestSimpleFactory {

    public static void main(String[] args) {
        Pizza pizza = new SimplePizzaFactory<PizzaEnum>().createPizza(PizzaEnum.VEGGIE_PIZZA);
    }
}
