package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.20
 * 编写一个递归的静态方法计算 ln(N!) 的值
 */

public class ex1_20 {
    private static double ln(int N) {
        if (N == 0) {
            return 0;
        } else {
            return Math.log(N) + ln(N-1);
        }
    }

    public static void main(String[] args) {
        StdOut.println(ln(100));
    }
}
