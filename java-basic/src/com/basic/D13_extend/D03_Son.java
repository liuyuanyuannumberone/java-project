package com.basic.D13_extend;

public class D03_Son extends D02_Parent {
    //������Լ̳и���ĳ���private�͹��췽�����������
    //����private�ķ����������޷��̳У������ڸ�����д
    // javaֻ֧�ֵ��̳� ����֧�� A extends B,C,
    //֧�ֶ��̳� B extend A   C extends B��
    //Ĭ���������̳���Object          public class D02_Parent extends ObjectDemo

    String name = "lyy";

    //����ͬ�����
    public void show() {
        String name = "yy";
        System.out.println(name);//yy �����ڲ����ʱ����ͽ�ԭ��
        System.out.println(this.name); //lyy
        System.out.println(super.name); //liuyuanyuan  ����ĳ�Ա�������������û�У�����������
    }

    //����ͬ�������--------������д(Ҫ�󷽷����������б���ȫһ���Ž���д)
    //������д��ݼ� ctrl+o ...������� @Override ���ֻ���������ģ�ȥ��Ҳ���ԡ�
    @Override
    public void method() {
        super.method();
        System.out.println("���Ƕ���");
    }


    //������Լ̳и��࣬��ô�����ʼ���ˣ�����Ҳһ���Ѿ���ʼ���ˣ���ʼ������ִ�й��캯���Ĺ��̡�
    //�����ʼ�������������ʼ����ÿ�δ����������ʱ���ȳ�ʼ������ռ䣬�ٴ��������������.
    public D03_Son() {
        super();//���Բ�д��Ĭ���У�ִ�и���Ĺ��캯�� ������ͬ���˷��������ഫ�����ι���Ĳ���
        System.out.println("�ղι���");
    }
}
