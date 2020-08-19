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
      throw new AgeException("���䲻����Ҫ��");
    } else {
      this.age = age;
    }
  }
}

public class D02_DefineException {
  public static void main(String[] args) {
    //�Զ����쳣��
    Person p = new Person();
    try {
      p.setAge(10);
    } catch (AgeException e) {
      System.out.println(e.getMessage());
    }
  }
}
