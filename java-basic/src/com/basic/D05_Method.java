package com.basic;

public class D05_Method {
    public static void main(String[] args) {
        int c = Add(1, 2);
        System.out.println(c);
        System.out.println(getSum(1,2));
        System.out.println(getSum(1,2,3));
        int[] a={1,2,3,4,5,6,7,8,10};
        printArr(a);
    }

    //�������붨��������
    //�������Զ���������Ƕ�׶���
    private static int Add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b)); //1+2=3
        System.out.println(a + '+' + b + '=' + (a + b)); //110
        return a + b;
    }


    //�������أ�ͬһ�����У����������ͬ�������б�ͬ���������˳��ͬ�����������ͣ��ķ���������ʹ����ͬ�����ơ�
    //���ͬ����ͬ�εķ���������ͬһ�����С�
    private static int getSum(int a ,int b){
         return a+b;
    }
    private static int getSum(int a ,int b,int c){
        return a+b+c;
    }

    //������Ϊ�β�
    private static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
