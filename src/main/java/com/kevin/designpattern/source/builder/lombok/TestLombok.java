package com.kevin.designpattern.source.builder.lombok;


/**
 *  lombok建造者模式
 *
 * @author lihongmin
 * @date 2019/11/5 22:16
 */
public class TestLombok {
    public static void main(String[] args) {

        User user = User.builder().id(1L).build();

        System.out.println(user);
    }
}
