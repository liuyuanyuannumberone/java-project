package com.basic;

/*
       java.lang.String类
       字符串是常量；它们的值在创建之后不能更改,它们可以被共享。
       使用双引号""引起来的内容,都是String的对象,虽然没有写new,但是底层仍然有new的过程
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

    //判断
    private static void judge() {
        String s1 = new String();
        String s2 = "hello";
        String s3 = "HELLO";
        String s4 = "H";
        boolean res = s2.equals(s3); //区分大小写
        boolean resA = s2.equalsIgnoreCase(s3);///不区分字母大小写
        boolean contains = s3.contains(s4);

//        System.out.println("-" + s1 + "-");//""
//        System.out.println(contains); //true
//        System.out.println(res); //false
//        System.out.println(resA); //true
    }

    //获取
    private static void get() {
        String str = "hello world";
        int len = str.length();
        String concat = str.concat(" java");
        char ch = str.charAt(4);//获取索引为4的字符
        int indexFirst = str.indexOf("or"); //or第一次出现的索引值,如果不存在返回-1
        String subBegin = str.substring(4);
        String subBeginEnd = str.substring(4, 10);//包含4，不包含10


//        System.out.println(len);//11
//        System.out.println(concat);//hello world java
//        System.out.println(ch);//o
//        System.out.println(indexFirst);//7
//        System.out.println(subBegin); //o world
//        System.out.println(subBeginEnd); //o worl
    }

    //转换
    private static void transfer() {
        String str = "ABC";
        char[] charArr = str.toCharArray(); //字符串变字符数组
        byte[] strBytes = str.getBytes();//字符串变字节数组
        String s1 = "aacc";
        String s2 = s1.replaceFirst("a", "m");//会替换第一个符合条件的字符串
        String s3 = s1.replace("a", "m");//会替换所有符合条件的字符串


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

    //分割字符串
    private static void splitStr() {
        String str = "hello world";
        String[] splitArr = str.split(" ");

//        System.out.println(splitArr); //[Ljava.lang.String;@880ec60
//        for (int i = 0; i < splitArr.length; i++) {
//            System.out.println(splitArr[i]);//hello world
//        }
    }

    //遍历字符串
    //string--->char[]   //遍历字符数组  toCharArray
    //charAt 获取索引的方式遍历字符串
    private static void lookStr() {
        String str = "hello world";

    }


    /*
        键盘录入一个字符串，统计字符串中大写字母,小写字母,数字字符及其它字符的个数
        分析:
            1.创建Scanner对象
            2.获取键盘录入的字符串  abcd
            3.定义int类型的变量,分别用来计数
                int bigCount = 0;//统计大写字母
                int smallCount = 0;//统计小写字母
                int numCount = 0;//统计数字字符
                int otherCount = 0;//统计其它字符
            4.使用for遍历字符串(方式一: toCharArray,方式二: charAt)
            5.获取当前字符,保存到char类型的变量ch中
            6.使用if对ch中的字符进行判断
            6.1 如果 ch>='a' && ch<='z'  说明是小写字母 smallCount++
            6.2 否则 如果 ch>='A' && ch<='Z'  说明是大写字母 bigCount++
            6.3 否则,如果 ch>='0' && ch<='9'  说明是数字字符 numCount++
            6.4 否则                          说明是其它字符 otherCount++
            7.打印结果
     */
    private static void count() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str = sc.nextLine();
        int bigCount = 0;//统计大写字母
        int smallCount = 0;//统计小写字母
        int numCount = 0;//统计数字字符
        int otherCount = 0;//统计其它字符

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
        System.out.println("小写字母的数量: " + smallCount);
        System.out.println("大写字母的数量: " + bigCount);
        System.out.println("数字字符的数量: " + numCount);
        System.out.println("其他字符的数量: " + otherCount);
    }

}
