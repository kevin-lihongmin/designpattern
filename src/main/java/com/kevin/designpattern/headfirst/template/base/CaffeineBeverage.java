package com.kevin.designpattern.headfirst.template.base;

/**
 *   模板基类(咖啡或茶的冲泡步骤模板)
 *
 * @author lihongmin
 * @date 2018/9/3 22:33
 */
public abstract class CaffeineBeverage {

    private static final boolean DEFAULT_ADD_CONDIMENTS = true;

    /**
     *  不允许改变{咖啡或茶的冲泡}执行步骤
     */
    final void prepareRecipe() {

        boilWater();

        brew();

        pourInCup();

        /**
         *  设置一个回调钩子
         */
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     *  冲泡(需要子类实现)
     */
    abstract void brew();

    /**
     *  添加调味料(需要子类实现)
     */
    abstract void addCondiments();

    /**
     *  将水煮沸
     */
    void boilWater() {
        System.out.println("将水煮沸!");
    }

    /**
     *  将水倒入杯中
     */
    void pourInCup() {
        System.out.println("将沸腾的水倒入杯中!");
    }

    boolean customerWantsCondiments() {
        return DEFAULT_ADD_CONDIMENTS;
    }
}
