package com.basic.D15_Interface;

/*
    接口的实现类中要覆盖重写所有的抽象方法 ctrl+i
 * */

public class MyInterfaceImp implements MyInterface {
    @Override
    public void method() {
        System.out.println("接口类实现了");
    }
}
