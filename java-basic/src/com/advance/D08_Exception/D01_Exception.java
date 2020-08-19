package com.advance.D08_Exception;

import com.basic.D17_DuoTai.Student;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;


public class D01_Exception {
  public static void main(String[] args) {
    //jvm识别出异常，再从类库中找到描述这种异常的类，创建这个异常对象
    // Throwable   所有“异常”的顶层类
    // 分为  Error（错误类） Exception（异常类）（RuntimeException运行时异常   编译器异常）

    try {
      getMaxThrow(new int[1]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());  //捕获到方法的自定义异常信息  数组索引越界
    }

    //快捷键 alt+enter
    try {
      getMaxThrows(new int[0]);
    }
    catch (Exception e) {  //必须处理，调度者添加了编译器异常
      e.printStackTrace();
    }


    System.out.println("请输入你的年龄");
    while (true) {
      try {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
        String str = method();
        str.charAt(0);
      } catch (InputMismatchException e) {  //出现异常时执行
        System.out.println("年龄必须是整数");
        break;
      } catch (NullPointerException e) {
        //空指针异常
        System.out.println("异常信息Message：" + e.getMessage());//null
        System.out.println("异常信息String：" + e.toString()); //java.lang.NullPointerException
        e.printStackTrace();  //打印异常详细信息
        break;
      } finally {
        //无论是否出现异常都会被执行  通常用在try和catch中有return的情况，
        // finally中的代码会保证在return之前被执行，比如出现异常一定要执行的操作。
        System.out.println("我一定会被执行");
      }
    }
  }

  //throw 把异常信息抛给调度者，调度者自行捕获异常信息，如果调度者不捕获，我就自己抛出我的异常
  public static int getMaxThrow(int[] arr) {
    if (arr == null) throw new NullPointerException("空指针异常");
    if (arr.length == 0) throw new ArrayIndexOutOfBoundsException("数组索引越界");
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      max = arr[i] > max ? arr[i] : max;
    }
    return max;
  }


  //throws 声明抛出,如果有Exception编译器异常，调度者必须处理这个异常
  public static int getMaxThrows(int[] arr) throws NullPointerException,
      ArrayIndexOutOfBoundsException, Exception {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      max = arr[i] > max ? arr[i] : max;
    }
    return max;
  }


  public static String method() {
    return null;
  }

}
