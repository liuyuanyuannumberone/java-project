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

    //����Reflect��������Student��
    //Ϊ�˽������������ϵ�����÷��� ���÷��䴴������

    //����ʱclass�ļ��ļ��أ�new��ʱ�򴴽�class��֮����new��ʱ�򲻻�����class�ļ���
    // ������ǻ������Class���������ڳ����п���ֱ�Ӳ������Class����
    String className = getValue("className");
    String methodName = getValue("methodName");


    //��һ�֣��������� ��ȡClass���� Student stu = new Student();  Class c1=stu.getClass();
    //�ڶ��֣������� ��ȡClass����  Class c2=Student.class;
    //������ ��ȡClass����   Class.forName(String ȫ���޶�������)-������������ com.net.D10_test.Student
    Class stuClass = Class.forName(className);


    // ��ȡClass����Ĺ��췽��
    // ���:stuClass.getConstructors(); //��ȡ���С����С����췽��
    // �����stuClass.getDeclaredConstructors(); //��ȡ���еĹ��췽��
    //һ����stuClass.getConstructor(String.class,int.class) ���ݲ�������,��ȡĳ�������С����췽��
    //һ����stuClass.getDeclaredConstructor(); //��ȡĳ�������С��Ĺ��췽��
    //���ù��췽���������� stuClass.getConstructor(String.class,int.class).newInstance("sssss",3)
    //����ǵ��õ�˽�й��췽�� ��Ҫ�ڲ�������ǰ����:stuClass.getConstructor().setAccessible(true);(�κζ�������)
    Constructor stuClassConstructor = stuClass.getDeclaredConstructor();
    stuClassConstructor.setAccessible(true);
    Object o = stuClassConstructor.newInstance();

    //��ȡ��Ա���Բ�����
    //��� getFields ��ȡ���С����С�����
    //��� getDeclaredFields ��ȡ���е�����
    //���� getField("������")��ȡĳ�������С�����
    // ���� getDeclaredField ��ȡĳ����������
    // declaredField.setAccessible(true);����˽�����Ա���������
    Field declaredField = stuClass.getDeclaredField("str");
    declaredField.setAccessible(true);
    declaredField.set(o, "�������ү");//��������
    declaredField.get(o);  //��ȡ����


    //���÷���
    // getMethods
    //getDeclaredMethods
    //getMethod("������"��String.class)
    //getDeclaredMethod
    //˽�з���  m.setAccessible(true);
    Method m = stuClass.getDeclaredMethod(methodName, String.class);
    m.setAccessible(true);
    Object invoke = m.invoke(o, "���ү��");
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
