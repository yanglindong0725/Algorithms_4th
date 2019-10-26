package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.7
 * 分别给出以下代码段打印出的值：
 * a. double t = 9.0;
 *    while (Math.abs(t - 9.0/t) > .001)
 *        t = (9.0/t + t) / 2.0;
 *    StdOut.printf("%.5f\n", t);
 * b. int sum = 0;
 *    for (int i = 1; i < 1000; i++)
 *        for (int j = 0; j < i; j++)
 *            sum++;
 *    StdOut.println(sum);
 * c. int sum = 0;
 *    for (int i = 1; i < 1000; i *= 2)
 *        for (int j = 0; j < 1000; j++)
 *            sum++;
 *    StdOut.println(sum);
 */

public class ex1_07 {
    public static void main(String[] args) {
        // a 的结果：3.00009
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.print("a 的结果：");
        StdOut.printf("%.5f\n", t);
        StdOut.println();

        // b 的结果：499500
        int sum1 = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum1++;
        StdOut.print("b 的结果：");
        StdOut.println(sum1);
        StdOut.println();

        // c 的结果：10000
        int sum2 = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum2++;
        StdOut.print("c 的结果：");
        StdOut.println(sum2);
    }
}
