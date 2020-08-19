package com.basic;

/*
       java.lang.String��
       �ַ����ǳ��������ǵ�ֵ�ڴ���֮���ܸ���,���ǿ��Ա�����
       ʹ��˫����""������������,����String�Ķ���,��Ȼû��дnew,���ǵײ���Ȼ��new�Ĺ���
       */

import java.util.Scanner;

public class D11_String {
    public static void main(String[] args) {
        judge();
        get();
        transfer();
        splitStr();
        lookStr();
        count();
    }

    //�ж�
    private static void judge() {
        String s1 = new String();
        String s2 = "hello";
        String s3 = "HELLO";
        String s4 = "H";
        boolean res = s2.equals(s3); //���ִ�Сд
        boolean resA = s2.equalsIgnoreCase(s3);///��������ĸ��Сд
        boolean contains = s3.contains(s4);

//        System.out.println("-" + s1 + "-");//""
//        System.out.println(contains); //true
//        System.out.println(res); //false
//        System.out.println(resA); //true
    }

    //��ȡ
    private static void get() {
        String str = "hello world";
        int len = str.length();
        String concat = str.concat(" java");
        char ch = str.charAt(4);//��ȡ����Ϊ4���ַ�
        int indexFirst = str.indexOf("or"); //or��һ�γ��ֵ�����ֵ,��������ڷ���-1
        String subBegin = str.substring(4);
        String subBeginEnd = str.substring(4, 10);//����4��������10


//        System.out.println(len);//11
//        System.out.println(concat);//hello world java
//        System.out.println(ch);//o
//        System.out.println(indexFirst);//7
//        System.out.println(subBegin); //o world
//        System.out.println(subBeginEnd); //o worl
    }

    //ת��
    private static void transfer() {
        String str = "ABC";
        char[] charArr = str.toCharArray(); //�ַ������ַ�����
        byte[] strBytes = str.getBytes();//�ַ������ֽ�����
        String s1 = "aacc";
        String s2 = s1.replaceFirst("a", "m");//���滻��һ�������������ַ���
        String s3 = s1.replace("a", "m");//���滻���з����������ַ���


//        System.out.println(charArr);//ABC
//        for (int i = 0; i < strBytes.length; i++) {
//            System.out.println(strBytes[i] + "===========" + (char) strBytes[i]);
//            /*
//            *
//            * 65===========A
//              66===========B
//              67===========C
//            *
//            * */
//        }
//        System.out.println(s2);  //macc
//        System.out.println(s3);  //mmcc
    }

    //�ָ��ַ���
    private static void splitStr() {
        String str = "hello world";
        String[] splitArr = str.split(" ");

//        System.out.println(splitArr); //[Ljava.lang.String;@880ec60
//        for (int i = 0; i < splitArr.length; i++) {
//            System.out.println(splitArr[i]);//hello world
//        }
    }

    //�����ַ���
    //string--->char[]   //�����ַ�����  toCharArray
    //charAt ��ȡ�����ķ�ʽ�����ַ���
    private static void lookStr() {
        String str = "hello world";

    }


    /*
        ����¼��һ���ַ�����ͳ���ַ����д�д��ĸ,Сд��ĸ,�����ַ��������ַ��ĸ���
        ����:
            1.����Scanner����
            2.��ȡ����¼����ַ���  abcd
            3.����int���͵ı���,�ֱ���������
                int bigCount = 0;//ͳ�ƴ�д��ĸ
                int smallCount = 0;//ͳ��Сд��ĸ
                int numCount = 0;//ͳ�������ַ�
                int otherCount = 0;//ͳ�������ַ�
            4.ʹ��for�����ַ���(��ʽһ: toCharArray,��ʽ��: charAt)
            5.��ȡ��ǰ�ַ�,���浽char���͵ı���ch��
            6.ʹ��if��ch�е��ַ������ж�
            6.1 ��� ch>='a' && ch<='z'  ˵����Сд��ĸ smallCount++
            6.2 ���� ��� ch>='A' && ch<='Z'  ˵���Ǵ�д��ĸ bigCount++
            6.3 ����,��� ch>='0' && ch<='9'  ˵���������ַ� numCount++
            6.4 ����                          ˵���������ַ� otherCount++
            7.��ӡ���
     */
    private static void count() {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���: ");
        String str = sc.nextLine();
        int bigCount = 0;//ͳ�ƴ�д��ĸ
        int smallCount = 0;//ͳ��Сд��ĸ
        int numCount = 0;//ͳ�������ַ�
        int otherCount = 0;//ͳ�������ַ�

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {//ch >= 97 && ch <= 122
                smallCount++;
            } else if (ch >= 'A' && ch <= 'Z') {//ch >= 65 && ch <= 90
                bigCount++;
            } else if (ch >= '0' && ch <= '9') {//ch >= 48 && ch<= 56
                numCount++;
            } else {
                otherCount++;
            }

        }
        System.out.println("Сд��ĸ������: " + smallCount);
        System.out.println("��д��ĸ������: " + bigCount);
        System.out.println("�����ַ�������: " + numCount);
        System.out.println("�����ַ�������: " + otherCount);
    }

}
