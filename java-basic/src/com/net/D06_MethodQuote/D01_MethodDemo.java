package com.net.D06_MethodQuote;

import java.util.function.Function;
import java.util.function.Supplier;

class Student {
  private String str;

  public static void show() {
    System.out.println("�߳�����");
  }

  public void show1() {
    System.out.println("�߳�����");
  }

  public Student(String str) {
    this.str = str;
  }

  public Student() {

  }
}

public class D01_MethodDemo {
  public static void main(String[] args) {
    fun(() -> {
      System.out.println("�߳�����");
    });

    //�������ã���̬��������Ա���������췽�������������ã���/���飩���������еķ�������lambda���ʽ�еķ�����ǰ���Ǳ�����ȫһ������
    /*
    ����˵����
    ����Student���е�show����
    show���������lambdaҪ����һ����show���βκͷ���ֵ������lambada��д�ķ���һģһ��
     */
    fun(Student::show);  //����.show ��̬����
    fun(new Student()::show1);  //����.show ��Ա����

    supplyer(() -> {
      return new Student();
    });
    supplyer(Student::new); //������new ���췽��

    function((Integer m) -> {
      return new int[m];
    });
    function(int[]::new);
  }

  private static void fun(Runnable run) {
    new Thread(run).start();
  }

  private static void supplyer(Supplier<Student> stu) {
    Student s = stu.get();
    System.out.println(s);
  }

  private static void function(Function<Integer, int[]> f) {
    int[] b = f.apply(23);
    System.out.println(b.length);
  }
}
