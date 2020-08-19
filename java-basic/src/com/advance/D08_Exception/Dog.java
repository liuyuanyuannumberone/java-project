package com.advance.D08_Exception;


import java.io.IOException;


//对于运行时异常，和父类完全没关系
//对于编译器异常，父类有你必须有，父类没有，你就没有



//无论父类是否抛出异常  子类都可以不抛出异常，都可以抛出任何”运行时异常“
//父类抛出编译器异常，子类也必须抛出编译器异常.但是不可以抛出比父类更多的编译器异常。
public class Dog extends Animal {
  @Override
  public void show() throws NullPointerException, IOException {
    super.show();
  }

  @Override
  public void method() throws ArrayIndexOutOfBoundsException, EnumConstantNotPresentException {
    super.method();
  }
}
