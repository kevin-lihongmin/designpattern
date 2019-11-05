package com.kevin.designpattern.other.prototype;

/**
 *  用户
 * @author kevin
 * @date 2019/11/5 17:32
 */
public class User implements Cloneable {

    private Long id;

    private String name;

    private Department department;

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
