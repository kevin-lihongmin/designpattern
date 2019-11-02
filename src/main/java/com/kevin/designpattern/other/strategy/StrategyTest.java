package com.kevin.designpattern.other.strategy;

/**
 *  简单策略的测试
 *
 * 我实现了策略（一）的方法！！！
 * 我实现了策略（二）的方法！！！
 *
 * @author lihongmin
 * @date 2019/11/2 12:32
 */
public class StrategyTest {
    public static void main(String[] args) {
        // 执行策略一
        new Context(new StrategyImplOne()).strategyImpl();
        // 执行策略二
        new Context(new StrategyImplTwo()).strategyImpl();
    }
}
