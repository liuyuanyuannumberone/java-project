package com.net.D08_File;

import java.io.File;

public class D02_FileRecursion {
  public static void main(String[] args) {
    //�ݹ� �Լ������Լ�   �ݹ��β���̫�����ջ������ݹ����Ҫ�г���
    int result = recursion(3);
    String bashPath = "src/com/net/D08_File/file/";
    dirForEach(bashPath);

  }

  public static int recursion(int n) {
    if (n == 1) return 1;
    return n * recursion(n - 1);
  }

  public static void dirForEach(String bashPath) {
    File file = new File(bashPath);
    File[] fileArr = file.listFiles();
    //file=null  �ļ�   �����ڵ�Ŀ¼   ϵͳĿ¼���ܱ���
    if (fileArr != null) {
      for (File f : fileArr) {
        if (f.isFile() && f.getName().endsWith(".txt")) {
          System.out.println(f.getName());
        } else if (f.isDirectory()) {
          dirForEach(f.getPath());
        }
      }
    }
  }
}
