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
    //���弯��ʱ������ֻ�洢һ�����͵����� ����ʹ�÷���
    ArrayList<String> list = new ArrayList<>();
    ArrayList<Integer> one = new ArrayList<>();
//    list.add(10);  ����

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

  // �����κη��͵�ArrayLists���� ͨ���
  public static void fun(ArrayList<?> arrayList) {

  }


  //���վ���Person�Լ����෺�͵�ArrayList����
  public static void ffm(ArrayList<? extends Person> arrayList) {

  }

  //����Student���丸��ArrayList����
  public static void fft(ArrayList<? super Student> arrayList) {

  }

}
