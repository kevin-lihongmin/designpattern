package com.kevin.designpattern.headfirst.template;

import com.kevin.designpattern.headfirst.template.base.Coffee;
import com.kevin.designpattern.headfirst.template.base.Tea;

/**
 *   模板方法测试(带钩子)
 *
 *      tea ......
 *      将水煮沸!
 *      泡茶需要将80度左右的水将茶叶泡开了！
 *      将沸腾的水倒入杯中!
 *      泡茶需要柠檬水等！
 *      tea is OK !
 * ---------------------------------------------
 *      coffee ......
 *      将水煮沸!
 *      咖啡需要直接泡！
 *      将沸腾的水倒入杯中!
 *      咖啡需要白开水等！
 *      coffee is OK !
 *
 * @author lihongmin
 * @date 2018/9/3 22:30
 */
public class TestTemplateMethod {

    public static void main(String[] args) {
        System.out.println("tea ......");
        Tea tea = new Tea();
        System.out.println("tea is OK !");

        System.out.println("---------------------------------------------");

        System.out.println("coffee ......");
        Coffee coffee = new Coffee();
        System.out.println("coffee is OK !");
    }
}
