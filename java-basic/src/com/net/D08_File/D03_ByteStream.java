package com.net.D08_File;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D03_ByteStream {
  public static void main(String[] args) throws IOException {
    //
  /*
       IO��  ��д�ļ�����
            ��������������ߣ�   �������ԣ� ������  ���ݴ��ⲿ������
            д ������д���ⲿ�ļ���  ����ֽ�ϣ� �����  ���ݴӳ������
       �ڴ��̵��ļ��У����е����ݱ���ת��Ϊ�����ƣ�bit����java��������Ƶ���С��λ��Byte��

       java�����е����������ʱ���ļ����������Զ��������ļ�����������򸲸�,׷��д���Բ����ǣ�ֻ׷�ӡ�
       java�����е�����������ʱ���ļ������ڱ���
       ��Ҫ�ر���


      �ֽ������ֽڲ��� java��ײ㡢����������������κ��ļ���
        OutputStream--FileOutputStream(����)
        InputStream--FileInputStream(����)


      �ַ������ַ�����  һ���ַ���һ�������ֽڣ����Ա�֤�����Ĳ���һ���ַ���
         Writer��
         Reader��
   */

    String bashPath = "src/com/net/D08_File/file/ww.txt";
//    out(bashPath);  //�����
    input(bashPath);  //������

  }

  private static void out(String bashPath) throws IOException {
    OutputStream out1 = new FileOutputStream(bashPath); //����д
    OutputStream out2 = new FileOutputStream(bashPath, true); //׷��д
    //��һ��
    out2.write(97);   //a
    //�ڶ���
    byte[] byteArray = {98, 99, 100};
    out2.write(byteArray);
    //�ڶ�������
    out2.write("���".getBytes());  //UTF-8 һ������ռ3���ֽ�   GBK����һ������ռ2���ֽ�
    //�ڶ�������
    out2.write(byteArray, 2, 1);

    /*
     * Unixÿ�н�βֻ��"<����>"����"\n"   Windows ÿ�н�β��"<�س�><����>"����"\r\n"
     *  \r\n(�س�����)��window�ϵĻ��з���\n(����)��linux�ϵĻ��з�
      �س�"��carriage return����"����"��line feed�� CRLF
     * Unix/Macϵͳ�µ��ļ���Windows��򿪵Ļ����������ֻ���һ��,��Ϊwindows��Ϊû�л��з���
     * ��Windows����ļ���Unix/Mac�´򿪵Ļ�����ÿ�еĽ�β���ܻ���һ��^M���š�
     * */

    out2.write(13);//�س�
    out2.write(10); //����
    out2.write("��԰԰".getBytes());
    out2.write("\r\n".getBytes());
//    System.out.println("liuyuanyuan".getBytes()); //[B@1b6d3586
    out2.write("liuyuanyuan".getBytes());

    System.out.println(new File(bashPath).length());
    //�ر���
    out2.close();
  }

  private static void input(String bashPath) throws IOException {
    InputStream in = new FileInputStream(bashPath);
  /*
   int a;
    List<Integer> intArr = new ArrayList<>();
    List<Character> charArr = new ArrayList<>();
    while ((a = in.read()) != -1) { //��ȡ��һ���ֽ�   a=-1���Ƕ����ļ�ĩβ
      intArr.add(a);
      System.out.print((char) a);
      charArr.add((char) a);
    }
    System.out.println();
    System.out.println(intArr.toString());
    System.out.println(charArr);
    */

    //һ�ζ�ȡ����ֽ�,�����
    int t = 0;
    byte[] byteArray = new byte[3];
    while ((t = in.read(byteArray)) != -1) {  //tΪ����ĸ���
//      System.out.println(t);//���
//      System.out.println(Arrays.toString(byteArray));
      String str = new String(byteArray, 0, t);  //�ֽ�����ת��Ϊ�ַ�����ӡ�ᱣ��ԭ��ʽ
      System.out.print(str);  //������ӡ�ļ��ĸ�ʽ
    }
    in.close();
  }
}