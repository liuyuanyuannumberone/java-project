package com.net.D01_workthread;

public class D03_ThreadStatus {
  public static void main(String[] args) throws InterruptedException {
    Object lockObj = new Object();  //����������

    new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          synchronized (lockObj) {
            System.out.println(i);
            if (i == 20) {
              try {
                System.out.println("�������޵ȴ����ȴ�����һ���̻߳���");
                //�������� --��ǰ�̲߳�ִ��,�����ͷţ��������߳��õ�����
                lockObj.wait(); //���޵ȴ����ȴ�����һ���̻߳���
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
          System.out.println("����������������ϵȴ����߳�");
          lockObj.notifyAll();
        }
      }
    }).start();
  }
}
