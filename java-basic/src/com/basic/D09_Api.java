package com.basic;

import java.util.Random;
import java.util.Scanner;    //alt+enter ����


public class D09_Api {
    public static void main(String[] args) {
//        random();
        scanner();
//        math();
    }

    private static void random() {
        Random r = new Random();  //����0-10(������10)�������
        for (int i = 0; i < 30; i++) {
//            System.out.println(i + ":" + r.nextInt(10));
        }
    }

    private static void scanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������֣�");
        System.out.println("������������ǣ�" + sc.nextInt());
    }


    private static void math() {
        System.out.println(Math.abs(10));//10 ����ֵ
        System.out.println(Math.ceil(6.6));//7.0 ���ش��ڻ��ߵ��ڲ�������С��������
        System.out.println(Math.floor(6.6));//6.0 ����С�ڻ��ߵ��ڲ�������������
        System.out.println(Math.round(6.49));//6 ������ӽ������� long��(�൱���������뷽��)


    }
}