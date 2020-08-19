package com.net.D09_TCP;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class D02_Client {
  public static void main(String[] args) throws IOException {
    String bashPath = "src/com/net/D08_File/file/ww.txt";
    for (int i = 0; i < 10; i++) {
      int n = i;
      new Thread() {
        @Override
        public void run() {
          System.out.println("第：" + (n + 1) + " 个客户开始上传！");
          Socket socket = null;
          try {
            socket = new Socket("127.0.0.1", 9999);
            FileInputStream fileIn = new FileInputStream(bashPath);
            OutputStream netOut = socket.getOutputStream();
            byte[] byteArray = new byte[1024 * 8];
            int len = 0;
            while ((len = fileIn.read(byteArray)) != -1) {
              netOut.write(byteArray, 0, len);
            }
            socket.shutdownOutput();
            fileIn.close();
            socket.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }.start();
    }

  }
}
