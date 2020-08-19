package com.basic.D16_Interface;
/*
      继承体系中，一个类只能继承一个父类，对于接口而言：一个类可以继承多个接口，这叫做接口的多实现
                 并且一个类能继承一个父类，同时实现多个接口。
                 public class 子类 extends 父类 implements 接口A，接口B
        注意：重写接口中的所有抽象方法，如果父类是抽象类，必须重写父类中的抽象方法
             父类和接口中由重名的抽象方法，只需要覆盖重写一次。
             多个接口中有重名的默认方法，实现类必须重写一次。
            父类普通方法和接口默认方法重名，优先使用父类的普通方法
* */

public class D01_SonImp extends Parent implements MyInterfaceA, MyInterfaceB {
    @Override
    public void eat() {

    }

    @Override
    public void method() {

    }

    @Override
    public void show() {

    }
}
