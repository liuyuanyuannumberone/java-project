package com.advance.D06_Collection;

import com.basic.D08_StandardStudent;

import java.util.ArrayList;

public class D02_ArrayList {
    public static void main(String[] args) {
        ArrayList(new ArrayList<>());
    }

    //java.util.ArrayList�� ��С�ɱ������ʵ��   <> �������� ��ɾ�Ĳ�
    //ֻ�ܴ洢�������ͣ����ܴ洢�������͡�Ҫ��洢�������ͣ�<>����д�������Ͷ�Ӧ����������
    //ArrayList ���϶�����Ϊ�������������ݵ��ǵ�ֵַ
    /*
    byte        Byte
    short       Short
    int         Integer             �������
    long        Long
    char        Character           �������
    boolean     Boolean
    float       Float
    double      Double
* */
    private static void ArrayList(ArrayList<String> stu) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
//      String ele = list.remove(1);
//      list.clear();
        System.out.println(list.size());//2
        System.out.println(list); //[hello, java],��Ȼ���������ͣ������ڲ��Ѿ� toString()
        System.out.println(list.get(1)); //java
        System.out.println(list.isEmpty()); //false

        //�洢����
        ArrayList<Integer> IntergerList = new ArrayList<>();
        IntergerList.add(1);
        IntergerList.add(2);
        System.out.println(IntergerList); //[1, 2, 3]

        //�洢����
        ArrayList<D08_StandardStudent> ClassList = new ArrayList<>();
        ClassList.add(new D08_StandardStudent());
        ClassList.add(new D08_StandardStudent());
        System.out.println(ClassList);

    }

}
