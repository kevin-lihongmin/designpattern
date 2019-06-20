package com.kevin.designpattern.headfirst.command.simple.remote;

/**
 *   命令接口
 *
 * @author lihongmin
 * @date 2018/9/5 21:09
 */
public interface Command {

    /**
     *  执行命令
     */
    void execute();

    /**
     *  撤销命令
     */
    void undo();

}
