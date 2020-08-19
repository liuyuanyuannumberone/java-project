package com.basic;

public class D03_Flow {
    //for
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println("if..else");
        ifElse();
        System.out.println("while");
        whilefun();
        System.out.println("break...continue");
        break_continue();
        System.out.println("switch...case");
        switchCase();
    }

    //if ..else
    private static void ifElse() {
        int score = 120;
        if (score >= 90 && score <= 100) {
            System.out.println("����");
        } else if (score >= 80 && score < 90) {
            System.out.println("��");
        } else if (score >= 70 && score < 80) {
            System.out.println("��");
        } else if (score >= 60 && score < 70) {
            System.out.println("����");
        } else if (score >= 0 && score < 60) {
            System.out.println("������");
        } else {
            System.out.println("���ݴ���");
        }
    }

    //while  do...while
    private static void whilefun() {
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
        System.out.println("do...while");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }


    //switch...case    switch�ı��ʽ�������� byte/short/int  /char/String  /enum
    private static void switchCase() {
        int num = 0;
        switch (num) {
            case 1:
                System.out.println("���");
                break;
            case 2:
                System.out.println("�Һ�");
                break;
            case 3:
                System.out.println("��Һ�");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("���");
                break;
            default:
                System.out.println("���ã���Ҳ�á�");
                break;
        }
    }



    //break�ؼ��ֵ��÷��г��������֣�
    //��������switch��䵱�У�һ��ִ�У�����switch������̽�����
    // ����������ѭ����䵱�У�һ��ִ�У�����ѭ��������̽��������ѭ����
    private static void break_continue() {
        for (int m = 1; m <= 6; m++) {
            if (m == 4) {
//				break;
                continue;
            }
            System.out.println(m);
        }
    }

}