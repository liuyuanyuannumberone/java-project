package com.net.D08_File;

import java.io.*;

public class D06_BufferStream {
  public static void main(String[] args) {
    //֮ǰ�Ĳ�����ȡ����ֽڻ����ַ���ʹ�����飬���鱻��Ϊ��������
    //������:���ڻ������������˻���������߶�дЧ�ʡ�
    String bashPath = "src/com/net/D08_File/file/";
    byteBufferStream(bashPath);
    charBufferStream(bashPath);
  }

  //�ֽڻ�����
  public static void byteBufferStream(String bashPath) {
    //������
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

  //�ַ�������
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
      while ((row = buffIn.readLine()) != null) {  //readLine����ȡ���з�
        buffOut.write(row);
        buffOut.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
