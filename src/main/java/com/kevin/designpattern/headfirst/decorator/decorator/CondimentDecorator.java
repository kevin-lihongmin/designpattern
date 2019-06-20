package com.kevin.designpattern.headfirst.decorator.decorator;

import com.kevin.designpattern.headfirst.decorator.beverage.Beverage;

/**
 *   调料顶层抽象类,装饰者的类型必须与顶层一致，必须继承（可能是实现）{@link Beverage}
 *
 * @author lihongmin
 * @date 2018/9/2 2:34
 */
public abstract class CondimentDecorator extends Beverage{

    /**
     *  覆盖父类的描述方法，并且抽象后让子类实现
     */
    @Override
    public abstract String getDescription();

}
