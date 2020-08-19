package com.net.D09_TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class D01_Server {
  public static void main(String[] args) {
    String bashPath = "src/com/net/D08_File/file/server.txt";
    try (
        OutputStream fileOut = new FileOutputStream(bashPath);
        ServerSocket server = new ServerSocket(8888);
    ) {
      Socket socket = server.accept();
      InputStream serverIn = socket.getInputStream();
      System.out.println("来自于客户端" + socket.getInetAddress().getHostAddress() + "请求");
      byte[] byteArray = new byte[1024 * 8];
      int netlen = 0;
      while ((netlen = serverIn.read(byteArray)) != -1) {
        fileOut.write(byteArray, 0, netlen);
      }
      OutputStream netOut = socket.getOutputStream();
      netOut.write("服务器接收完毕".getBytes());
      socket.shutdownOutput();
      server.close();
      socket.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
