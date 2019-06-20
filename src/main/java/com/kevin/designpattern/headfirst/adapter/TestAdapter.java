package com.kevin.designpattern.headfirst.adapter;

import com.kevin.designpattern.headfirst.adapter.news.WildTurkey;
import com.kevin.designpattern.headfirst.adapter.old.Duck;
import com.kevin.designpattern.headfirst.adapter.old.MallardDuck;
import com.kevin.designpattern.headfirst.adapter.old.TurkeyAdapter;

/**
 *   测试适配器模式
 *
 *      创建鸭子对象！
 *      Quack!
 *      I am flying !
 * -------------------------------------------------------
 *      创建火鸡对象！
 *      Gobble gobble!
 *      I am flying a short diatance !
 * -------------------------------------------------------
 *      创建火鸡装到鸭子的适配器中！
 *      Gobble gobble!
 *      I am flying a short diatance !
 *
 * @author lihongmin
 * @date 2018/9/7 22:35
 */
public class TestAdapter {

    public static void main(String[] args) {

        System.out.println("创建鸭子对象！");
        MallardDuck mallardDuck = new MallardDuck();
        testDuck(mallardDuck);

        System.out.println("-------------------------------------------------------");

        System.out.println("创建火鸡对象！");
        WildTurkey wildTurkey = new WildTurkey();
        wildTurkey.gobble();
        wildTurkey.flying();

        System.out.println("-------------------------------------------------------");

        System.out.println("创建火鸡装到鸭子的适配器中！");
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
