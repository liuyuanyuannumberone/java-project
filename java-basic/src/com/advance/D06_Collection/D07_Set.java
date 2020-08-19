package com.advance.D06_Collection;

import java.util.*;

class Phone {
  int price;
  int memo;

  public Phone(int price, int memo) {
    this.price = price;
    this.memo = memo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Phone phone = (Phone) o;
    return price == phone.price &&
        memo == phone.memo;
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, memo);
  }

  @Override
  public String toString() {
    return "Phone{" +
        "price=" + price +
        ", memo=" + memo +
        '}';
  }
}

public class D07_Set {
  public static void main(String[] args) {
    //set和下面的都无特有方法，用collection
    Set<String> set = new HashSet<>();
    set.add("lyy");
    set.add("hjx");
    set.add("xyf");
    set.add("wjj");
    boolean flag = set.add("wjj");// 不能添加重复元素，返回为false
    System.out.println(flag);
    System.out.println(set); //[xyf, wjj, hjx, lyy] 无序  内部有自己的排列顺序

    /*   Set接口存储自定义对象时，自定义对象需要重写hashCode和equals方法
     *  add 添加重复元素的原理  先进行了hashCode比较，再进行equals比较
     * */
    Set<Phone> stuSet = new HashSet<>();
    stuSet.add(new Phone(1234, 8));
    stuSet.add(new Phone(5434, 128));
    stuSet.add(new Phone(5434, 128));
    System.out.println(stuSet); //[Phone{price=5434, memo=128}, Phone{price=1234, memo=8}]


    //LInkedHashSet   链表（有序）+哈希表（无序）（不能添加重复元素）
    LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
    stringLinkedHashSet.add("lyy");
    stringLinkedHashSet.add("hjx");
    stringLinkedHashSet.add("xyf");
    stringLinkedHashSet.add("wjj");
    stringLinkedHashSet.add("wjj");  //不能添加重复元素 ，但是是有序的
    System.out.println(stringLinkedHashSet);  //[lyy, hjx, xyf, wjj]


  }
}
