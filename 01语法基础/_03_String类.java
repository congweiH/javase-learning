/**
 * String 是一种引用数据类型
 *      2. 引用数据类型:
 *          都可以用null作为值，也就是说可以在初始化的时候赋值为null
 *               String类: 接受字符串，由0到多个字符组成
 *                   特性：不可变性:
 *                           int i0 = 1;
 *                           int i1 = 1;
 *                           以上这种会在内存中存储2个1的值
 *                           String s0 = "hello";
 *                           String s1 = "hello";
 *                           以上这种不会在内存中存在两个"hello"，只存在一个"hello", 两个String引用同一个”hello“
 *
 */

public class _03_String类 {

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str);

        /*
            1 相同字符串的引用相同
         */
        String s0 = "hello";
        String s1 = "hello";
        if(s0 == s1){   // 引用相同
            System.out.println("s0 == s1 : true");
        }
        if(s0.equals(s1)){     // 值相同
            System.out.println("true");
        }
        /*
            2 拼接的字符串和完整的字符串 引用也是相同的
         */
        String s2 = "he" + "ll" + "o";
        if(s0 == s2){   // 引用相同
            System.out.println("s0 == s1 : true");
        }
        if(s0.equals(s2)){     // 值相同
            System.out.println("true");
        }
        /*
            3 自动类型转换
                当把任何基本类型的值和字符串值进行连接运算符(+),基本类型的值将自动转化为字符串类型
         */

        String str1 = "abc";
        int j = 1;
        System.out.println(str1 + j); // abc1

        /*
            4 强制类型转换
                通常，字符串不能直接转化成为基本数据类型，但通过基本类型对应的包装类则可以把字符串转化成基本类型
                如：String a = "432";
                int i = Integer.parseInt(a);
         */
        String a = "432";
        int hj = Integer.parseInt(a);
        System.out.println(hj);
    }
}
