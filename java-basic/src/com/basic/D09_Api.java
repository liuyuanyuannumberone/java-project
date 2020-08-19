package com.basic;

import java.util.Random;
import java.util.Scanner;    //alt+enter 导包


public class D09_Api {
    public static void main(String[] args) {
//        random();
        scanner();
//        math();
    }

    private static void random() {
        Random r = new Random();  //产生0-10(不包含10)随机整数
        for (int i = 0; i < 30; i++) {
//            System.out.println(i + ":" + r.nextInt(10));
        }
    }

    private static void scanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        System.out.println("您输入的数字是：" + sc.nextInt());
    }


    private static void math() {
        System.out.println(Math.abs(10));//10 绝对值
        System.out.println(Math.ceil(6.6));//7.0 返回大于或者等于参数的最小的整数。
        System.out.println(Math.floor(6.6));//6.0 返回小于或者等于参数最大的整数。
        System.out.println(Math.round(6.49));//6 返回最接近参数的 long。(相当于四舍五入方法)


    }
}