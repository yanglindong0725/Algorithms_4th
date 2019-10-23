package Exercise;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex1_1 {
    public static void main(String[] args) {
        /*
         * 练习1.1.1 给出以下表达式的值
         * a. ( 0 + 15 ) / 2        // 7
         * b. 2.0e-6 * 100000000.1      // 200.0000002
         * c. true && false || true && true     // true
         */
        StdOut.println("练习1.1.1 答案：");
        StdOut.println((0 + 15) / 2);
        StdOut.println( 2.0e-6 * 100000000.1);
        StdOut.println( true && false || true && true);
        StdOut.println();

        /*
         * 1.1.2 给出以下表达式的类型和值：
         * a. (1 + 2.236)/2
         * b. 1 + 2 + 3 + 4.0
         * c. 4.1 >= 4
         * d. 1 + 2 + "3"
         */
        StdOut.println("练习1.1.2 答案：");
        StdOut.println((1 + 2.236)/2);
        StdOut.println(1 + 2 + 3 + 4.0);
        StdOut.println(4.1 >= 4);
        StdOut.println(1 + 2 + "3");
        StdOut.println();

        /*
         * 1.1.3 编写一个程序，从命令行得到三整数参数，
         * 如果它们都相等则打印 equal, 否则打印 not equal。
         */
        StdOut.println("请输入三个整数：");
        int a = StdIn.readInt();
        StdOut.println("Your int was: " + a);
        StdOut.println();
//        int a = StdIn.readInt();
//        StdOut.println(a + ' ');
//        int b = StdIn.readInt();
//        int c = StdIn.readInt();
//        if ( a == b  && b == c )
//            StdOut.println("equal");
//        else
//            StdOut.println("not equal");
    }
}
