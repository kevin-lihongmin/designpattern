package com.kevin.designpattern.other.responsibilitychain;

/**
 *  模拟调用链抽象实现
 *
 * @author kevin
 * @date 2019/11/13 13:56
 * @since 1.0.0
 */
public class AChainHandler extends ChainHandler {

    public AChainHandler() {
    }

    public AChainHandler(ChainHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected void handle() {
        System.out.println("我执行了方法A！");
        if (getNextHandler() != null) {
            System.out.println("----- 我呼叫了下一个任务！");
            getNextHandler().handle();
        }
    }
}
