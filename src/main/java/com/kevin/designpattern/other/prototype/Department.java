package com.kevin.designpattern.other.prototype;

import lombok.Data;

/**
 *  部门
 * @author kevin
 * @date 2019/11/5 17:30
 */
@Data
public class Department implements Cloneable {

    private Long id;

    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
