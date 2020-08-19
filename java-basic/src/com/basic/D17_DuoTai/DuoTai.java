package com.basic.D17_DuoTai;

public class DuoTai {
    /*
         多态：指对象具有多态性，父类对象调用子类重写方法。
         前提条件： 1.要有继承或接口的实现
                   2.子类要有方法覆盖重写，不然失去了多态的意义
                   3.父类类型的变量指向了子类的对象,保存了子类对象的地址

                   "编码时看父类有没有方法，运行时看子类方法"

     多态的本质  向上转型    相当于自动转换类型。
             可以向下转型    相当于强制类型转换,但是只能转换为原来的小对象
              如何确定原来转换的对象  instanceof

    * */

    public static void main(String[] args) {
        Person a = new Student();
        showPerson(a);
        a = new Teacher();
        showPerson(a);
    }

    //如果Person有多个子类  解决方法：
    //父类或者接口的变量，作为方法的参数，提高了方法的扩展性。
    //调用方法时，可以传递子类或者实现类对象
    private static void showPerson(Person p) {
        if (p instanceof Teacher) {
            Teacher t = (Teacher) p;  //强制类型转换
            t.method();
        }
        if (p instanceof Student) {
            Student s = (Student) p;
            s.ddup();
        }
    }
}
