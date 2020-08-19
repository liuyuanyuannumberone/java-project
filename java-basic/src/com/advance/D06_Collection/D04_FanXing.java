package com.advance.D06_Collection;

import java.util.ArrayList;

class Person {
}

class Student extends Person {
}

class JavaStudent extends Student {
}

class PhpStudent extends Student {
}

class Teacher extends Student {
}

public class D04_FanXing {
  public static void main(String[] args) {
    //定义集合时，我们只存储一种类型的引用 可以使用泛型
    ArrayList<String> list = new ArrayList<>();
    ArrayList<Integer> one = new ArrayList<>();
//    list.add(10);  报错

    MyArrayList<String> mylist = new MyArrayList<>();
    mylist.add("123");
    mylist.<Integer>show(10, 20, 30);

    fun(list);
    fun(one);

    ArrayList<Person> p1 = new ArrayList<>();
    ArrayList<Student> p2 = new ArrayList<>();
    ArrayList<JavaStudent> p3 = new ArrayList<>();
    ArrayList<PhpStudent> p4 = new ArrayList<>();
    ArrayList<Teacher> p5 = new ArrayList<>();
    ffm(p1);
    ffm(p2);
    ffm(p3);
    ffm(p4);
    ffm(p5);
  }

  // 接收任何泛型的ArrayLists对象 通配符
  public static void fun(ArrayList<?> arrayList) {

  }


  //接收具有Person以及子类泛型的ArrayList对象
  public static void ffm(ArrayList<? extends Person> arrayList) {

  }

  //接收Student及其父类ArrayList对象
  public static void fft(ArrayList<? super Student> arrayList) {

  }

}
