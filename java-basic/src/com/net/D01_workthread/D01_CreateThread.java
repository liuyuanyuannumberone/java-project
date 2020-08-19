package com.net.D01_workthread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D01_CreateThread {
  //进程：操作系统的概念，每个独立运行的程序就是一个进程
  /*
  线程：由进程创建 它可以将一个进程中的部分代码独立出来。
       与主程序同时运行，看到的效果就是一个程序中的两段代码同时运行，提高程序的运行效率
  * */
  //并发：两个或者多个事件在同一个时间段内发生（一个cpu  被两个或者多个线程抢占）
  //并行：两个或者多个时间在同时发生（两个cpu         处理2个线程，互不干扰）


  public static void main(String[] args) {
    // 第一种：创建自定义线程类，重写run方法，开启线程  单继承，对子类有限制
    MyThread t = new MyThread();
    t.setName("thread one"); //指定线程名字
    t.start();//启动线程，线程被执行

    MyThread t1 = new MyThread("thread two");
    t1.start();

    //sleepThread();

    //第二种:创建自定义Runable接口，重写run方法   同时实现多个接口，对子类比较宽松
    MyRun myrun = new MyRun();
    Thread t2 = new Thread(myrun);
    t2.start();

    //第三种：匿名内部类实现线程
    Thread t3 = new Thread("thead three") {
      @Override
      public void run() {
        System.out.println(super.getName());
      }
    };
    t3.start();
    //第四种：匿名内部类实现线程2
    Thread t4 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("four");
      }
    });
    t4.start();

   //创建线程的方式3   ！！！！！！！！！！！！！！！！！！！


    //主线程会继续向下执行
  }

  //sleep
  public static void sleepThread() {
    while (true) {
      String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
      System.out.println(str);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

