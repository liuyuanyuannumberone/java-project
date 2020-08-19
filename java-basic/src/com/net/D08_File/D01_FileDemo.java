package com.net.D08_File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class D01_FileDemo {
  public static void main(String[] args) throws IOException, InterruptedException {
    //file类可以读取文件或者目录信息
    //File类不能读写文件的内容，只能使用IO流类
    String bashPath = "src/com/net/D08_File/file/";
//    creaeFile();
//    getFile();
//    judge();
//    operate(bashPath);
    loop(bashPath);
  }

  /*
      Filed的构造方法
      public File(String pathname)通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
      public File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例。
      public File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
     */
  private static void creaeFile() {
    //绝对路径：第一种
    File file1 = new File("D:\\dataPapaer\\vue\\javaData\\project\\src\\com\\net\\D08_File\\file");
    File file2 = new File("D:/dataPapaer/vue/javaData/project/src/com/net/D08_File/file");
    //System.out.println("我好:\"你好\"");  //我好:"你好" 转义字符

    //相对路径 是项目根目录     第一种
    File file3 = new File("src/com/net/D08_File/file/测试.txt");
    //第二种
    File file4 = new File("src/com/net/D08_File/", "file/测试.txt");
    //第三种
    File file5 = new File("src/com/net/D08_File/");
    File file6 = new File(file5, "file/测试.txt");
  }

  /*
     获取文件
    public String getAbsolutePath() File的绝对路径。
   public String getPath() File构造路径。
  public String getName() 文件或目录的名称。
  public long length() 文件的长度。单位是Byte 不能操作文件夹
  */
  private static void getFile() {
    File file1 = new File("D:/dataPapaer/vue/javaData/project/src/com/net/D08_File/file/测试.txt");
    File file2 = new File("src/com/net/D08_File/file/测试.txt");
    System.out.println(file1.getAbsolutePath());// D:\dataPapaer\vue\javaData\project\src\com\net\D08_File\file\测试.txt
    System.out.println(file2.getAbsolutePath());// D:\dataPapaer\vue\javaData\project\src\com\net\D08_File\file\测试.txt
    System.out.println(file1.getPath());// D:\dataPapaer\vue\javaData\project\src\com\net\D08_File\file\测试.txt
    System.out.println(file2.getPath()); //  src\com\net\D08_File\file\测试.txt
    System.out.println(file1.getName()); // 测试.txt
    System.out.println(file2.getName()); // 测试.txt
    System.out.println(file1.length()); // 4
    System.out.println(file2.length()); // 4
  }

  //判断文件或者目录是否存在    是否为目录  是否为文件
  public static void judge() {
    File file = new File("src/com/net/D08_File/file/测试.txt");
    System.out.println(file.exists());  //文件或者目录是否存在  true
    System.out.println(file.isDirectory()); //是否为目录  false
    System.out.println(file.isFile());  //是否为文件  true
  }

  //创建和删除
  /*
      public boolean createNewFile() 文件不存在   创建一个新文件, 否则不执行任何操作
      public boolean mkdir()  目录不存在          创建单级目录，  否则不执行任何操作。
      public boolean mkdirs() 多级目录不存在      创建多级目录， 否则不执行任何操作。

      public boolean delete() 删除文件  和  空目录。
  */
  public static void operate(String bashPath ) throws IOException, InterruptedException {
    File file = new File(bashPath + "mm.txt");
    file.createNewFile();

    File file1 = new File(bashPath + "目录");
    file1.mkdir();

    File file2 = new File(bashPath + "/目录2/子目录/");
    file2.mkdirs();

    File file3 = new File(bashPath + "/目录2/测试.txt");
    file3.createNewFile();
  }


  //遍历目录，查找所有符合要求的文件
  public static void loop(String bashPath) {
    File file=new File(bashPath);
//    String[] listFile = file.list();
//    System.out.println(Arrays.toString(listFile)); //[dd.json, mm.txt, 测试.txt, 目录, 目录2]
    File[] fileFileArr = file.listFiles();
    System.out.println(Arrays.toString(fileFileArr));
    //[src\com\net\D08_File\file\dd.json,
    // src\com\net\D08_File\file\mm.txt,
    // src\com\net\D08_File\file\测试.txt,
    // src\com\net\D08_File\file\目录,
    // src\com\net\D08_File\file\目录2]
    for (File f:fileFileArr) {
       if(f.isDirectory()) System.out.println(f.getPath());
    }

  }
}