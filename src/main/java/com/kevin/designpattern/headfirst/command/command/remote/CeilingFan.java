package com.kevin.designpattern.headfirst.command.command.remote;

/**
 *   吊扇
 *   undo方法，需要知道之前的速度状态
 *
 * @author lihongmin
 * @date 2018/9/6 13:06
 */
public class CeilingFan {

    public enum SpeedEnum{
        HIGH, MEDIUM, LOW, OFF;
    }

    String location;

    SpeedEnum speed;

    public CeilingFan(String location) {
        this.location = location;
        System.out.println(location);
    }

    public CeilingFan(String location, SpeedEnum speed) {
        this.location = location;
        this.speed = speed;
    }

    public void high() {
        speed = SpeedEnum.HIGH;
    }

    public void medium() {
        speed = SpeedEnum.MEDIUM;
    }

    public void low() {
        speed = SpeedEnum.LOW;
    }

    public void off() {
        speed = SpeedEnum.OFF;
    }

    public SpeedEnum getSpeed() {
        return speed;
    }
}
