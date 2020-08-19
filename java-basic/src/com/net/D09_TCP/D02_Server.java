package com.net.D09_TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class D02_Server {
  public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(9999);
    int index = 1;
    while (true) {
      Socket socket = server.accept();
      System.out.println("第：" + index + " 次连接");
      new D02_ServerThread(socket,index++).start();
    }
  }
}
