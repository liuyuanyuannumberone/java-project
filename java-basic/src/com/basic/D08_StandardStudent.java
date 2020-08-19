package com.basic;

/*
* 标准的Java类的要求:
*
*  1.所有成员变量,用private修饰  提供对应的get(获取值)和set(设置值)方法  防止外部直接使用成员变量
*      alt + insert --> Getter and Setter --> shift + ↓(选定多个属性) --> ok
   2.提供空参和满参构造
        空参:
            alt + insert --> Constructor --> select none --> ok
        满参:（赋值）
            alt + insert --> Constructor --> shift + ↓(选定多个属性) --> ok
   3. 方法中使用成员变量时，一律使用this关键字，区分成员变量和局部变量同名
   *
   *
   * ctrl + o  方法重写
   * ctrl+ i   必须要重写的抽象方法和接口中用
* */

public class D08_StandardStudent {
    private String name;
    private String gender;
    private int age;
    static String room = "841-401";

    static {
        //静态代码块，优先于静态方法执行，优先于构造方法执行，也就是new的时候，他先执行。
        //他只执行一次
        System.out.println("静态代码块被执行了");
    }

    public static String printRoom() {
//      System.out.println(this.name); 静态的东西,只能使用静态的东西,
        return D08_StandardStudent.room; //静态变量只和类有关，与对象无关
        /*
        作用: 被static修饰的内容,被该类的所有对象共享使用,依赖于类,和具体的对象无关,在内存中唯一只有一份。
        静态的内容,随着类的加载而加载并完成初始化,此时没有对象. 静态的方法,由类名直接调用
        静态方法不能直接访问普通成员变量或成员方法,这是属于对象的。 反之，成员方法可以直接访问静态变量或静态方法。
        * */

        /*
         类名称.静态成员变量
         类名称.静态成员方法
         但是在同一个类中，不需要写类名。直接使用
         */
    }

    public static void printAll() {
        System.out.println("printRoom  " + printRoom());
        System.out.println("room  " + room);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //构造方法
    public D08_StandardStudent() {
    }

    //方法重载
    public D08_StandardStudent(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
