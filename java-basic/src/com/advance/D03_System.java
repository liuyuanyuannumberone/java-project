package com.advance;

import java.util.Arrays;

public class D03_System {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};


    //赋值数组
    int[] arrCopy = new int[arr.length];
    System.arraycopy(arr, 0, arrCopy, 0, arr.length);
    System.out.println(Arrays.toString(arrCopy));  //[1, 2, 3]

    // 20,3,4,5,6 放在1的后面  0挪到最后
    int[] a = {10, 0, 20, 3, 4, 5, 6};
    System.arraycopy(a, 2, a, 1, 5);
    a[a.length - 1] = 0;
    System.out.println(Arrays.toString(a));

    //获取当前系统的毫秒值
    System.currentTimeMillis();


  }
}
