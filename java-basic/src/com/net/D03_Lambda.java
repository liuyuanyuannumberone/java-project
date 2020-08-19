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
    lambda���ʽǰ��������
    1.����ʽ�ӿ�:�ӿ�������ֻ��һ�����󷽷�(�����԰��� Object���з�������һ����/��̬����/Ĭ�Ϸ���)
    2.�൱�ڴ���һ�����������߽ӿ�����󣨰������󷽷�����д������̬��   ������/�ӿ� ��������
     */

    fun(() -> {
      for (int i = 0; i < 100; i++) {
        System.out.println(i);
      }
    });

    //������
    Runnable runnable = getRun();
    fun(runnable);
  }

  public static void fun(Runnable runnable) {  //����ʽ�ӿ�
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
