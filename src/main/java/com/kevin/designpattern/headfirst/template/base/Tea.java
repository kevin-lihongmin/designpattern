package com.kevin.designpattern.headfirst.template.base;

/**
 *   茶的冲泡
 * @author lihongmin
 * @date 2018/9/3 22:50
 */
public class Tea extends CaffeineBeverage {


    public Tea() {
        super.prepareRecipe();
    }

    @Override
    public void brew() {

        System.out.println("泡茶需要将80度左右的水将茶叶泡开了！");
    }

    @Override
    public void addCondiments() {

        System.out.println("泡茶需要柠檬水等！");
    }

}
