package com.net.D10_test;

public class Student {
  private String str = "我是你爸爸";

  @Override
  public String toString() {
    return "Student{" +
        "str='" + str + '\'' +
        '}';
  }

  public int sleep(String s) {
    System.out.println("我想睡觉，" + s);
    return 10;
  }
}
