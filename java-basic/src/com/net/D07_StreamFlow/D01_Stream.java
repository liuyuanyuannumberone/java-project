package com.net.D07_StreamFlow;

import com.basic.D18_DuoTai.Interface;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D01_Stream {
  private List<String> list;

  public static void main(String[] args) {
    //Stream��  ������Ԫ�صĽӿڣ�ɸѡ�����ˡ�ͳ�ƣ�   ���Ƶ����������ȵ�����ǿ���ٽ��lambda���ʽ��ţ��
    // ���Ĺ�����ʽ ��ÿ�����������������ͳ�Ϊ���������Ƿ���һ������
    //���Ļ�ȡ��ʽ��ͨ��Collection���ϣ�List��Set)��ȡ��   Map���ϻ�ȡ��  �����ȡ��  ����
    List<String> list = new ArrayList<>();
    list.add("��԰԰");
    list.add("���ְ�");
    list.add("����");
    filterTest(list);
    MapTest();
    concatTest(list);
    streamTransferCollection(list);
  }

  //Collection��ȡ��
  public static void test() {
    List<String> list = new ArrayList<>();
    Stream<String> stream = list.stream();
  }

  //Map��ȡ��
  public static void mapTest() {
    Map<String, String> map = new HashMap<>();
    Set<String> strkey = map.keySet();
    Stream<String> stream = strkey.stream();
  }

  //�����ȡ��
  public static void arrTest() {
    //�������͵�����
    Integer[] integerArr = {1, 2, 3};
    String[] strArr = {"1", "2", "3"};
    Stream<Integer> integerStream = Stream.of(integerArr);
    Stream<String> stringStream = Stream.of(strArr);

    //�������͵�����
    int[] arr = {1, 2, 3};
    IntStream intStream = IntStream.of(arr);

    //����
    Stream<Integer> s1 = Stream.of(1, 2, 3, 54, 6, 7);
  }

  //stream ��ת��Ϊ����,����
  public static void streamTransferCollection(List<String> list) {
    Stream<String> stream = list.stream();
    List<String> list1 = stream.collect(Collectors.toList()); //ת��Ϊlist����
    Set<String> set = stream.collect(Collectors.toSet());   //ת��Ϊset����
    Object[] arr = stream.toArray();//ת��Ϊ����
  }

  //forEach  ---��������ڲ��ࡢlambda���ʽ���������õ�����   ͦ�õ�
  public static void forEachTest(List<String> list) {

    list.stream().forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
//        System.out.println(s);
      }
    });

    list.stream().forEach((String s) -> {
//      System.out.println(s);
    });

    list.stream().forEach(System.out::println);
  }

  //filter---count--limit--skip
  public static void filterTest(List<String> list) {
    list.stream().filter(new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return false;
      }
    });
    list.stream().filter(s -> s.startsWith("��")).forEach(System.out::println);
    System.out.println("-");
    long a = list.stream().filter(s -> s.startsWith("��")).count();  //2
    list.stream().filter(s -> s.startsWith("��")).limit(1).forEach(System.out::println);
    System.out.println("-");
    list.stream().filter(s -> s.startsWith("��")).skip(1).forEach(System.out::println);
    System.out.println("-");

  }

  //map
  public static void MapTest() {
    List<String> list = new ArrayList<>();
    list.add("18");
    list.add("28");
    list.add("8");
    list.add("78");
    list.stream().map(new Function<String, Integer>() {
      @Override
      public Integer apply(String s) {
        return null;
      }
    });
    list.stream().map((String s) -> {
      return Integer.valueOf(s);
    }).forEach(s -> System.out.println(s + 1));
  }

  //concat �ϲ���
  public static void concatTest(List<String> list) {
    List<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(6);
    list2.add(2);

    List<String> list3 = new ArrayList<>();
    list3.add("111");
    list3.add("222");
    list3.add("1333");

    System.out.println("-----------------");

    Stream<? extends Serializable> concatStream = Stream.concat(list.stream(), list2.stream());
    Stream<String> stringStream = Stream.concat(list.stream(), list3.stream());
    concatStream.forEach(System.out::println);
    stringStream.forEach(System.out::println);


  }

}

