package com.net.D08_File;

import java.io.*;

public class D04_CharStream {
  /*
  字符流：字符操作  一个字符不一定几个字节，可以保证完整的操作一个字符。只能操作纯文本文件
   Writer-->OutputStreamWriter(转换流)--->子类FileWriter
   Reader-->InputStreamWriter(转换流)---->FileReader

   */
  public static void main(String[] args) throws IOException {
    String bashPath = "src/com/net/D08_File/file/ww.txt";
//    out(bashPath);
    input(bashPath);
  }

  public static void out(String bashPath) throws IOException {
    /*
    字符流write输出，不是直接输出，而是先输出到缓存区，需要刷新缓存，当缓存满时，自己会自动刷新缓存
     */
    Writer out = new FileWriter(bashPath);

    out.write(99); //输出一个字符

    char[] ch = {'a', 'b', '1'};
    out.write(ch);  //输出一个字符数组
    out.write(ch, 2, 1);

    out.write("我终于可以输出字符串了");  //输出一个字符串
    out.write("我爱java", 2, 4);

    out.flush();//刷新缓存
    out.close();  //flush+close
  }

  public static void input(String bashPath) throws IOException {
    Reader in = new FileReader(bashPath);
    int c = 0;

    //一次读取一个字符
    /*
    while ((c = in.read()) != -1) {
      System.out.print((char) c);
    }
    */

    //一次读取多个字符
    char[] chArr = new char[2];
    while ((c = in.read(chArr)) != -1) {
      String str = new String(chArr, 0, c);
      System.out.println(str);
    }
    in.close();
  }


  //JDK7以后 IO异常的处理,会自动关闭close。  ；后边alt+enter  ，然后再alt+enter快捷键
  public static void exception() {
    try (
        FileWriter out = new FileWriter("src/com/net/D08_File/file/ww.txt");
    ) {
      out.write(12);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

