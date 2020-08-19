package com.net.D08_File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class D05_Properties {
  public static void main(String[] args) {
    //属性集 本质是Map集合，可结合IO流 ，很方便的操作配置文件
    String bashPath = "src/com/net/D08_File/file/map.txt";
    Properties pro = new Properties();
    pro.setProperty("age", "18");
    pro.setProperty("sex", "0");
    //写入
    try (FileWriter out = new FileWriter(bashPath);) {
      pro.store(out, "这是注释");
    } catch (IOException e) {
      e.printStackTrace();
    }
    //读取
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
