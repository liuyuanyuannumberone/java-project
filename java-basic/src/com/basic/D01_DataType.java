package com.basic;


public class D01_DataType {
    //基本数据类型，常量的分类：四类八种
    public static void main(String[] args) {
        byte b = 100;
        short s = 1000;
        int i = 10;
        long l = 12345678900L;
        float f = 5.5F;
        double d = 8.5;
        char c = 'A';
        boolean bool = false;
        System.out.println(b); // 整数常量（byte、short、int、long）
        System.out.println(f); // 浮点数常量（小数）
        System.out.println(c);   // 字符串常量
        System.out.println(bool); // 布尔常量
        //     System.out.println(null);// 空常量。空常量不能直接用来打印输出。
        System.out.println("自动数据类型转换");
        autoConvert();
        System.out.println("强制数据类型转换");
        forceConvert();
        System.out.println("ASCII表");
        ASCII();
    }


    //java参加运算数据类型必须一致
    //自动类型转换
    private static void autoConvert() {
        //自动转换：将取值范围小的类型自动提升为取值范围大的类型
        long L = 10;
        byte a = 1;
        // byte/short/char这三种类型在运算的时候，都会被首先提升成为int类型，然后再计算。
        //a=a+1 和 byte b=a+1报错
    }

    //强制数据类型转换
    private static void forceConvert() {
        //将取值范围大的类型强制转换成取值范围小的类型
        // 可能会让数据损失精度，强制类型转换图解
        int num = (int) 3.99;  // double --> int，强制类型转换，所有的小数位都会被舍弃掉
    }


    //char与十进制  字符在计算机中存储时，先查ASCII表，然后找到十进制，转换为二进制
    private static void ASCII() {
        char ch = 'a';
        // System.out.println(ch);//a
        System.out.println(ch + 1); //98
        System.out.println((char)(ch + 1)); //b
    }
}
