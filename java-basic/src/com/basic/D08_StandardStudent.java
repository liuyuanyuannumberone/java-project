package com.basic;

/*
* ��׼��Java���Ҫ��:
*
*  1.���г�Ա����,��private����  �ṩ��Ӧ��get(��ȡֵ)��set(����ֵ)����  ��ֹ�ⲿֱ��ʹ�ó�Ա����
*      alt + insert --> Getter and Setter --> shift + ��(ѡ���������) --> ok
   2.�ṩ�ղκ����ι���
        �ղ�:
            alt + insert --> Constructor --> select none --> ok
        ����:����ֵ��
            alt + insert --> Constructor --> shift + ��(ѡ���������) --> ok
   3. ������ʹ�ó�Ա����ʱ��һ��ʹ��this�ؼ��֣����ֳ�Ա�����;ֲ�����ͬ��
   *
   *
   * ctrl + o  ������д
   * ctrl+ i   ����Ҫ��д�ĳ��󷽷��ͽӿ�����
* */

public class D08_StandardStudent {
    private String name;
    private String gender;
    private int age;
    static String room = "841-401";

    static {
        //��̬����飬�����ھ�̬����ִ�У������ڹ��췽��ִ�У�Ҳ����new��ʱ������ִ�С�
        //��ִֻ��һ��
        System.out.println("��̬����鱻ִ����");
    }

    public static String printRoom() {
//      System.out.println(this.name); ��̬�Ķ���,ֻ��ʹ�þ�̬�Ķ���,
        return D08_StandardStudent.room; //��̬����ֻ�����йأ�������޹�
        /*
        ����: ��static���ε�����,����������ж�����ʹ��,��������,�;���Ķ����޹�,���ڴ���Ψһֻ��һ�ݡ�
        ��̬������,������ļ��ض����ز���ɳ�ʼ��,��ʱû�ж���. ��̬�ķ���,������ֱ�ӵ���
        ��̬��������ֱ�ӷ�����ͨ��Ա�������Ա����,�������ڶ���ġ� ��֮����Ա��������ֱ�ӷ��ʾ�̬������̬������
        * */

        /*
         ������.��̬��Ա����
         ������.��̬��Ա����
         ������ͬһ�����У�����Ҫд������ֱ��ʹ��
         */
    }

    public static void printAll() {
        System.out.println("printRoom  " + printRoom());
        System.out.println("room  " + room);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //���췽��
    public D08_StandardStudent() {
    }

    //��������
    public D08_StandardStudent(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
