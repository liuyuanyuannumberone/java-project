package com.net.D01_workthread;

public class MyThread extends Thread {
  public MyThread() {
  }

  public MyThread(String name) {
    super(name);
  }

  public MyThread(Runnable target) {
    super(target);
  }


  @Override
  public void run() {
    System.out.println(super.getName());  //获取线程名
    System.out.println(Thread.currentThread().getName());  //获取线程名
  }
}
