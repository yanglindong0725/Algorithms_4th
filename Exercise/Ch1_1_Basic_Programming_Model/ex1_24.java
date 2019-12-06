package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.24
 * 给出使用欧几里得算法计算 105 和 24 的最大公约数的过程中得到的一系列 p 和 q 的值。
 * 扩展该算法中的代码得到一个程序 Euclid，从命令行接受两个参数，
 * 计算它们的最大公约数并打印出每次调用递归方法时的两个参数。
 * 使用你的程序计算 1 111 111 和 1 234 567 的最大公约数。
 */

public class ex1_24 {
    public static int gcd(int p, int q) {
        StdOut.println("p= " + p + ", q= " + q + ';');
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        StdOut.println("105 和 24的最大公约数为：" + gcd(105, 24));
    }
}
