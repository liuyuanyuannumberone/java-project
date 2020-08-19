package com.advance.D06_Collection;

import java.util.ArrayList;
import java.util.List;

public class D05_List {
  public static void main(String[] args) {
    //list 增删改查
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add(1, "c"); //将元素插入索引为1的位置
//    list.remove(1); //删除索引为1的元素,
//    list.remove("a");  //删除元素
    list.set(1,"f");//替换索引的元素，并将原元素返回
    System.out.println(list.get(1));  //获取索引为1的元素
    System.out.println(list.remove("lyy")); //false 不会报异常
    System.out.println(list);  //[a, c, b]
  }
}
