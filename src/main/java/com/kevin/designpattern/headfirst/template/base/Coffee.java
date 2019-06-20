package com.kevin.designpattern.headfirst.template.base;

/**
 *   咖啡的冲泡
 * @author lihongmin
 * @date 2018/9/3 22:50
 */
public class Coffee extends CaffeineBeverage {


    public Coffee() {
        super.prepareRecipe();
    }

    @Override
    public void brew() {

        System.out.println("咖啡需要直接泡！");
    }

    @Override
    public void addCondiments() {

        System.out.println("咖啡需要白开水等！");
    }

}
