package com.advance.D06_Collection;

import java.util.ArrayList;
import java.util.List;

public class D05_List {
  public static void main(String[] args) {
    //list ��ɾ�Ĳ�
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add(1, "c"); //��Ԫ�ز�������Ϊ1��λ��
//    list.remove(1); //ɾ������Ϊ1��Ԫ��,
//    list.remove("a");  //ɾ��Ԫ��
    list.set(1,"f");//�滻������Ԫ�أ�����ԭԪ�ط���
    System.out.println(list.get(1));  //��ȡ����Ϊ1��Ԫ��
    System.out.println(list.remove("lyy")); //false ���ᱨ�쳣
    System.out.println(list);  //[a, c, b]
  }
}
