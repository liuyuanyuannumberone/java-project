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
    //Map ʹ�õ����ݽṹȫ��Ӧ���ڼ���
    // HashMap ���ǹ�ϣ��ṹ  linkedHashMap ��������(����) +��ϣ��(Ψһ)
    // Map�漰������Զ������ʱ,��Ҫ�Զ��������дhashCode��`Equals����
    Map<String, String> map = new HashMap<>();
    map.put("name", "liuyuanyuan");
    map.put("age", "18");
    System.out.println(map.put("grade", "����")); // ��������ֵΪnull
    System.out.println(map.put("grade", "123")); // ����ظ��� �ᷢ���滻,����ԭֵ
    System.out.println(map); //{grade=123, name=liuyuanyuan, age=18}

    //ɾ��
    //System.out.println(map.remove("age"));  // 18 ɾ��age�� ,����ɾ����ֵ
    System.out.println(map.remove("ssss"));  // null  ɾ�������ڵļ�
    //System.out.println(map); //{grade=123, name=liuyuanyuan}

    System.out.println(map.get("name"));//liuyuanyuan
    System.out.println(map.get("tttt"));//null
    System.out.println(map.containsKey("name"));//true
    System.out.println(map.containsValue("liuyuanyuan"));//true

    //���� ����ֱ�ӱ���,ֻ��ת��Ϊset���Ϻ�,Ȼ��Collection����
    //��ȡMap�����еļ� �洢��Set������
    Set<String> strSet = map.keySet();  //System.out.println(strSet);  //[grade, name, age]
    for (String key : strSet) {
      System.out.println(key + ":" + map.get(key));
    }
    Collection<String> values = map.values();

    //��ȡMap�����еļ�ֵ����ļ��� �洢��Set������  public Set<Map.Entry<K,V> entrySet();>
    Set<Map.Entry<String, String>> entrySet = map.entrySet();
    System.out.println(entrySet);  //[grade=123, name=liuyuanyuan, age=18]
    for (Map.Entry<String, String> str : entrySet) {
//      System.out.println(str);
      System.out.println(str.getKey() + ":" + str.getValue());
    }
    StudentMap();
    LinkedHashMap();
  }

  //�Զ����������
  public static void StudentMap() {
    Map<Student, String> map = new HashMap<>();
    map.put(new Student(12), "a");
    map.put(new Student(15), "b");
    map.put(new Student(13), "c");
    map.put(new Student(13), "c"); //Map�洢�Զ������ʱ,�Զ��������дhashCode��`Equals����
    System.out.println(map);//{Student{age=13}=c, Student{age=15}=b, Student{age=12}=a}
  }


  //LinkedHashMap
  public static void LinkedHashMap() {
    //����
    LinkedHashMap<String, String> map = new LinkedHashMap<>();
    map.put("age", "18");
    map.put("name", "12");
    map.put("grade", "19");
    System.out.println(map); //{age=18, name=12, grade=19}
  }

}
