package com.basic;

public class D06_ObjectOriented {
    //��������ǻ���������̵ı��˼��  ���������ǿ��ÿһ�����ܵĲ���  ����������ɶ���ȥ���ù���
    //�������������У�����3�������������װ���̳С���̬
    //�������Ժ���Ϊ�ļ��ϣ������ģ�壩�����������һ��ʵ��������ģ���
    /*
���ʹ�ã�
     1.������ java.lang�е���ֱ��ʹ�ã����� ���Ҫʹ�õ�����ͬһ�����У�Ҳ���õ�����
     2. alt+�س���
     3.��������
     */
    public static void main(String[] args) {
        D07_Student stu = new D07_Student();//stu �ǵ�ֵַ
        stu.name = "lyy";
        stu.gender = "��";
        stu.sleep("����");
        stu.setAge(19);
        System.out.println(stu.getAge());
        D07_Student stu2 = new D07_Student("lyy", "��");
        stu2.print();
    }
}