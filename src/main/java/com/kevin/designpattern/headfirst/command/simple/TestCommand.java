package com.kevin.designpattern.headfirst.command.simple;

import com.kevin.designpattern.headfirst.command.simple.control.SimpleRemoteControl;
import com.kevin.designpattern.headfirst.command.simple.remote.LightOnCommand;
import com.kevin.designpattern.headfirst.command.simple.remote.entity.Light;

/**
 *   测试命令模式
 *
 * @author lihongmin
 * @date 2018/9/5 21:07
 */
public class TestCommand {

    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        control.setCommand(lightOnCommand);
        control.buttonWasPressed();
        control.cancelButtonWasPressed();
    }
}
