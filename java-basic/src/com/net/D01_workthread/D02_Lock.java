package com.net.D01_workthread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyRunClass implements Runnable {
  public int tickets = 100;
  private Lock lock = new ReentrantLock();

  @Override
  public void run() {
    while (true) {
      //��һ�ַ��� synchronized ���ã�һ���߳̽������������ڵȴ�
      // ������(this)����������������,�����Ƕ���̹߳���
     /*
     synchronized (this) {  //ͬ����
        if (this.tickets > 0) {
          int n = tickets;
          tickets--;
          System.out.println(Thread.currentThread().getName() + "ȡ��һ��Ʊ" + n);
        } else {
          System.out.println("ûƱ��");
          break;
        }
      }
      */

      //�ڶ���
 /*
    int n = getTicker();
      if (n != -1) {
        System.out.println(Thread.currentThread().getName() + "ȡ��һ��Ʊ" + n);
      } else {
        System.out.println("ûƱ��");
        break;
      }

      */

      //�����֣�Lock
      lock.lock();
      try {
        if (this.tickets > 0) {
          int n = tickets;
          tickets--;
          System.out.println(Thread.currentThread().getName() + "ȡ��һ��Ʊ" + n);
        } else {
          System.out.println("ûƱ��");
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

//���̰߳�ȫ����ԭ��:����߳�����ķ���ͬһ������
//����취��������ı������ġ�
public class D02_Lock {
  public static void main(String[] args) throws InterruptedException {
    MyRunClass myrun = new MyRunClass();
    Thread t1 = new Thread(myrun);
    Thread t2 = new Thread(myrun);
    Thread t3 = new Thread(myrun);
    t1.setName("����һ");
    t2.setName("���ڶ�");
    t3.setName("������");
    t1.start();
    t2.start();
    t3.start();
  }
}
