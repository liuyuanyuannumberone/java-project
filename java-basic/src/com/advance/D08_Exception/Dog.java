package com.advance.D08_Exception;


import java.io.IOException;


//��������ʱ�쳣���͸�����ȫû��ϵ
//���ڱ������쳣��������������У�����û�У����û��



//���۸����Ƿ��׳��쳣  ���඼���Բ��׳��쳣���������׳��κΡ�����ʱ�쳣��
//�����׳��������쳣������Ҳ�����׳��������쳣.���ǲ������׳��ȸ������ı������쳣��
public class Dog extends Animal {
  @Override
  public void show() throws NullPointerException, IOException {
    super.show();
  }

  @Override
  public void method() throws ArrayIndexOutOfBoundsException, EnumConstantNotPresentException {
    super.method();
  }
}
