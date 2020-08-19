package com.basic.D20_InnerClass;

public class Demo {
    public static void main(String[] args) {
        /*
        *   外部类访问内部类，建立内部类的对象
             内部类直接访问外部类
        * */
        Person p = new Person();
        Person.Heart h = new Person().new Heart();


        /*
         匿名内部类  作用：创建子类/实现类对象快捷方式,因为匿名,可以结合多态使用
         new 父类/接口(){
            覆盖重写
        }
        */
        Bird b = new Bird() {
            @Override
            public void fly() {
                System.out.println("飞");
            }
        };
        b.fly();
    }
}
