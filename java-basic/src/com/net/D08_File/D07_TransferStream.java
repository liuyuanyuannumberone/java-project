package com.net.D08_File;

import java.io.*;

public class D07_TransferStream {
  public static void main(String[] args) {
    //ת���� --�ַ���  OutputStreamWriter  �ַ������ֽ���������
    // InputStreamWriter  �ֽ������ַ���������
    //���ã� ָ���ַ����ͽ��ֽ���ת��Ϊ�ַ���
    String bashPath = "src/com/net/D08_File/file/encode.txt";
    try (
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(bashPath),
            "GBK");
        InputStreamReader in = new InputStreamReader(new FileInputStream(bashPath), "GBK");
    ) {
      out.write("���");

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(new File(bashPath).length());
  }
}

