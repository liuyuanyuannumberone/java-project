package com.basic;


public class D01_DataType {
    //�����������ͣ������ķ��ࣺ�������
    public static void main(String[] args) {
        byte b = 100;
        short s = 1000;
        int i = 10;
        long l = 12345678900L;
        float f = 5.5F;
        double d = 8.5;
        char c = 'A';
        boolean bool = false;
        System.out.println(b); // ����������byte��short��int��long��
        System.out.println(f); // ������������С����
        System.out.println(c);   // �ַ�������
        System.out.println(bool); // ��������
        //     System.out.println(null);// �ճ������ճ�������ֱ��������ӡ�����
        System.out.println("�Զ���������ת��");
        autoConvert();
        System.out.println("ǿ����������ת��");
        forceConvert();
        System.out.println("ASCII��");
        ASCII();
    }


    //java�μ������������ͱ���һ��
    //�Զ�����ת��
    private static void autoConvert() {
        //�Զ�ת������ȡֵ��ΧС�������Զ�����Ϊȡֵ��Χ�������
        long L = 10;
        byte a = 1;
        // byte/short/char�����������������ʱ�򣬶��ᱻ����������Ϊint���ͣ�Ȼ���ټ��㡣
        //a=a+1 �� byte b=a+1����
    }

    //ǿ����������ת��
    private static void forceConvert() {
        //��ȡֵ��Χ�������ǿ��ת����ȡֵ��ΧС������
        // ���ܻ���������ʧ���ȣ�ǿ������ת��ͼ��
        int num = (int) 3.99;  // double --> int��ǿ������ת�������е�С��λ���ᱻ������
    }


    //char��ʮ����  �ַ��ڼ�����д洢ʱ���Ȳ�ASCII��Ȼ���ҵ�ʮ���ƣ�ת��Ϊ������
    private static void ASCII() {
        char ch = 'a';
        // System.out.println(ch);//a
        System.out.println(ch + 1); //98
        System.out.println((char)(ch + 1)); //b
    }
}
