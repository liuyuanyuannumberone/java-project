package com.basic;


/*
 *
 * 成员变量 与 局部变量
 *  1.在类中的位置不同：  在类中方法外    在方法中
 *  2.在内寸中的位置不同  在堆中         栈内存
 *  3.生命周期不同：随着对象的创建而存在，随着对象的消失而消失
 *                 随着方法的调用而存在，随着方法的调用完毕而消失
 *  4.初始化值不同：有默认值  必须先定义、赋值、最后使用。
 *  5.作用范围不同：类中 方法中。
 * */
/*
 *
 * private  私有 把要保护的成员变量进行修饰, 只能在本类中直接使用
 *
 *   解决方案：    set 设置成员变量的值    set+成员变量（首字母大写），定义一个类型相同的变量，返回void
 *                get
 *               快捷键 alt+insert
 * */

/*
*
* 构造方法:
        1.概念:
            当使用new关键字创建对象时,其实就是在调用构造方法, 完成成员变量的初始化
        2.特点:
            (1)修饰符: 没有static
            (2)没有返回值类型: 连void都不能写,可以写return,但是只能写 return ;
            (3)方法名和类名必须保持一模一样

        3.注意:
            (1)定义类时,一个构造方法都不定义,会默认提供一个空参构造(没有参数,没有方法体),但是我们看不见
            (2)构造方法,也是方法,可以重载
            (3)定义类时,只要自己定义了一个构造方法,就必须要自己写有空参构造。（有别人就的有他）
* */

public class D07_Student {
    String name;
    String gender;
    private int age; //成员变量，有默认值

    public void eat() {
        System.out.println(name);
    }

    //成员变量和局部变量重名，this. 代表成员变量,this等于实例化的对象(地址值一样)
    //解释：当对象调用方法时，方法内部有个关键字this，用来接收调用方法的地址值 如果想用就用，不想用就算了。
    public void sleep(String name) { //局部变量
        System.out.println(this.name + "..." + name);
    }

    public void print() {
        System.out.println(name + '-' + gender);
    }

    //set 设置值
    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        }
    }

    //get 获取值
    public int getAge() {
        return age;
    }


    //系统默认空构造函数
    public D07_Student() {

    }

    //一实例化对象就会被执行   方法重载----有下面就的写上面！！！！！！！！！！！！！
    //原因：不然实例化时，不传参数就会报错。
    //当使用new关键字创建对象时,其实就是在调用构造方法, 完成成员变量的初始化
    public D07_Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

}








