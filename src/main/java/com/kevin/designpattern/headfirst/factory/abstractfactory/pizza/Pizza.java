package com.kevin.designpattern.headfirst.factory.abstractfactory.pizza;

import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.Pepperoni;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.cheese.Cheese;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.clams.Clams;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.dough.Dough;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.sauce.Sauce;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.veggies.Veggies;

/**
 *   披萨的顶层抽象
 *
 * @author lihongmin
 * @date 2018/9/2 16:06
 */
public abstract class Pizza {

    /**
     *  披萨名称
     */
    String pizzaName;

    /**
     *  面团类型
     */
    Dough dough;

    /**
     *  酱料类型
     */
    Sauce sauce;

    /**
     *  蔬菜列表
     */
    Veggies[] veggies;

    /**
     *  芝士
     */
    Cheese cheese;

    /**
     *  Pepperoni
     */
    Pepperoni pepperoni;

    /**
     *  clams
     */
    Clams clams;

    public abstract void say();

    public Pizza() {
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    /**
     *  抽象为子类实现，并调用工厂进行设置
     */
    abstract void prepare();

    public void bake() {
        System.out.println("披萨的烘烤环节");
    }

    public void cut() {
        System.out.println("披萨的切片环节");
    }

    public void box() {
        System.out.println("披萨的装箱环节");
    }

}
