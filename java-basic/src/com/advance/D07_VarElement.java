package com.advance;

public class D07_VarElement {
  public static void main(String[] args) {
    sum();
    sum(1, 2, 3, 4, 5);
  }

  //�ɱ���� �﷨��  int[] array={1,2,3,4,5,6,7}
  // ���ÿ��Բ�������,ֻ�ܴ���������,   ֻ�ܶ���һ���ɱ��������λ�ڲ����б����
  public static int sum(int... array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }


  //ԭʼ����
  public static int sum(String[] a) {
    int sum = 0;
    //�ۼ�
    return sum;
  }
}
