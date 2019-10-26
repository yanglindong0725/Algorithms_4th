package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.18 请看以下递归函数：
 * public static int mystery(int a, int b) {
 *     if (b == 0)     return 0;
 *     if (b % 2 == 0) return mystery(a+a, b/2);
 *     return mystery(a+a, b/2) + a;
 * }
 * mystery(2, 25) 和 mystery(3, 11) 的返回值是多少？
 * 给定正整数 a 和 b，mystery(a,b) 计算的结果是什么？
 * 将代码中的 + 替换为 * 并将 return 0 改为 return 1，然后回答相同的问题。
 */

public class ex1_18 {
    public static int mystery(int a, int b) {
        if (b == 0)     return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;

    }

    private static int mystery_plus(int a, int b) {
        if (b == 0)     return 1;
        if (b % 2 == 0) return mystery_plus(a * a, b / 2);
        return mystery_plus(a * a, b / 2) * a;
    }

    public static void main(String[] args) {
        StdOut.println("Please enter the values of a and b");
        StdOut.print("a = ");
        int a = StdIn.readInt();
        StdOut.print("\n b = ");
        int b = StdIn.readInt();
        StdOut.println();

        StdOut.println(mystery(2,25));
        StdOut.println(mystery(3,11));
        StdOut.println(mystery(4,11));
        StdOut.println(mystery(a, b) == a * b);

        StdOut.println();
        StdOut.println(mystery_plus(2,25));
        StdOut.println(mystery_plus(3,11));
        StdOut.println(mystery_plus(4,11));
        StdOut.println(mystery_plus(a, b) == Math.pow(a, b));
    }
}
