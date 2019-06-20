package com.kevin.designpattern.headfirst.command.command.remote;

/**
 *   命令控制器
 *
 * @author lihongmin
 * @date 2018/9/6 13:02
 */
public interface Command {

    /**
     *  执行
     */
    void execute();

    /**
     *  撤销
     */
    void undo();
}
