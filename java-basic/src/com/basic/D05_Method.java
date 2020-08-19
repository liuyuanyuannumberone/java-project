package com.basic;

public class D05_Method {
    public static void main(String[] args) {
        int c = Add(1, 2);
        System.out.println(c);
        System.out.println(getSum(1,2));
        System.out.println(getSum(1,2,3));
        int[] a={1,2,3,4,5,6,7,8,10};
        printArr(a);
    }

    //方法必须定义在类中
    //方法各自独立，不能嵌套定义
    private static int Add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b)); //1+2=3
        System.out.println(a + '+' + b + '=' + (a + b)); //110
        return a + b;
    }


    //方法重载：同一个类中，多个功能相同，参数列表不同（多个类型顺序不同、个数、类型）的方法，可以使用相同的名称。
    //多个同名不同参的方法存在于同一个类中。
    private static int getSum(int a ,int b){
         return a+b;
    }
    private static int getSum(int a ,int b,int c){
        return a+b+c;
    }

    //数组作为形参
    private static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
