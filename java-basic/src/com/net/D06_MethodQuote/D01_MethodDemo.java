package com.net.D06_MethodQuote;

import java.util.function.Function;
import java.util.function.Supplier;

class Student {
  private String str;

  public static void show() {
    System.out.println("线程启动");
  }

  public void show1() {
    System.out.println("线程启动");
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
      System.out.println("线程启动");
    });

    //方法引用（静态方法，成员方法，构造方法，构造器引用（类/数组））：用已有的方法代替lambda表达式中的方法（前提是必须完全一样）。
    /*
    举例说明：
    引用Student类中的show方法
    show做的事情和lambda要做的一样；show的形参和返回值和我们lambada重写的方法一模一样
     */
    fun(Student::show);  //类名.show 静态方法
    fun(new Student()::show1);  //对象.show 成员方法

    supplyer(() -> {
      return new Student();
    });
    supplyer(Student::new); //类名：new 构造方法

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
