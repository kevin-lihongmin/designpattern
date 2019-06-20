package com.kevin.designpattern.headfirst.adapter.old;

import com.kevin.designpattern.headfirst.adapter.news.Turkey;

/**
 *   适配器
 *
 * @author lihongmin
 * @date 2018/9/7 22:44
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.flying();
    }
}
