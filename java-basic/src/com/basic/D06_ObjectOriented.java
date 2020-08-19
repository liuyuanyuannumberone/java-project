package com.basic;

public class D06_ObjectOriented {
    //面向对象是基于面向过程的编程思想  面向过程是强调每一个功能的步骤  面向对象是由对象去调用功能
    //面向对象的语言中，包含3大基本特征；封装、继承、多态
    //类是属性和行为的集合（抽象的模板），对象是类的一个实例（具体的）。
    /*
类的使用：
     1.导包： java.lang中的类直接使用，或者 类和要使用的类在同一个包中，也不用导包；
     2. alt+回车；
     3.创建对象
     */
    public static void main(String[] args) {
        D07_Student stu = new D07_Student();//stu 是地址值
        stu.name = "lyy";
        stu.gender = "男";
        stu.sleep("冰冰");
        stu.setAge(19);
        System.out.println(stu.getAge());
        D07_Student stu2 = new D07_Student("lyy", "男");
        stu2.print();
    }
}