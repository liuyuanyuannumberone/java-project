package com.net.D01_workthread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D01_CreateThread {
  //���̣�����ϵͳ�ĸ��ÿ���������еĳ������һ������
  /*
  �̣߳��ɽ��̴��� �����Խ�һ�������еĲ��ִ������������
       ��������ͬʱ���У�������Ч������һ�������е����δ���ͬʱ���У���߳��������Ч��
  * */
  //�������������߶���¼���ͬһ��ʱ����ڷ�����һ��cpu  ���������߶���߳���ռ��
  //���У��������߶��ʱ����ͬʱ����������cpu         ����2���̣߳��������ţ�


  public static void main(String[] args) {
    // ��һ�֣������Զ����߳��࣬��дrun�����������߳�  ���̳У�������������
    MyThread t = new MyThread();
    t.setName("thread one"); //ָ���߳�����
    t.start();//�����̣߳��̱߳�ִ��

    MyThread t1 = new MyThread("thread two");
    t1.start();

    //sleepThread();

    //�ڶ���:�����Զ���Runable�ӿڣ���дrun����   ͬʱʵ�ֶ���ӿڣ�������ȽϿ���
    MyRun myrun = new MyRun();
    Thread t2 = new Thread(myrun);
    t2.start();

    //�����֣������ڲ���ʵ���߳�
    Thread t3 = new Thread("thead three") {
      @Override
      public void run() {
        System.out.println(super.getName());
      }
    };
    t3.start();
    //�����֣������ڲ���ʵ���߳�2
    Thread t4 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("four");
      }
    });
    t4.start();

   //�����̵߳ķ�ʽ3   ��������������������������������������


    //���̻߳��������ִ��
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

