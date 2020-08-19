package com.net.D08_File;

import java.io.*;

public class D06_BufferStream {
  public static void main(String[] args) {
    //之前的操作读取多个字节或者字符，使用数组，数组被称为缓存区。
    //缓冲流:基于缓存区，制作了缓冲流，提高读写效率。
    String bashPath = "src/com/net/D08_File/file/";
    byteBufferStream(bashPath);
    charBufferStream(bashPath);
  }

  //字节缓存流
  public static void byteBufferStream(String bashPath) {
    //输入流
    try (
        BufferedInputStream bufferIn = new BufferedInputStream
            (new FileInputStream(bashPath + "ww.txt"));
        BufferedOutputStream buffferOut = new BufferedOutputStream
            (new FileOutputStream(bashPath + "write.txt"));
    ) {
      int n = 0;
    /*

      while ((n = bufferIn.read()) != -1) {
        buffferOut.write(n);
      }
      */
      byte[] byteArr = new byte[1024 * 8]; //8KB
      while ((n = bufferIn.read(byteArr)) != -1) {
        buffferOut.write(byteArr, 0, n);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  //字符缓存流
  public static void charBufferStream(String bashPath) {
    try (
        BufferedReader buffIn = new BufferedReader(new FileReader(bashPath + "ww.txt"));
        BufferedWriter buffOut = new BufferedWriter(new FileWriter(bashPath + "client.txt"));
    ) {
      int n = 0;
      /*
      while ((n = buffIn.read()) != -1) {
        buffOut.write(n);
      }
      */

     /*
     char[] chArr = new char[1024 * 8];
      while ((n = buffIn.read(chArr)) != -1) {
        buffOut.write(chArr, 0, n);
      }
      */
      String row = null;
      while ((row = buffIn.readLine()) != null) {  //readLine不读取换行符
        buffOut.write(row);
        buffOut.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
