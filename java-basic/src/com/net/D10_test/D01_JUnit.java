package com.net.D10_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class D01_JUnit {
  // JUnit单元测试 第三方软件包
  // 代替main方法 在任意的类测试运行某个方法， 基于注解实现的
  // Test测试方法不能有参数和返回值，不能是静态的，必须是公有的 方法的长度，降序 方法名：降序
  // @Before在Test方法前执行，每个@test方法执行前都要执行一次 ，按方法的长度，降序  方法名：降序
  // @After 每个@Test方法之后执行一次，按方法的长度，升序  方法名：升序
  // @BeforeClass  用在静态方法，在所有的@Before之前执行，只执行依次
  // @AfterClass  用在静态方法，在所有的@After之后执行，只执行依次

  @Test
  public void show() {
    System.out.println("我好帅");
  }

  @Before
  public void sleep() {
    System.out.println("我最大");
  }

  @After
  public void sleep1() {
    System.out.println("我最大");
  }

}
