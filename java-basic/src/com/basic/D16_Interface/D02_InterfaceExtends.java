package com.basic.D16_Interface;

/*
  接口的继承:多继承
  拥有父接口所有的抽象方法，
  父接口重名的默认方法，子接口必须重写一次，必须保留default关键字
  父接口重名的抽象方法没关系
* */
public interface D02_InterfaceExtends extends MyInterfaceA, MyInterfaceB {

}
