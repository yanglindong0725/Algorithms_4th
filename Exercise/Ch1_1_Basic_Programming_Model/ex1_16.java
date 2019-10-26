package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.16
 * 给出 exR1(6) 的返回值：
 * public static String exR1(int n) {
 *     if (n <= 0) return "";
 *     return exR1(n-3) + n + exR1(n-2) + n;
 * }
 */

public class ex1_16 {
    private static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }

    public static void main(String[] args) {
        // the result is 311361142246
        StdOut.println("the result is " + exR1(6));
    }
}
