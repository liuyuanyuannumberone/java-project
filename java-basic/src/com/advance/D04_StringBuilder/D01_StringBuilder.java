package com.advance.D04_StringBuilder;

public class D01_StringBuilder {
  public static void main(String[] args) {
    //�����ַ���,�Ժ����ַ������ӣ�����ʹ�á�string�Ĺ�����
    StringBuilder bld = new StringBuilder();
    bld.append("hello"); //����ֵ��������������ʽ���
    bld.append("world");
    bld.append("121").append(32323);
    System.out.println(bld.capacity());//34
    System.out.println(bld.length()); //26

  }
}
