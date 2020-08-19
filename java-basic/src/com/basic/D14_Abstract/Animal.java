package com.basic.D14_Abstract;

/*
    ������: ��������Ҫ��,���Ǿ�����ôʵ��, ���಻����,�����Լ�����
    ���еĶ��ﶼ�߱��ԵĹ���,������ô��,��ʲô,����û�а취��ͳһ�涨,�������Լ�����,
    �������ж�������඼Ӧ�þ߱��Ե�����.

    ע������:
       1.�����಻��ֱ�Ӵ�������  Animal a = new Animal();
       2.���า����д�������е����г��󷽷�  ctrl + i  (����Ҫ������д�ķ���)
       3.�������б���Ҫ�й��췽��,���������ʼ�������Ա
 */

// ���������
public abstract class Animal {
    private String name;

    public abstract void eat();  //������󷽷�

    //�ղι���
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
