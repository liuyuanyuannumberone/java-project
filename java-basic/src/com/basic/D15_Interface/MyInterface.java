package com.basic.D15_Interface;

public interface MyInterface {
    /*
     *  接口：方法的汇总  抽象方法 、默认方法（jdk8以及以后）   静态方法（jdk8以及以后） 常量
        public abstract ...   public default...     public static...   public static final
       接口不能直接new对象，没有静态代码块
     * */

    //接口中的成员变量都是 常量 ，默认有public static final修饰，不写也有
    //因为是常量，所以必须显示赋值，然后约定俗称 每个单词必须大写，然后下划线分割
    //外部使用  接口名.常量访问
    int Sale_Num = 10; //===> public static final int num = 10;

    static void sleep() {
        System.out.println(Sale_Num);
    }


    //  1.抽象方法有默认修饰符 可以省略  public abstract void method();
    void method();


    // 2.默认方法 可以省略 public default void print(); 由接口的实现类对象可以直接调用，可以不在接口实现类中重写
    // 接口升级添加新的抽象方法，导致接口的实现类报错，采用默认方法
    default void print() {
        System.out.println("默认方法中执行了");
    }

    // 3. 静态方法 只属于接口本身，不能在实现类中使用,由接口名直接调用。
    //接口实现类的静态方法和接口的静态方法一样也不是覆盖重写，完全不相关
    static void show() {
        System.out.println("静态方法被执行了");
    }

}
