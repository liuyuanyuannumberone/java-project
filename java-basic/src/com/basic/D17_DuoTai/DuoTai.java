package com.basic.D17_DuoTai;

public class DuoTai {
    /*
         ��̬��ָ������ж�̬�ԣ�����������������д������
         ǰ�������� 1.Ҫ�м̳л�ӿڵ�ʵ��
                   2.����Ҫ�з���������д����Ȼʧȥ�˶�̬������
                   3.�������͵ı���ָ��������Ķ���,�������������ĵ�ַ

                   "����ʱ��������û�з���������ʱ�����෽��"

     ��̬�ı���  ����ת��    �൱���Զ�ת�����͡�
             ��������ת��    �൱��ǿ������ת��,����ֻ��ת��Ϊԭ����С����
              ���ȷ��ԭ��ת���Ķ���  instanceof

    * */

    public static void main(String[] args) {
        Person a = new Student();
        showPerson(a);
        a = new Teacher();
        showPerson(a);
    }

    //���Person�ж������  ���������
    //������߽ӿڵı�������Ϊ�����Ĳ���������˷�������չ�ԡ�
    //���÷���ʱ�����Դ����������ʵ�������
    private static void showPerson(Person p) {
        if (p instanceof Teacher) {
            Teacher t = (Teacher) p;  //ǿ������ת��
            t.method();
        }
        if (p instanceof Student) {
            Student s = (Student) p;
            s.ddup();
        }
    }
}
