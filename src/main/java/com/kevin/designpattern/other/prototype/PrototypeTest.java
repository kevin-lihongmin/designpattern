package com.kevin.designpattern.other.prototype;

/**
 *  原型测试
 *
 *  生产出来第998个模板的用户：User{id=999, name='名称998', department={deptId='123',deptName='研发部'}}
 * 生产出来第999个模板的用户：User{id=1000, name='名称999', department={deptId='123',deptName='研发部'}}
 * 原模板数据为：User{id=1, name='kevin', department={deptId='123',deptName='研发部'}}
 *
 * @author kevin
 * @date 2019/11/5 17:48
 * @since 1.0.0
 */
public class PrototypeTest {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            User user = UserInitFactory.getUser();
            user.setId(i + 1L);
            user.setName("名称" + i);
            System.out.println("生产出来第" + i + "个模板的用户：" + user);
        }
        System.out.println("原模板数据为：" + UserInitFactory.user.toString());
    }
}
