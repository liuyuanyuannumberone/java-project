package com.net.D09_TCP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class D02_ServerThread extends Thread{
  private Socket socket;
  private int index;
  private  String bashPath = "src/com/net/D08_File/file/";
  public D02_ServerThread(Socket socket, int i) {
    this.socket = socket;
    this.index = i;
  }
  @Override
  public void run() {
    InputStream netIn = null;
    try {
      netIn = socket.getInputStream();
      FileOutputStream fileOut = new FileOutputStream(bashPath+"0"+this.index+".txt");
      byte[] byteArray = new byte[1024 * 8];
      int len = 0;
      while ((len = netIn.read(byteArray)) != -1) {
        fileOut.write(byteArray,0,len);
      }
      fileOut.close();
      socket.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
