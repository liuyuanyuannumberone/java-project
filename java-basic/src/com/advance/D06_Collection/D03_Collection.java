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
    //java���ṩ�˴����ļ����࣬��������Ķ��󡣲�ͬ�ļ�������ò�ͬ�����ݽṹ�洢����
    //�Լ���Ԫ����ɾ�Ĳ�Ч�ʲ�ͬ

    // �����ࣺ
    // ArrayList  LinkedList   �� List(�ӿ�) ������ͨ����������   �����ظ���ͬԪ��
    //                                            �� Collection���ӿڣ������м��ϣ� List��Set ���з���
    // LinkedHashSet           �� Set���ӿڣ������� ��������      ���ܴ���ͬ


    // linkedHashMap            �� Map���ӿڣ���˫�м��ϣ�

    /*
    ���������ݽṹ��
    ���飺ArrayList�����߳� Ч�ʸߣ� Vector���̰߳�ȫ Ч�ʵͣ�  -------��ѯ��
    ���� LinkedList                            ---- ��ɾ��
    ��ϣ�� HashSet HashMap    ��ɾ�鶼�죬����ȡ�������ɹ�ϣֵ
    ����  TreeSet TreeMap     ������  ���ҿ�
    ջ�� ����ȳ�
    ���У� �Ƚ��ȳ�

    * */

    //��ɾ�飨������
    Collection<String> list = new ArrayList<>();
    list.add("lyy");//���Ԫ��
    boolean flag = list.add("adf"); //����list���ϣ�������ԶΪtrue������set���ϣ�����ظ�ֵʱ������Ϊfalse

    //�����������϶�����ʹ��
    // for (int n : array) { System.out.println(n)}  ����������ͨforѭ��
    for (String str : list) {
      System.out.println(str + "one");
    }  //�������ǵ�����������������ӻ���ɾ��


    //���������� Iterator ������
    Iterator<String> it = list.iterator();
    while (it.hasNext()) {//�Ƿ���Ԫ�ؿɵ���
      if (Objects.equals(it.next(), "lyy")) {
        it.remove();    //ֻ��ͨ������������ɾ��/���Ӽ���Ԫ�أ��������������޸��쳣
      }
      System.out.println(it.next());       //lyy  ��һ��Ԫ��
    }


    Object[] objArr = list.toArray();//[lyy, adf]     ת��Ϊ����
    list.size(); //����Ԫ�ظ���
    list.remove("lyy");//ɾ��Ԫ��
    list.contains("lyy");//�Ƿ����
    list.clear();//��ռ���
    list.isEmpty(); //�����Ƿ�Ϊ��

    collectionToolsClass();
  }

  //Collection������

  public static void collectionToolsClass() {
    //shuffle  ���Ҽ���Ԫ�ص�˳��
    //sort  ��List����Ԫ������   .sort(List<? extends Comparable>  list)
    // List<�Զ������> ������дComparable �ӿ� ����compareTo���� ���ݷ���ֵ����������������߽�������
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


    //.sort(List<?> list,Comparator cp)  ���list����Ԫ��û��ʵ��Comparable������һ���Ƚ���
    List<Adlut> ad = new ArrayList<>();
    ad.add(new Adlut(10));
    ad.add(new Adlut(30));
    ad.add(new Adlut(20));
    //��һ��
    Collections.sort(ad, new MyCp());
    // �ڶ���   �����ڲ���
    Collections.sort(ad, new Comparator<Adlut>() {
      @Override
      public int compare(Adlut o1, Adlut o2) {
        return o1.age - o2.age;
      }
    });

    System.out.println(ad);
  }
}
