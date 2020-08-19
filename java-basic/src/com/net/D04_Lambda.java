package com.net;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Animal {
  void eat();
}

public class D04_Lambda {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("123");
    list.add("678");
    list.add("456");
    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    });

    //可以省略数据类型名，如果只有一个形参，可以省略一对小括号。
    Collections.sort(list, (o1, o2) -> {
      return o2.compareTo(o1);
    });

    System.out.println(list);

    test(new Animal() {
      @Override
      public void eat() {
        System.out.println("run");
      }
    });

    test(() -> {
      System.out.println("run");
    });
  }


  public static void test(Animal s) {
    s.eat();
  }
}
