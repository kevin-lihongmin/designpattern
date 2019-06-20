package com.kevin.designpattern.headfirst.command.simple.control;

import com.kevin.designpattern.headfirst.command.simple.remote.Command;

/**
 *   控制中心
 *
 * @author lihongmin
 * @date 2018/9/5 21:18
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

    public void cancelButtonWasPressed() {
        slot.undo();
    }
}
