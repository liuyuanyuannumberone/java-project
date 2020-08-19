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
    //set������Ķ������з�������collection
    Set<String> set = new HashSet<>();
    set.add("lyy");
    set.add("hjx");
    set.add("xyf");
    set.add("wjj");
    boolean flag = set.add("wjj");// ��������ظ�Ԫ�أ�����Ϊfalse
    System.out.println(flag);
    System.out.println(set); //[xyf, wjj, hjx, lyy] ����  �ڲ����Լ�������˳��

    /*   Set�ӿڴ洢�Զ������ʱ���Զ��������Ҫ��дhashCode��equals����
     *  add ����ظ�Ԫ�ص�ԭ��  �Ƚ�����hashCode�Ƚϣ��ٽ���equals�Ƚ�
     * */
    Set<Phone> stuSet = new HashSet<>();
    stuSet.add(new Phone(1234, 8));
    stuSet.add(new Phone(5434, 128));
    stuSet.add(new Phone(5434, 128));
    System.out.println(stuSet); //[Phone{price=5434, memo=128}, Phone{price=1234, memo=8}]


    //LInkedHashSet   ��������+��ϣ�����򣩣���������ظ�Ԫ�أ�
    LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
    stringLinkedHashSet.add("lyy");
    stringLinkedHashSet.add("hjx");
    stringLinkedHashSet.add("xyf");
    stringLinkedHashSet.add("wjj");
    stringLinkedHashSet.add("wjj");  //��������ظ�Ԫ�� �������������
    System.out.println(stringLinkedHashSet);  //[lyy, hjx, xyf, wjj]


  }
}
