package com.basic.D20_InnerClass;

public class Demo {
    public static void main(String[] args) {
        /*
        *   �ⲿ������ڲ��࣬�����ڲ���Ķ���
             �ڲ���ֱ�ӷ����ⲿ��
        * */
        Person p = new Person();
        Person.Heart h = new Person().new Heart();


        /*
         �����ڲ���  ���ã���������/ʵ��������ݷ�ʽ,��Ϊ����,���Խ�϶�̬ʹ��
         new ����/�ӿ�(){
            ������д
        }
        */
        Bird b = new Bird() {
            @Override
            public void fly() {
                System.out.println("��");
            }
        };
        b.fly();
    }
}
