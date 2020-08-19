package com.net;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
    //声明为函数式接口，不满足会报错，可以去掉
interface Person {
  void show();
}

public class D05_FunPrm {
  public static void main(String[] args) {
    supplier(new Supplier<String>() {
      @Override
      public String get() {
        return null;
      }
    });
    //函数式接口
    supplier(() -> {
      return "123";
    });
    consumer((String str) -> {
      System.out.println(str);
    });

    function((String str) -> {
      return 1;
    });

    predicate((String str) -> {
      return str == "123";
    });
    predicate(str -> str == "123");
  }

  //Supplier  生产者接口
  public static void supplier(Supplier<String> sup) {
    String s = sup.get();
    System.out.println(s);
  }

  //Consumer  消费者接口
  public static void consumer(Consumer<String> com) {
    com.accept("consumer");
  }

  //Function   函数接口
  public static void function(Function<String, Integer> fun) {
    Integer a = fun.apply("function");
    System.out.println(a);
  }

  //Predicate   判断接口
  public static void predicate(Predicate<String> pre) {
    boolean b = pre.test("123");
    System.out.println(b);
  }
}
