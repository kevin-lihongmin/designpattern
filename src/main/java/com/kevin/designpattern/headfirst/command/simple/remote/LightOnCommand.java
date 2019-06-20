package com.kevin.designpattern.headfirst.command.simple.remote;

import com.kevin.designpattern.headfirst.command.simple.remote.entity.Light;

/**
 *   亮灯命令
 *
 * @author lihongmin
 * @date 2018/9/5 21:11
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
