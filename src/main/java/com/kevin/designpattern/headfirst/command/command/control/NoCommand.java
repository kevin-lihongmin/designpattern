package com.kevin.designpattern.headfirst.command.command.control;

import com.kevin.designpattern.headfirst.command.command.remote.Command;

/**
 *
 * @author lihongmin
 * @date 2018/9/6 13:26
 */
public class NoCommand implements Command {

    /**
     *  什么都不做
     */
    @Override
    public void execute() {

    }

    /**
     *  什么都不做
     */
    @Override
    public void undo() {

    }
}
