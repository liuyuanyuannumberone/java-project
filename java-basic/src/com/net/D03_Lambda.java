package com.net;

import javax.print.DocFlavor;

public class D03_Lambda {
  public static void main(String[] args) {
    fun(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          System.out.println("iiiiiiiiii");
        }
      }
    });
    /*
    lambda表达式前提条件：
    1.函数式接口:接口中有且只有一个抽象方法(还可以包含 Object类中方法声明一样的/静态方法/默认方法)
    2.相当于传递一个子类对象或者接口类对象（包含抽象方法的重写）（多态）   （父类/接口 对象名）
     */

    fun(() -> {
      for (int i = 0; i < 100; i++) {
        System.out.println(i);
      }
    });

    //第三种
    Runnable runnable = getRun();
    fun(runnable);
  }

  public static void fun(Runnable runnable) {  //函数式接口
    Thread t = new Thread(runnable);
    t.start();
  }

  public static Runnable getRun() {

   /*
   return new Runnable() {
      @Override
      public void run() {
        System.out.println("run");
      }
    };
    */

    return () -> {
      System.out.println("run");
    };

  }
}
