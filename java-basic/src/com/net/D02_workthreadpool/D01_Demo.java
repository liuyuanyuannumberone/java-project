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
    System.out.println("�߳�������");
  }
}


public class D01_Demo {
  public static void main(String[] args) {
    //�̳߳�  �洢�̶߳��󣬽����Ƿ������ã���߳�������Ч�ʡ�
    // ���ã�һ���߳�ִ����ϣ��ͻ�������ʧ�����Ҫ���ã���Ҫ���´�����������ʱ��
    MyThread t1 = new MyThread();
    //��ȡ�������������̶߳���� �̳߳ض���
    ExecutorService serviceThreadPool = Executors.newFixedThreadPool(2);
    serviceThreadPool.submit(t1);
    serviceThreadPool.submit(t1);
    serviceThreadPool.submit(t1);

    //�����ַ�ʽ�����߳�

  }
}
