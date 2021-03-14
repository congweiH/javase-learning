/**
 * 1 算术运算符 + - * / ++ -- %
 *      如果对复数取余，例如 5%-2=1, 则这个负号可以忽略；当时被模数是负数则不能忽略
 * 2 赋值运算符 = += -= /= %= *=
 * 3 比较运算符 > < == != >= <=
 *      比较的结果都是boolean类型，不是true就是false
 * 4 逻辑运算符  &(逻辑与)   |(逻辑或)     !(逻辑非)    &&(短路与)    ||(短路或)    ^(逻辑异或)
 * 5 位运算符 <<  >>  >>>(无符号右移)  &  |  ^  ~(反码，0变1，1变0)
 *      -32>>2=-8(左侧补1)  -32>>>2(左侧补0，不一定是8，可能是很大的正整数)
 * 6 三元运算符 (条件表达式)？表达式1:表达式2;
 * 7 运算符的优先级：可以使用（）控制
 */
public class _04_运算符 {
    public static void main(String[] args) {
        System.out.println(5%-2);       // 1    相当于 5%2
        System.out.println(-5%2);       // -1

        /*
            short s = 3;
            s = s + 2;   1
            s += 3;      2
            1 和 2 是有区别的：
                1写法是错误的，应该改成 s = (shrot)(s+2)
                2写法是对的，+= 会将结果强制转化成相应的类型
        */

        // 思考
        int i = 1;
        i *= 0.1;   // 会强制转化成int类型
        System.out.println(i);  // 0

    }
}
