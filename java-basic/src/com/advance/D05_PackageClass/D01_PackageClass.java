package com.advance.D05_PackageClass;

public class D01_PackageClass {
  public static void main(String[] args) {
    //包装类  四类八种 和ArrayList那个一样 Integer Character
    //作用：本类型工具的方法

    //String 转换为基本类型   基本类型转换为String
    System.out.println(Integer.parseInt("24")+1);
    System.out.println(Integer.valueOf("24")+1);
    System.out.println(Double.parseDouble("24.12"));

    String str = 10 + "";
    Integer.toString(10);//除了Character包装类，其他包装类都有toString方法



  }
}
