package com.kevin.designpattern.headfirst.command.command.control;

import com.kevin.designpattern.headfirst.command.command.remote.Command;

import java.util.Arrays;
import java.util.Objects;

/**
 *   控制器
 *
 * @author lihongmin
 * @date 2018/9/6 13:22
 */
public class RemoteControl {

    Command[] onCommands;

    Command[] offCommmands;

    /**
     *  记录上一个命令
     */
    Command undoCommand;

    /**
     *  初始化所有的
     */
    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommmands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommmands[i] = noCommand;
        }
        undoCommand = noCommand;
    }



    public void setCommmand(int slot, Command onCommands, Command offCommmands) {
        this.onCommands[slot] = onCommands;
        this.offCommmands[slot] = offCommmands;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        // 设置撤下命令
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommmands[slot].execute();
        undoCommand = offCommmands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RemoteControl{");
        sb.append("onCommands=").append(Arrays.toString(onCommands));
        sb.append(", offCommmands=").append(Arrays.toString(offCommmands));
        sb.append(", undoCommand=").append(undoCommand);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemoteControl that = (RemoteControl) o;
        return Arrays.equals(onCommands, that.onCommands) &&
                Arrays.equals(offCommmands, that.offCommmands) &&
                Objects.equals(undoCommand, that.undoCommand);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(undoCommand);
        result = 31 * result + Arrays.hashCode(onCommands);
        result = 31 * result + Arrays.hashCode(offCommmands);
        return result;
    }
}
