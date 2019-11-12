package com.kevin.designpattern.source.builder.lombok;

import lombok.Builder;
import lombok.Data;


/**
 *  建造者模式
 * @author lihongmin
 * @date 2019/11/5 22:15
 */
@Data
@Builder
public class User {

    private Long id;

    private String name;
}
