package com.kevin.designpattern.other.responsibilitychain;

/**
 *  测试责任链
 *
 *  我执行了方法A！
 * ----- 我呼叫了下一个任务！
 * 我执行了方法B！
 * ----- 我呼叫了下一个任务！
 * 我执行了方法A！
 *
 * @author kevin
 * @date 2019/11/13 13:58
 * @since 1.0.0
 */
public class ChainHandlerTest {

    public static void main(String[] args) {
        // 任务一放入链
        AChainHandler a = new AChainHandler();
        // 任务二放入链
        BChainHandler b = new BChainHandler(a);
        // 再放一个任务一到链中
        AChainHandler a1 = new AChainHandler(b);
        // 执行任务
        a1.handle();
    }
}
