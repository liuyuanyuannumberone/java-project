package com.net.D09_TCP;

import java.io.*;
import java.net.Socket;

public class D01_Client {
  public static void main(String[] args) {
    String bashPath = "src/com/net/D08_File/file/client.txt";
    try (
        InputStream fileIn = new FileInputStream(bashPath);
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream netOut = socket.getOutputStream();
    ) {
      byte[] byteArray = new byte[1024 * 8];
      int sendLen = 0;
      while ((sendLen = fileIn.read(byteArray)) != -1) {
        netOut.write(byteArray, 0, sendLen);
      }
      socket.shutdownOutput(); //����һ��"�������"���ý��ն˵�ѭ������
      System.out.println("�ͻ����ϴ����");
      InputStream in = socket.getInputStream();
      int len = in.read(byteArray);
      System.out.println(new String(byteArray, 0, len));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
