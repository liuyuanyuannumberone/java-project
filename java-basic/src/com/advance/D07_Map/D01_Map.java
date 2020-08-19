package com.advance.D07_Map;

import java.util.*;

class Student {
  int age;

  public Student(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "age=" + age +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return age == student.age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(age);
  }
}

public class D01_Map {
  public static void main(String[] args) {
    //Map 使用的数据结构全部应用在键上
    // HashMap 键是哈希表结构  linkedHashMap 键是链表(有序) +哈希表(唯一)
    // Map涉及到添加自定义对象时,需要自定义对象重写hashCode和`Equals方法
    Map<String, String> map = new HashMap<>();
    map.put("name", "liuyuanyuan");
    map.put("age", "18");
    System.out.println(map.put("grade", "本科")); // 正常返回值为null
    System.out.println(map.put("grade", "123")); // 添加重复键 会发生替换,返回原值
    System.out.println(map); //{grade=123, name=liuyuanyuan, age=18}

    //删除
    //System.out.println(map.remove("age"));  // 18 删除age键 ,返回删除的值
    System.out.println(map.remove("ssss"));  // null  删除不存在的键
    //System.out.println(map); //{grade=123, name=liuyuanyuan}

    System.out.println(map.get("name"));//liuyuanyuan
    System.out.println(map.get("tttt"));//null
    System.out.println(map.containsKey("name"));//true
    System.out.println(map.containsValue("liuyuanyuan"));//true

    //遍历 不能直接遍历,只能转换为set集合后,然后Collection遍历
    //获取Map中所有的键 存储到Set集合中
    Set<String> strSet = map.keySet();  //System.out.println(strSet);  //[grade, name, age]
    for (String key : strSet) {
      System.out.println(key + ":" + map.get(key));
    }
    Collection<String> values = map.values();

    //获取Map中所有的键值对象的集合 存储到Set集合中  public Set<Map.Entry<K,V> entrySet();>
    Set<Map.Entry<String, String>> entrySet = map.entrySet();
    System.out.println(entrySet);  //[grade=123, name=liuyuanyuan, age=18]
    for (Map.Entry<String, String> str : entrySet) {
//      System.out.println(str);
      System.out.println(str.getKey() + ":" + str.getValue());
    }
    StudentMap();
    LinkedHashMap();
  }

  //自定义对象做键
  public static void StudentMap() {
    Map<Student, String> map = new HashMap<>();
    map.put(new Student(12), "a");
    map.put(new Student(15), "b");
    map.put(new Student(13), "c");
    map.put(new Student(13), "c"); //Map存储自定义对象时,自定义对象重写hashCode和`Equals方法
    System.out.println(map);//{Student{age=13}=c, Student{age=15}=b, Student{age=12}=a}
  }


  //LinkedHashMap
  public static void LinkedHashMap() {
    //有序
    LinkedHashMap<String, String> map = new LinkedHashMap<>();
    map.put("age", "18");
    map.put("name", "12");
    map.put("grade", "19");
    System.out.println(map); //{age=18, name=12, grade=19}
  }

}
