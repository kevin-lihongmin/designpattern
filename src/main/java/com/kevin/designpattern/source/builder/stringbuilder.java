package com.kevin.designpattern.source.builder;


/**
 *  StringBuilder
 *
 * @author lihongmin
 * @date 2019/11/5 22:34
 */
public class stringbuilder {

    public static void main(String[] args) {
        new StringBuilder().append("Ja").append("va")
                .insert(0, "1run ")
                .deleteCharAt(0)
                .replace(0, 3, "Run")
                .toString();
    }
}
