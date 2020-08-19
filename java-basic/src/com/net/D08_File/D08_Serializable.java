package com.net.D08_File;

import java.io.*;

class Student implements Serializable {
  private int age;
  private String name;

  public Student(int age, String name) {

    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }
}

public class D08_Serializable {
  public static void main(String[] args) {
    //序列化：将一个对象连同属性值整体存储到一个文件中，这个过程叫做序列化，但是类必须要实现Serializable接口
    //反序列化：之前序列化对象读取到内存中，并重新生成对象。
    String bashPath = "src/com/net/D08_File/file/student.txt";
    Student stu = new Student(18, "刘园园");
    try (
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(bashPath));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(bashPath));
    ) {
//      out.writeObject(stu);
      Object o = in.readObject();
      System.out.println((Student) o);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
