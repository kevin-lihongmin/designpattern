package com.kevin.designpattern.headfirst.command.command;

import com.kevin.designpattern.headfirst.command.command.control.RemoteControl;
import com.kevin.designpattern.headfirst.command.command.remote.CeilingFan;
import com.kevin.designpattern.headfirst.command.command.remote.CeilingFanHighCommand;
import com.kevin.designpattern.headfirst.command.command.remote.CeilingFanLowCommand;
import com.kevin.designpattern.headfirst.command.command.remote.CeilingFanOffCommand;

/**
 *   测试命令模式
 *
 * 客厅
 * ------ 将风扇开为高速！
 * ------ 关闭风扇！
 * ------ RemoteControl{onCommands=[CeilingFanHighCommand@18e2867, CeilingFanLowCommand@f40c25, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37], offCommmands=[CeilingFanOffCommand@bc508c, CeilingFanOffCommand@bc508c, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37], undoCommand=CeilingFanOffCommand@bc508c} -------
 * ------ 撤销按钮！
 * ------ RemoteControl{onCommands=[CeilingFanHighCommand@18e2867, CeilingFanLowCommand@f40c25, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37], offCommmands=[CeilingFanOffCommand@bc508c, CeilingFanOffCommand@bc508c, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37, NoCommand@da9e37], undoCommand=CeilingFanLowCommand@f40c25} -------
 * ------ 撤销按钮！
 *
 * @author lihongmin
 * @date 2018/9/5 21:27
 */
public class TestCommand {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("客厅");

        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand lowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommmand(0, highCommand, offCommand);
        remoteControl.setCommmand(1, lowCommand, offCommand);

        System.out.println("------ 将风扇开为高速！");
        remoteControl.onButtonWasPushed(0);
        System.out.println("------ 关闭风扇！");
        remoteControl.offButtonWasPushed(0);
        System.out.println("------ " + remoteControl + " -------");
        System.out.println("------ 撤销按钮！");
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println("------ " + remoteControl + " -------");
        System.out.println("------ 撤销按钮！");
        remoteControl.undoButtonWasPushed();

    }
}
