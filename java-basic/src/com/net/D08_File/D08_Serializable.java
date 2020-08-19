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
    //���л�����һ��������ͬ����ֵ����洢��һ���ļ��У�������̽������л������������Ҫʵ��Serializable�ӿ�
    //�����л���֮ǰ���л������ȡ���ڴ��У����������ɶ���
    String bashPath = "src/com/net/D08_File/file/student.txt";
    Student stu = new Student(18, "��԰԰");
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
