package com.advance.D06_Collection;

import java.util.*;

class Childern implements Comparable {
  int age;

  @Override
  public int compareTo(Object o) {
    Childern ch = (Childern) o;
    int n = this.age - ch.age;
    return n;
  }

  public Childern(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Childern{" +
        "age=" + age +
        '}';
  }
}

class Adlut {
  int age;

  public Adlut(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Adlut{" +
        "age=" + age +
        '}';
  }
}

class MyCp implements Comparator<Adlut> {
  @Override
  public int compare(Adlut o1, Adlut o2) {
    return o1.age - o2.age;
  }
}

public class D03_Collection {
  public static void main(String[] args) {
    //java中提供了大量的集合类，管理大量的对象。不同的集合类采用不同的数据结构存储对象
    //对集合元素增删改查效率不同

    // 集合类：
    // ArrayList  LinkedList   父 List(接口) ：有序通过索引访问   可以重复相同元素
    //                                            父 Collection（接口）（单列集合） List和Set 共有方法
    // LinkedHashSet           父 Set（接口）：无序 不能索引      不能存相同


    // linkedHashMap            父 Map（接口）（双列集合）

    /*
    常见的数据结构：
    数组：ArrayList（单线程 效率高） Vector（线程安全 效率低）  -------查询快
    链表： LinkedList                            ---- 增删快
    哈希表： HashSet HashMap    增删查都快，性能取决于生成哈希值
    树：  TreeSet TreeMap     二叉树  查找快
    栈： 后进先出
    队列： 先进先出

    * */

    //增删查（遍历）
    Collection<String> list = new ArrayList<>();
    list.add("lyy");//添加元素
    boolean flag = list.add("adf"); //对于list集合，返回永远为true；对于set集合，添加重复值时，返回为false

    //数组名、集合都可以使用
    // for (int n : array) { System.out.println(n)}  编译后就是普通for循环
    for (String str : list) {
      System.out.println(str + "one");
    }  //编译后就是迭代器，不能随便增加或者删除


    //遍历迭代器 Iterator 迭代器
    Iterator<String> it = list.iterator();
    while (it.hasNext()) {//是否有元素可迭代
      if (Objects.equals(it.next(), "lyy")) {
        it.remove();    //只能通过迭代器对象删除/增加集合元素，否则引发并发修改异常
      }
      System.out.println(it.next());       //lyy  下一个元素
    }


    Object[] objArr = list.toArray();//[lyy, adf]     转换为数组
    list.size(); //集合元素个数
    list.remove("lyy");//删除元素
    list.contains("lyy");//是否存在
    list.clear();//清空集合
    list.isEmpty(); //集合是否为空

    collectionToolsClass();
  }

  //Collection工具类

  public static void collectionToolsClass() {
    //shuffle  打乱集合元素的顺序
    //sort  对List集合元素排序   .sort(List<? extends Comparable>  list)
    // List<自定义对象> 必须重写Comparable 接口 并且compareTo方法 根据返回值的正负进行升序或者降序排列
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(90);
    list.add(70);
    list.add(100);
    Collections.sort(list);
    System.out.println(list);//[10, 70, 90, 100]

    List<Childern> ch = new ArrayList<>();
    ch.add(new Childern(10));
    ch.add(new Childern(30));
    ch.add(new Childern(20));
    Collections.sort(ch);
    System.out.println(ch);


    //.sort(List<?> list,Comparator cp)  如果list集合元素没有实现Comparable，传入一个比较器
    List<Adlut> ad = new ArrayList<>();
    ad.add(new Adlut(10));
    ad.add(new Adlut(30));
    ad.add(new Adlut(20));
    //第一种
    Collections.sort(ad, new MyCp());
    // 第二种   匿名内部类
    Collections.sort(ad, new Comparator<Adlut>() {
      @Override
      public int compare(Adlut o1, Adlut o2) {
        return o1.age - o2.age;
      }
    });

    System.out.println(ad);
  }
}
