package com.net.D01_workthread;

public class D03_ThreadStatus {
  public static void main(String[] args) throws InterruptedException {
    Object lockObj = new Object();  //创建锁对象

    new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          synchronized (lockObj) {
            System.out.println(i);
            if (i == 20) {
              try {
                System.out.println("进入无限等待，等待被另一个线程唤醒");
                //主动挂起 --当前线程不执行,将锁释放，让其他线程拿到锁。
                lockObj.wait(); //无限等待，等待被另一个线程唤醒
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
          }
        }
      }
    }).start();

    Thread.sleep(5000);

    new Thread(new Runnable() {
      @Override
      public void run() {
        synchronized (lockObj) {
          System.out.println("唤醒所有在这个锁上等待的线程");
          lockObj.notifyAll();
        }
      }
    }).start();
  }
}
