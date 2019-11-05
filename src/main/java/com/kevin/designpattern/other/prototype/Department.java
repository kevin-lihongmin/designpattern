package com.kevin.designpattern.other.prototype;

/**
 *  部门
 * @author kevin
 * @date 2019/11/5 17:30
 */
public class Department implements Cloneable {

    private Long id;

    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
