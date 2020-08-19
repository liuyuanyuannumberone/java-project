package com.advance.D06_Collection;

import java.util.LinkedList;

public class D06_LinkedList {
  public static void main(String[] args) {
    //LinkedList
    LinkedList<String> link = new LinkedList<>();
    link.push("a");
    link.push("b");
    link.push("c");
    System.out.println(link); // [c, b, a]  ջ�洢   ѹջ
    while (link.size() > 0) {
      link.pop();  // ��һֱ��û��Ԫ��       �����쳣
    }
    link.poll();  //��һֱ��û��Ԫ��  û��Ԫ�ط���null �����쳣
    System.out.println(link); //[b, a]   ��ջ   ����ȳ�
  }
}
