package com.basic.D19_Final;

public final class Final {
    /*

      final 不可改变  用于修饰 类、方法、变量
      被修饰的类不能被继承,不能有子类
      被修饰的方法不能被继承重写
      被修饰的变量不能被重新赋值 引用类型的变量保存的地址值不能被修改，但是该地址值对应的内寸空间的内容可以被改变

    * */
    final String str = "java";

    public static void main(String[] args) {
        final int a = 5;
    }

    public final void method() {

    }

}
