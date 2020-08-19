package com.advance.D04_StringBuilder;

public class D01_StringBuilder {
  public static void main(String[] args) {
    //构建字符串,以后做字符串连接，建议使用。string的工具类
    StringBuilder bld = new StringBuilder();
    bld.append("hello"); //返回值是他本身，可以链式编程
    bld.append("world");
    bld.append("121").append(32323);
    System.out.println(bld.capacity());//34
    System.out.println(bld.length()); //26

  }
}
