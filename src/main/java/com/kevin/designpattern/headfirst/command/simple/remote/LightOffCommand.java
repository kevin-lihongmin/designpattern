package com.kevin.designpattern.headfirst.command.simple.remote;

import com.kevin.designpattern.headfirst.command.simple.remote.entity.Light;

/**
 *   关灯命令
 *
 * @author lihongmin
 * @date 2018/9/5 21:15
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand() {
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
