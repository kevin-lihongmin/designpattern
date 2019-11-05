package com.kevin.designpattern.other.prototype;

/**
 *  模拟初始化大量部门为固定值（可以脑补部门有很多字段，可以有很多部门这样的字段）
 *
 * @author kevin
 * @date 2019/11/5 17:40
 * @since 1.0.0
 */
public class UserInitFactory {

    /**
     *  为了最后方便大于原型的对象数据，修改为public方法
     */
    public static final User user = new User();

    static {
        Department department = new Department();
        department.setId(123L);
        department.setName("研发部");
        user.setId(1L);
        user.setName("kevin");
        user.setDepartment(department);
    }

    /**
     *  个人觉得原型模式可能经常牵扯 简单工厂模式
     * @return 用户
     */
    public static User getUser() {
        try {
            return (User)user.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
