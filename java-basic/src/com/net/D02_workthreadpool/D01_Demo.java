package com.net.D02_workthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {
  public MyThread() {
    for (int i = 5; i > 0; i--) {
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void run() {
    System.out.println("线程启动了");
  }
}


public class D01_Demo {
  public static void main(String[] args) {
    //线程池  存储线程对象，将他们反复重用，提高程序运行效率。
    // 作用：一个线程执行完毕，就会立刻消失。如果要重用，需要重新创建，创建耗时。
    MyThread t1 = new MyThread();
    //获取可以容纳两个线程对象的 线程池对象
    ExecutorService serviceThreadPool = Executors.newFixedThreadPool(2);
    serviceThreadPool.submit(t1);
    serviceThreadPool.submit(t1);
    serviceThreadPool.submit(t1);

    //第三种方式创建线程

  }
}
