package com.advance.D06_Collection;

import java.util.LinkedList;

public class D06_LinkedList {
  public static void main(String[] args) {
    //LinkedList
    LinkedList<String> link = new LinkedList<>();
    link.push("a");
    link.push("b");
    link.push("c");
    System.out.println(link); // [c, b, a]  栈存储   压栈
    while (link.size() > 0) {
      link.pop();  // 它一直弹没有元素       会抛异常
    }
    link.poll();  //它一直弹没有元素  没有元素返回null 不抛异常
    System.out.println(link); //[b, a]   弹栈   后进先出
  }
}
