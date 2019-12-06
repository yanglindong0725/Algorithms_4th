package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.26
 * 将三个数字排序。假设 a、b、c 和 t 都是同一种原始数字类型的变量。证明以下代码能够将 a、 b、c 按照升序排列：
 * if (a > b) { t = a; a = b; b = t; }
 * if (a > c) { t = a; a = c; c = t; }
 * if (b > c) { t = b; b = c; c = t; }
 */

public class ex1_26 {
    public static void main(String[] args) {
        StdOut.println("请输入三个整数：");
        StdOut.print("a=");
        int a = StdIn.readInt();
        StdOut.print("b=");
        int b = StdIn.readInt();
        StdOut.print("c=");
        int c = StdIn.readInt();

        int t = 0;
        // 每一个if语句都是交换两个数的位置
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }

        StdOut.println("它们的升序排列为：" + a + " " + b + " " + c);

    }
}
