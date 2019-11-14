package com.kevin.designpattern.other.responsibilitychain;

/**
 *  责任链抽象
 * @author kevin
 * @date 2019/11/13 13:47
 * @since 1.0.0
 */
public abstract class ChainHandler {
    /**
     *  下一个处理者
     */
    private ChainHandler nextHandler;

    public ChainHandler() {
    }

    public ChainHandler(ChainHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     *  当前处理任务
     */
    protected abstract void handle();

    public ChainHandler getNextHandler() {
        return nextHandler;
    }
}
