package com.net.D08_File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class D05_Properties {
  public static void main(String[] args) {
    //���Լ� ������Map���ϣ��ɽ��IO�� ���ܷ���Ĳ��������ļ�
    String bashPath = "src/com/net/D08_File/file/map.txt";
    Properties pro = new Properties();
    pro.setProperty("age", "18");
    pro.setProperty("sex", "0");
    //д��
    try (FileWriter out = new FileWriter(bashPath);) {
      pro.store(out, "����ע��");
    } catch (IOException e) {
      e.printStackTrace();
    }
    //��ȡ
    try (FileReader in = new FileReader(bashPath)) {
      pro.load(in);
      Set<String> stringSet = pro.stringPropertyNames();
      for (String key : stringSet) {
        System.out.println(key + "=" + pro.getProperty(key));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
