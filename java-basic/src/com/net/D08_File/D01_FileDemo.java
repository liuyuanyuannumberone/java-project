package com.net.D08_File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class D01_FileDemo {
  public static void main(String[] args) throws IOException, InterruptedException {
    //file����Զ�ȡ�ļ�����Ŀ¼��Ϣ
    //File�಻�ܶ�д�ļ������ݣ�ֻ��ʹ��IO����
    String bashPath = "src/com/net/D08_File/file/";
//    creaeFile();
//    getFile();
//    judge();
//    operate(bashPath);
    loop(bashPath);
  }

  /*
      Filed�Ĺ��췽��
      public File(String pathname)ͨ����������·�����ַ���ת��Ϊ����·�����������µ� Fileʵ����
      public File(String parent, String child) �Ӹ�·�����ַ�������·�����ַ��������µ� Fileʵ����
      public File(File parent, String child) �Ӹ�����·��������·�����ַ��������µ� Fileʵ����
     */
  private static void creaeFile() {
    //����·������һ��
    File file1 = new File("D:\\dataPapaer\\vue\\javaData\\project\\src\\com\\net\\D08_File\\file");
    File file2 = new File("D:/dataPapaer/vue/javaData/project/src/com/net/D08_File/file");
    //System.out.println("�Һ�:\"���\"");  //�Һ�:"���" ת���ַ�

    //���·�� ����Ŀ��Ŀ¼     ��һ��
    File file3 = new File("src/com/net/D08_File/file/����.txt");
    //�ڶ���
    File file4 = new File("src/com/net/D08_File/", "file/����.txt");
    //������
    File file5 = new File("src/com/net/D08_File/");
    File file6 = new File(file5, "file/����.txt");
  }

  /*
     ��ȡ�ļ�
    public String getAbsolutePath() File�ľ���·����
   public String getPath() File����·����
  public String getName() �ļ���Ŀ¼�����ơ�
  public long length() �ļ��ĳ��ȡ���λ��Byte ���ܲ����ļ���
  */
  private static void getFile() {
    File file1 = new File("D:/dataPapaer/vue/javaData/project/src/com/net/D08_File/file/����.txt");
    File file2 = new File("src/com/net/D08_File/file/����.txt");
    System.out.println(file1.getAbsolutePath());// D:\dataPapaer\vue\javaData\project\src\com\net\D08_File\file\����.txt
    System.out.println(file2.getAbsolutePath());// D:\dataPapaer\vue\javaData\project\src\com\net\D08_File\file\����.txt
    System.out.println(file1.getPath());// D:\dataPapaer\vue\javaData\project\src\com\net\D08_File\file\����.txt
    System.out.println(file2.getPath()); //  src\com\net\D08_File\file\����.txt
    System.out.println(file1.getName()); // ����.txt
    System.out.println(file2.getName()); // ����.txt
    System.out.println(file1.length()); // 4
    System.out.println(file2.length()); // 4
  }

  //�ж��ļ�����Ŀ¼�Ƿ����    �Ƿ�ΪĿ¼  �Ƿ�Ϊ�ļ�
  public static void judge() {
    File file = new File("src/com/net/D08_File/file/����.txt");
    System.out.println(file.exists());  //�ļ�����Ŀ¼�Ƿ����  true
    System.out.println(file.isDirectory()); //�Ƿ�ΪĿ¼  false
    System.out.println(file.isFile());  //�Ƿ�Ϊ�ļ�  true
  }

  //������ɾ��
  /*
      public boolean createNewFile() �ļ�������   ����һ�����ļ�, ����ִ���κβ���
      public boolean mkdir()  Ŀ¼������          ��������Ŀ¼��  ����ִ���κβ�����
      public boolean mkdirs() �༶Ŀ¼������      �����༶Ŀ¼�� ����ִ���κβ�����

      public boolean delete() ɾ���ļ�  ��  ��Ŀ¼��
  */
  public static void operate(String bashPath ) throws IOException, InterruptedException {
    File file = new File(bashPath + "mm.txt");
    file.createNewFile();

    File file1 = new File(bashPath + "Ŀ¼");
    file1.mkdir();

    File file2 = new File(bashPath + "/Ŀ¼2/��Ŀ¼/");
    file2.mkdirs();

    File file3 = new File(bashPath + "/Ŀ¼2/����.txt");
    file3.createNewFile();
  }


  //����Ŀ¼���������з���Ҫ����ļ�
  public static void loop(String bashPath) {
    File file=new File(bashPath);
//    String[] listFile = file.list();
//    System.out.println(Arrays.toString(listFile)); //[dd.json, mm.txt, ����.txt, Ŀ¼, Ŀ¼2]
    File[] fileFileArr = file.listFiles();
    System.out.println(Arrays.toString(fileFileArr));
    //[src\com\net\D08_File\file\dd.json,
    // src\com\net\D08_File\file\mm.txt,
    // src\com\net\D08_File\file\����.txt,
    // src\com\net\D08_File\file\Ŀ¼,
    // src\com\net\D08_File\file\Ŀ¼2]
    for (File f:fileFileArr) {
       if(f.isDirectory()) System.out.println(f.getPath());
    }

  }
}