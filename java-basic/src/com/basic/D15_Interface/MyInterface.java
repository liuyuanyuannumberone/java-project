package com.basic.D15_Interface;

public interface MyInterface {
    /*
     *  �ӿڣ������Ļ���  ���󷽷� ��Ĭ�Ϸ�����jdk8�Լ��Ժ�   ��̬������jdk8�Լ��Ժ� ����
        public abstract ...   public default...     public static...   public static final
       �ӿڲ���ֱ��new����û�о�̬�����
     * */

    //�ӿ��еĳ�Ա�������� ���� ��Ĭ����public static final���Σ���дҲ��
    //��Ϊ�ǳ��������Ա�����ʾ��ֵ��Ȼ��Լ���׳� ÿ�����ʱ����д��Ȼ���»��߷ָ�
    //�ⲿʹ��  �ӿ���.��������
    int Sale_Num = 10; //===> public static final int num = 10;

    static void sleep() {
        System.out.println(Sale_Num);
    }


    //  1.���󷽷���Ĭ�����η� ����ʡ��  public abstract void method();
    void method();


    // 2.Ĭ�Ϸ��� ����ʡ�� public default void print(); �ɽӿڵ�ʵ����������ֱ�ӵ��ã����Բ��ڽӿ�ʵ��������д
    // �ӿ���������µĳ��󷽷������½ӿڵ�ʵ���౨������Ĭ�Ϸ���
    default void print() {
        System.out.println("Ĭ�Ϸ�����ִ����");
    }

    // 3. ��̬���� ֻ���ڽӿڱ���������ʵ������ʹ��,�ɽӿ���ֱ�ӵ��á�
    //�ӿ�ʵ����ľ�̬�����ͽӿڵľ�̬����һ��Ҳ���Ǹ�����д����ȫ�����
    static void show() {
        System.out.println("��̬������ִ����");
    }

}
