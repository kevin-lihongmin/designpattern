package com.kevin.designpattern.headfirst.factory.simple.product;

/**
 *   披萨的顶层抽象
 *
 * @author lihongmin
 * @date 2018/9/2 16:06
 */
public abstract class Pizza {

    abstract void say();

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
