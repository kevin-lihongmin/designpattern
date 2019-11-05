package com.kevin.designpattern.other.prototype;

import lombok.Data;

/**
 *  用户
 * @author kevin
 * @date 2019/11/5 17:32
 */
@Data
public class User implements Cloneable {

    private Long id;

    private String name;

    private Department department;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + "{deptId='" + department.getId()
                + "',deptName='" + department.getName() + "'}" +
                '}';
    }
}
