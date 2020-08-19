package com.advance.D06_Collection;

//����Խ�� ArrayIndexOutOfBoundsException
//��ָ���쳣 java.lang.NullPointerException  int[] a=null;

import java.lang.reflect.Array;
import java.util.Arrays;

public class D01_Array {
  public static void main(String[] args) {
    int[] arr = new int[6];
    int[] a = new int[]{1, 2, 3};
    int[] b = {1, 2, 3};
    System.out.println(a); //[I@58ceff1 �������ƴ����������ڴ�ռ�ĵ�ֵַ
    System.out.println(a[0]);
    System.out.println(a.length);
    arrayErgodic();
    arrayReverse();
    staticArrayMethod();
  }

  //�������
  private static void arrayErgodic() {
    int[] array = {10, 20, 30, 40, 50};
    int max = 0;
    for (int i = 0; i < array.length; i++) {
      max = array[i] > max ? array[i] : max;
    }
    System.out.println(max);
  }

  //���鷴ת
  private static void arrayReverse() {
    int[] array = {10, 20, 30, 40, 50, 60};

    //һ��д��
     /*        int start = 0, end = array.length - 1;
        int temp = 0;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }*/

    //����д��
    for (int start = 0, end = array.length - 1; start < end; start++, end--) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
    }

  }

  /*
  �����࣬���ȫ�Ǿ�̬������������ֱ�ӵ���
  * */
  private static void staticArrayMethod() {
    int[] array = {100, 90, 80, 50, 70, 60};
    System.out.println(Arrays.toString(array));  //�������ַ��� [100, 90, 80, 50, 70, 60]
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));  //[50, 60, 70, 80, 90, 100]

    String str = "liuyuanyuan";
    char[] chs = str.toCharArray(); //[l, i, u, y, u, a, n, y, u, a, n]
    Arrays.sort(chs); //[a, a, i, l, n, n, u, u, u, y, y]
    System.out.println(Arrays.toString(chs));
  }


}
