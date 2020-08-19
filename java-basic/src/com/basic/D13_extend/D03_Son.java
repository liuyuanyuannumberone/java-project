package com.basic.D13_extend;

public class D03_Son extends D02_Parent {
    //子类可以继承父类的除了private和构造方法以外的内容
    //父类private的方法，子类无法继承，不存在覆盖重写
    // java只支持单继承 ，不支持 A extends B,C,
    //支持多层继承 B extend A   C extends B。
    //默认最初的类继承了Object          public class D02_Parent extends ObjectDemo

    String name = "lyy";

    //变量同名情况
    public void show() {
        String name = "yy";
        System.out.println(name);//yy 方法内部访问变量就近原则
        System.out.println(this.name); //lyy
        System.out.println(super.name); //liuyuanyuan  父类的成员变量，如果父类没有，继续往上找
    }

    //方法同名的情况--------方法重写(要求方法名，参数列表完全一样才叫重写)
    //方法重写快捷键 ctrl+o ...结果如下 @Override 这个只是用来检测的，去掉也可以。
    @Override
    public void method() {
        super.method();
        System.out.println("我是儿子");
    }


    //子类可以继承父类，那么子类初始化了，父类也一定已经初始化了，初始化就是执行构造函数的过程。
    //父类初始化优先于子类初始化，每次创建子类对象时，先初始化父类空间，再创建其子类对象本身.
    public D03_Son() {
        super();//可以不写，默认有，执行父类的构造函数 ，可以同过此方法给父类传递满参构造的参数
        System.out.println("空参构造");
    }
}
