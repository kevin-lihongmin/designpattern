package com.kevin.designpattern.headfirst.factory.factorymethod.pizza;

import java.util.ArrayList;
import java.util.List;

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
    String dough;

    /**
     *  酱料类型
     */
    String sauce;

    /**
     *  佐料列表（有序）
     */
    List<String> toppings = new ArrayList<String>();

    public abstract void say();

    public Pizza() {
    }

    public Pizza(String pizzaName, String dough, String sauce, List<String> toppings) {
        this.pizzaName = pizzaName;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void prepare() {
        System.out.println("披萨的准备环节");
    }

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
