package com.net.D10_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class D01_JUnit {
  // JUnit��Ԫ���� �����������
  // ����main���� ����������������ĳ�������� ����ע��ʵ�ֵ�
  // Test���Է��������в����ͷ���ֵ�������Ǿ�̬�ģ������ǹ��е� �����ĳ��ȣ����� ������������
  // @Before��Test����ǰִ�У�ÿ��@test����ִ��ǰ��Ҫִ��һ�� ���������ĳ��ȣ�����  ������������
  // @After ÿ��@Test����֮��ִ��һ�Σ��������ĳ��ȣ�����  ������������
  // @BeforeClass  ���ھ�̬�����������е�@Before֮ǰִ�У�ִֻ������
  // @AfterClass  ���ھ�̬�����������е�@After֮��ִ�У�ִֻ������

  @Test
  public void show() {
    System.out.println("�Һ�˧");
  }

  @Before
  public void sleep() {
    System.out.println("�����");
  }

  @After
  public void sleep1() {
    System.out.println("�����");
  }

}
