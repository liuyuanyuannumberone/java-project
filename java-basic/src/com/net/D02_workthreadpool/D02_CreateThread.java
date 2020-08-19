package com.net.D02_workthreadpool;

import java.util.concurrent.*;

class MyCallable implements Callable<Integer> {
  @Override
  public Integer call() throws Exception {
    return 0;
  }
}


public class D02_CreateThread {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorServicePool = Executors.newFixedThreadPool(2);
    MyCallable mycal = new MyCallable();
    Future<Integer> result = executorServicePool.submit(mycal);
    //����̱߳Ƚ��������߳̾ͻ�ȴ������߳�����
    System.out.println("�ȴ���ȡ���");
    System.out.println(result.get());
  }
}
