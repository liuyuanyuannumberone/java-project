package com.net;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
    //����Ϊ����ʽ�ӿڣ�������ᱨ������ȥ��
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
    //����ʽ�ӿ�
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

  //Supplier  �����߽ӿ�
  public static void supplier(Supplier<String> sup) {
    String s = sup.get();
    System.out.println(s);
  }

  //Consumer  �����߽ӿ�
  public static void consumer(Consumer<String> com) {
    com.accept("consumer");
  }

  //Function   �����ӿ�
  public static void function(Function<String, Integer> fun) {
    Integer a = fun.apply("function");
    System.out.println(a);
  }

  //Predicate   �жϽӿ�
  public static void predicate(Predicate<String> pre) {
    boolean b = pre.test("123");
    System.out.println(b);
  }
}
