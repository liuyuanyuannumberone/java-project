package com.advance.D01_Object;

import java.util.Objects;

public class ObjectDemo {
    public static void main(String[] args) {
        // java���: JDK api   ObjectDemo  java���е���(��������)�ĸ���    �̳еķ���

        Person p1 = new Person(18);
        Person p2 = new Person(18);

        System.out.println(p1); //com.advance.D01_Object.Person@7c30a502  Ĭ�ϵ���toString����


        // equals�Ƚ϶����ڲ���������ֵ�Ƿ���ȫ��ͬ
        // == �ж�ֵ/�����ֵַ�Ƿ���ͬ
        System.out.println(p1.equals(p2)); //��д��
        System.out.println(Objects.equals(p1, p2)); //�Ƽ�ʹ��

    }
}
