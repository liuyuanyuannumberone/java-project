package com.basic.D15_Interface;

public class Demo {
    public static void main(String[] args) {
        //创建接口类的实现对象
        MyInterfaceImp m1 = new MyInterfaceImp();
        m1.method();
        m1.print();
        MyInterface.show();
        MyInterface.sleep();
        System.out.println(MyInterface.Sale_Num);
    }
}
