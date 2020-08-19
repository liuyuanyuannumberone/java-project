package com.advance.D01_Object;

import java.util.Objects;

public class ObjectDemo {
    public static void main(String[] args) {
        // java类库: JDK api   ObjectDemo  java所有的类(包括数组)的父类    继承的方法

        Person p1 = new Person(18);
        Person p2 = new Person(18);

        System.out.println(p1); //com.advance.D01_Object.Person@7c30a502  默认调用toString方法


        // equals比较对象内部所有属性值是否完全相同
        // == 判断值/对象地址值是否相同
        System.out.println(p1.equals(p2)); //重写的
        System.out.println(Objects.equals(p1, p2)); //推荐使用

    }
}
