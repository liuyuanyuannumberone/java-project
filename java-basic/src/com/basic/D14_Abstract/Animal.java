package com.basic.D14_Abstract;

/*
    抽象类: 能力你们要有,但是具体怎么实现, 父类不关心,子类自己决定
    所有的动物都具备吃的功能,但是怎么吃,吃什么,父类没有办法做统一规定,由子类自己决定,
    但是所有动物的子类都应该具备吃的能力.

    注意事项:
       1.抽象类不能直接创建对象  Animal a = new Animal();
       2.子类覆盖重写抽象父类中的所有抽象方法  ctrl + i  (必须要覆盖重写的方法)
       3.抽象类中必须要有构造方法,便于子类初始化父类成员
 */

// 定义抽象类
public abstract class Animal {
    private String name;

    public abstract void eat();  //定义抽象方法

    //空参构造
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
