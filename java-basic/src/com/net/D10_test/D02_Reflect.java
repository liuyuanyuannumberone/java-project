package com.net.D10_test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

public class D02_Reflect {
  public static void main(String[] args) throws Exception {
//    Student stu = new Student();
//    stu.sleep();

    //上面Reflect类依赖于Student类
    //为了解决这种依赖关系，采用反射 利用反射创建对象

    //运行时class文件的加载，new的时候创建class，之后再new的时候不会再找class文件。
    // 反射就是基于这个Class对象，我们在程序中可以直接操作这个Class对象
    String className = getValue("className");
    String methodName = getValue("methodName");


    //第一种（对象名） 获取Class对象 Student stu = new Student();  Class c1=stu.getClass();
    //第二种（类名） 获取Class对象  Class c2=Student.class;
    //第三种 获取Class对象   Class.forName(String 全名限定的类名)-带包名的类名 com.net.D10_test.Student
    Class stuClass = Class.forName(className);


    // 获取Class对象的构造方法
    // 多个:stuClass.getConstructors(); //获取所有“公有”构造方法
    // 多个：stuClass.getDeclaredConstructors(); //获取所有的构造方法
    //一个：stuClass.getConstructor(String.class,int.class) 根据参数类型,获取某个“公有”构造方法
    //一个：stuClass.getDeclaredConstructor(); //获取某个“所有”的构造方法
    //利用构造方法产生对象 stuClass.getConstructor(String.class,int.class).newInstance("sssss",3)
    //如果是调用的私有构造方法 需要在产生对象前调用:stuClass.getConstructor().setAccessible(true);(任何都能设置)
    Constructor stuClassConstructor = stuClass.getDeclaredConstructor();
    stuClassConstructor.setAccessible(true);
    Object o = stuClassConstructor.newInstance();

    //获取成员属性并复制
    //多个 getFields 获取所有“公有”属性
    //多个 getDeclaredFields 获取所有的属性
    //单个 getField("属性名")获取某个“公有”属性
    // 单个 getDeclaredField 获取某个所有属性
    // declaredField.setAccessible(true);访问私有属性必须加上这个
    Field declaredField = stuClass.getDeclaredField("str");
    declaredField.setAccessible(true);
    declaredField.set(o, "我是你大爷");//设置属性
    declaredField.get(o);  //获取属性


    //调用方法
    // getMethods
    //getDeclaredMethods
    //getMethod("方法名"，String.class)
    //getDeclaredMethod
    //私有方法  m.setAccessible(true);
    Method m = stuClass.getDeclaredMethod(methodName, String.class);
    m.setAccessible(true);
    Object invoke = m.invoke(o, "你大爷的");
    System.out.println(invoke);

  }

  public static String getValue(String key) {
    String bashPath = "src/com/net/D10_test/config.txt";
    Properties pro = new Properties();
    try (FileReader in = new FileReader(bashPath)) {
      pro.load(in);
      //    System.out.println(key + ":" + pro.getProperty(key));
      return pro.getProperty(key);
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

}
