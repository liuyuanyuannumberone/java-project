package com.basic;

/*
算数运算符号：
加：+
减：-
乘：*
除：/
取模（取余数）：%
自增自减 ++ --
自增运算符：++
自减运算符：--
	1. 在单独使用的时候，前++和后++没有任何区别。也就是：++num;和num++;是完全一样的。
	2. 在混合的时候，有【重大区别】
		A. 如果是【前++】，那么变量【立刻马上+1】，然后拿着结果进行使用。	【先加后用】
		B. 如果是【后++】，那么首先使用变量本来的数值，【然后再让变量+1】。	【先用后加】
*/


/*
四则运算当中的加号“+”有常见的三种用法：
1. 对于数值来说，那就是加法。
2. 对于字符char类型来说，在计算之前，char会被提升成为int，然后再计算。
3. 对于字符串加号代表字符串连接操作。任何数据类型和字符串进行连接的时候，结果都会变成字符串
*/



/*
比较运算符：
大于：		>
小于：		<
大于等于：	>=
小于等于：	<=
相等：		==
不相等：	!=
如果进行多次判断，不能连着写。数学当中的写法，例如：1 < x < 3
*/


/*
逻辑运算符

与（并且）	&&	全都是true，才是true；否则就是false
或（或者）	||	至少一个是true，就是true；全都是false，才是false
非（取反）	!	本来是true，变成false；本来是false，变成true

与“&&”，或“||”，具有短路效果：如果根据左边已经可以判断得到最终结果，那么右边的代码将不再执行，从而节省一定的性能。

*/


/*
* 三元运算符
* int i = (1==2 ? 100 : 200);
* */

public class D02_Operate {
    public static void main(String[] args) {
        int x = 10;
        double result3 = x + 2.5;
        String str2 = "Java";
        int x1 = 10;
        int y1 = 20;
        int num1 = 10;
        System.out.println(num1 >= 100); // false

    }
}