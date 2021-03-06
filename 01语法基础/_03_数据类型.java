/**
 * 数据类型分为基本数据类型和引用数据类型：
 *      1. 基本数据类型（8种，其余为引用数据类型）
 *              整数类型：byte      占1个字节  8bit   [-128, 127]
 *                      short     占2个字节  16bit  [-2^15, 2^15-1]
 *                      int       占4个字节  32bit  [-2^31, 2^31-1]
 *                      long      占8个字节  64bit  [-2^63, 2^63-1]
 *                          long类型赋值的时候要在值后面跟L, 比如 long a = 5L;
 *              浮点类型：float     占4个字节    [-2^128, 2^128]        7位有效数字
 *                          float类型赋值的时候要在后面跟f, 比如 float b = 1.1f; 因为不加默认double类型
 *                      double    占8个字节    [-2^1024, 2^1024]      16位有效数字
 *              字符类型：char
 *              布尔类型：boolean, 有两种值，false和true, 不能用0和1代替
 *      2. 引用数据类型:
 *         都可以用null作为值，也就是说可以在初始化的时候赋值为null
 *              String类: 接受字符串，由0到多个字符组成
 *                  特性：不可变性:
 *                          int i0 = 1;
 *                          int i1 = 1;
 *                          以上这种会在内存中存储2个1的值
 *                          String s0 = "hello";
 *                          String s1 = "hello";
 *                          以上这种不会在内存中存在两个"hello"，只存在一个"hello", 两个String引用同一个”hello“
 *
 */
public class _03_数据类型 {
    public static void main(String[] args) {
        // 1. 基本数据类型
        byte b = 1;
        System.out.println(b);

        short s = 2;
        System.out.println(s);

        int i = 3;
        System.out.println(i);

        // 后面加L
        long l = 4L;
        System.out.println(l);

        // 后面加f
        float f = 4.4f;
        System.out.println(f);

        double d = 5.5;
        System.out.println(d);

        char c = 'a';
        System.out.println(c);

        boolean bo = false;
        System.out.println(bo);

        // 2.引用数据类型
        String str = "hello world";
        System.out.println(str);

        String s0 = "hello";
        String s1 = "hello";
        if(s0 == s1){   // 引用相同
            System.out.println("s0 == s1 : true");
        }
        if(s0.equals(s1)){     // 值相同
            System.out.println("true");
        }
        String s2 = "he" + "ll" + "o";
        if(s0 == s2){   // 引用相同
            System.out.println("s0 == s1 : true");
        }
        if(s0.equals(s2)){     // 值相同
            System.out.println("true");
        }

        /*
            3. 自动类型转换：
                1) 小的数据类型 --自动--> 数据类型大的
                2) 当把任何基本类型的值和字符串值进行连接运算符(+),基本类型的值将自动转化为字符串类型
                3) byte,short,char 三者不会相互转化，他们三者在计算时首先转化成int
         */
        char c1 = 'a';
        int k = 1;
        System.out.println(c1 + k); // 98    char(小) -> int(大)


        String str1 = "abc";
        int j = 1;
        System.out.println(str1 + j); // abc1

        /*
            4. 强制类型转换：
                1）将容量大的数据类型转化成容量小的数据类型，需要加上强制转化符()
                2）通常，字符串不能直接转化成为基本数据类型，但通过基本类型对应的包装类则可以把字符串转化成基本类型
                    如：String a = "432";
                        int i = Integer.parseInt(a);
                3) boolean类型不可以转化成其他数据类型
        */
        int p = 7;
        byte u = (byte) p;  // 加上强制转化符号
        System.out.println(u);

        String a = "432";
        int hj = Integer.parseInt(a);
        System.out.println(hj);
    }
}
