package com.net.D08_File;

import java.io.*;

public class D07_TransferStream {
  public static void main(String[] args) {
    //转换流 --字符流  OutputStreamWriter  字符流到字节流的桥梁
    // InputStreamWriter  字节流到字符流的桥梁
    //作用： 指定字符集和将字节流转换为字符流
    String bashPath = "src/com/net/D08_File/file/encode.txt";
    try (
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(bashPath),
            "GBK");
        InputStreamReader in = new InputStreamReader(new FileInputStream(bashPath), "GBK");
    ) {
      out.write("你好");

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(new File(bashPath).length());
  }
}

