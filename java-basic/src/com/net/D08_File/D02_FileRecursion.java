package com.net.D08_File;

import java.io.File;

public class D02_FileRecursion {
  public static void main(String[] args) {
    //递归 自己调用自己   递归层次不能太深，否则栈溢出；递归必须要有出口
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
    //file=null  文件   不存在的目录   系统目录不能遍历
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
