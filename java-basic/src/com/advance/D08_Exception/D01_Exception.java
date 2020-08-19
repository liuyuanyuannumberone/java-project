package com.advance.D08_Exception;

import com.basic.D17_DuoTai.Student;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;


public class D01_Exception {
  public static void main(String[] args) {
    //jvmʶ����쳣���ٴ�������ҵ����������쳣���࣬��������쳣����
    // Throwable   ���С��쳣���Ķ�����
    // ��Ϊ  Error�������ࣩ Exception���쳣�ࣩ��RuntimeException����ʱ�쳣   �������쳣��

    try {
      getMaxThrow(new int[1]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());  //���񵽷������Զ����쳣��Ϣ  ��������Խ��
    }

    //��ݼ� alt+enter
    try {
      getMaxThrows(new int[0]);
    }
    catch (Exception e) {  //���봦������������˱������쳣
      e.printStackTrace();
    }


    System.out.println("�������������");
    while (true) {
      try {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
        String str = method();
        str.charAt(0);
      } catch (InputMismatchException e) {  //�����쳣ʱִ��
        System.out.println("�������������");
        break;
      } catch (NullPointerException e) {
        //��ָ���쳣
        System.out.println("�쳣��ϢMessage��" + e.getMessage());//null
        System.out.println("�쳣��ϢString��" + e.toString()); //java.lang.NullPointerException
        e.printStackTrace();  //��ӡ�쳣��ϸ��Ϣ
        break;
      } finally {
        //�����Ƿ�����쳣���ᱻִ��  ͨ������try��catch����return�������
        // finally�еĴ���ᱣ֤��return֮ǰ��ִ�У���������쳣һ��Ҫִ�еĲ�����
        System.out.println("��һ���ᱻִ��");
      }
    }
  }

  //throw ���쳣��Ϣ�׸������ߣ����������в����쳣��Ϣ����������߲������Ҿ��Լ��׳��ҵ��쳣
  public static int getMaxThrow(int[] arr) {
    if (arr == null) throw new NullPointerException("��ָ���쳣");
    if (arr.length == 0) throw new ArrayIndexOutOfBoundsException("��������Խ��");
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      max = arr[i] > max ? arr[i] : max;
    }
    return max;
  }


  //throws �����׳�,�����Exception�������쳣�������߱��봦������쳣
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
