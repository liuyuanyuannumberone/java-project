package com.advance;

public class D07_VarElement {
  public static void main(String[] args) {
    sum();
    sum(1, 2, 3, 4, 5);
  }

  //可变参数 语法糖  int[] array={1,2,3,4,5,6,7}
  // 调用可以不传参数,只能传数组类型,   只能定义一个可变参数并且位于参数列表最后
  public static int sum(int... array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }


  //原始方法
  public static int sum(String[] a) {
    int sum = 0;
    //累加
    return sum;
  }
}
