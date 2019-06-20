package com.kevin.designpattern.headfirst.command.command.remote;

/**
 *  关闭
 *
 * @author lihongmin
 * @date 2018/9/6 13:16
 */
public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;

    CeilingFan.SpeedEnum prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.SpeedEnum.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.SpeedEnum.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.SpeedEnum.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.SpeedEnum.OFF) {
            ceilingFan.off();
        }
    }

}
