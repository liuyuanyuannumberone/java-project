package com.advance.D08_Exception;

class AgeException extends RuntimeException {
  public AgeException(String message) {
    super(message);
  }
}

class Person {
  private int age;

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    if (age < 15 || age > 30) {
      throw new AgeException("年龄不符合要求");
    } else {
      this.age = age;
    }
  }
}

public class D02_DefineException {
  public static void main(String[] args) {
    //自定义异常类
    Person p = new Person();
    try {
      p.setAge(10);
    } catch (AgeException e) {
      System.out.println(e.getMessage());
    }
  }
}
