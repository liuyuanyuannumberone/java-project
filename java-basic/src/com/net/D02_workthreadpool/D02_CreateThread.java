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
    //如果线程比较慢，主线程就会等待，主线程阻塞
    System.out.println("等待获取结果");
    System.out.println(result.get());
  }
}
