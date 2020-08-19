package com.net.D08_File;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D03_ByteStream {
  public static void main(String[] args) throws IOException {
    //
  /*
       IO流  读写文件内容
            读（读到程序里边）   （到大脑） 输入流  数据从外部到程序
            写 （程序写到外部文件）  （到纸上） 输出流  数据从程序到外边
       在磁盘的文件中，所有的数据必须转换为二进制（bit），java处理二进制的最小单位是Byte。

       java中所有的输出流构造时，文件不存在则自动创建新文件，如果存在则覆盖,追加写可以不覆盖，只追加。
       java中所有的输入流构造时，文件不存在报错。
       需要关闭流


      字节流：字节操作 java最底层、最基本的流。操作任何文件。
        OutputStream--FileOutputStream(子类)
        InputStream--FileInputStream(子类)


      字符流：字符操作  一个字符不一定几个字节，可以保证完整的操作一个字符。
         Writer：
         Reader：
   */

    String bashPath = "src/com/net/D08_File/file/ww.txt";
//    out(bashPath);  //输出流
    input(bashPath);  //输入流

  }

  private static void out(String bashPath) throws IOException {
    OutputStream out1 = new FileOutputStream(bashPath); //覆盖写
    OutputStream out2 = new FileOutputStream(bashPath, true); //追加写
    //第一种
    out2.write(97);   //a
    //第二种
    byte[] byteArray = {98, 99, 100};
    out2.write(byteArray);
    //第二种延伸
    out2.write("你好".getBytes());  //UTF-8 一个中文占3个字节   GBK编码一个中文占2个字节
    //第二种延伸
    out2.write(byteArray, 2, 1);

    /*
     * Unix每行结尾只有"<换行>"，即"\n"   Windows 每行结尾是"<回车><换行>"，即"\r\n"
     *  \r\n(回车换行)是window上的换行符，\n(换行)是linux上的换行符
      回车"（carriage return）和"换行"（line feed） CRLF
     * Unix/Mac系统下的文件在Windows里打开的话，所有文字会变成一行,因为windows认为没有换行符。
     * 而Windows里的文件在Unix/Mac下打开的话，在每行的结尾可能会多出一个^M符号。
     * */

    out2.write(13);//回车
    out2.write(10); //换行
    out2.write("刘园园".getBytes());
    out2.write("\r\n".getBytes());
//    System.out.println("liuyuanyuan".getBytes()); //[B@1b6d3586
    out2.write("liuyuanyuan".getBytes());

    System.out.println(new File(bashPath).length());
    //关闭流
    out2.close();
  }

  private static void input(String bashPath) throws IOException {
    InputStream in = new FileInputStream(bashPath);
  /*
   int a;
    List<Integer> intArr = new ArrayList<>();
    List<Character> charArr = new ArrayList<>();
    while ((a = in.read()) != -1) { //读取第一个字节   a=-1就是读到文件末尾
      intArr.add(a);
      System.out.print((char) a);
      charArr.add((char) a);
    }
    System.out.println();
    System.out.println(intArr.toString());
    System.out.println(charArr);
    */

    //一次读取多个字节,读多次
    int t = 0;
    byte[] byteArray = new byte[3];
    while ((t = in.read(byteArray)) != -1) {  //t为读入的个数
//      System.out.println(t);//会变
//      System.out.println(Arrays.toString(byteArray));
      String str = new String(byteArray, 0, t);  //字节数组转换为字符串打印会保留原格式
      System.out.print(str);  //完整打印文件的格式
    }
    in.close();
  }
}