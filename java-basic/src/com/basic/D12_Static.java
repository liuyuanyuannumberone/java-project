package com.basic;

public class D12_Static {
    public static void main(String[] args) {
        // 类名称.静态成员变量
        System.out.println(D08_StandardStudent.room);//841-401
        //类名称.静态成员方法
        D08_StandardStudent.printAll();//841-401
        D08_StandardStudent stu = new D08_StandardStudent();
        System.out.println(stu); //com.basic.D08_StandardStudent@7c30a502
    }
}
