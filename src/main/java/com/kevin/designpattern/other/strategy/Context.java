package com.kevin.designpattern.other.strategy;

public class Context {

    private AbstractStrategy strategy;

    public Context(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     *  触发策略执行
     */
    public void strategyImpl() {
        strategy.algorithm();
    }
}
