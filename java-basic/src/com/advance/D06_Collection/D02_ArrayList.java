package com.advance.D06_Collection;

import com.basic.D08_StandardStudent;

import java.util.ArrayList;

public class D02_ArrayList {
    public static void main(String[] args) {
        ArrayList(new ArrayList<>());
    }

    //java.util.ArrayList类 大小可变的数组实现   <> 集合容器 增删改查
    //只能存储引用类型，不能存储基本类型。要想存储基本类型，<>必须写基本类型对应的引用类型
    //ArrayList 集合对象，作为方法参数，传递的是地址值
    /*
    byte        Byte
    short       Short
    int         Integer             特殊记忆
    long        Long
    char        Character           特殊记忆
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
        System.out.println(list); //[hello, java],虽然是引用类型，但是内部已经 toString()
        System.out.println(list.get(1)); //java
        System.out.println(list.isEmpty()); //false

        //存储整型
        ArrayList<Integer> IntergerList = new ArrayList<>();
        IntergerList.add(1);
        IntergerList.add(2);
        System.out.println(IntergerList); //[1, 2, 3]

        //存储对象
        ArrayList<D08_StandardStudent> ClassList = new ArrayList<>();
        ClassList.add(new D08_StandardStudent());
        ClassList.add(new D08_StandardStudent());
        System.out.println(ClassList);

    }

}
