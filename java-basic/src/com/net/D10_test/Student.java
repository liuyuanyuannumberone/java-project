package com.net.D10_test;

public class Student {
  private String str = "������ְ�";

  @Override
  public String toString() {
    return "Student{" +
        "str='" + str + '\'' +
        '}';
  }

  public int sleep(String s) {
    System.out.println("����˯����" + s);
    return 10;
  }
}
