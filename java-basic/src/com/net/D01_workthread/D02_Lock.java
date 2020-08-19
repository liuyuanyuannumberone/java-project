package com.net.D01_workthread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyRunClass implements Runnable {
  public int tickets = 100;
  private Lock lock = new ReentrantLock();

  @Override
  public void run() {
    while (true) {
      //第一种方法 synchronized 作用：一个线程进来，其他都在等待
      // 锁对象(this)：必须是引用类型,必须是多个线程共享
     /*
     synchronized (this) {  //同步的
        if (this.tickets > 0) {
          int n = tickets;
          tickets--;
          System.out.println(Thread.currentThread().getName() + "取走一张票" + n);
        } else {
          System.out.println("没票了");
          break;
        }
      }
      */

      //第二种
 /*
    int n = getTicker();
      if (n != -1) {
        System.out.println(Thread.currentThread().getName() + "取走一张票" + n);
      } else {
        System.out.println("没票了");
        break;
      }

      */

      //第三种：Lock
      lock.lock();
      try {
        if (this.tickets > 0) {
          int n = tickets;
          tickets--;
          System.out.println(Thread.currentThread().getName() + "取走一张票" + n);
        } else {
          System.out.println("没票了");
          break;
        }
      }
      finally {
        lock.unlock();
      }
    }
  }

  public synchronized int getTicker() {
    if (this.tickets > 0) {
      int n = this.tickets;
      tickets--;
      return n;
    } else {
      return -1;
    }
  }

}

//多线程安全问题原因:多个线程无序的访问同一个变量
//解决办法：将无序的变成有序的。
public class D02_Lock {
  public static void main(String[] args) throws InterruptedException {
    MyRunClass myrun = new MyRunClass();
    Thread t1 = new Thread(myrun);
    Thread t2 = new Thread(myrun);
    Thread t3 = new Thread(myrun);
    t1.setName("窗口一");
    t2.setName("窗口二");
    t3.setName("窗口三");
    t1.start();
    t2.start();
    t3.start();
  }
}
