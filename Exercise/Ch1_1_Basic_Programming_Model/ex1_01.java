package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdOut;

/**
 * 练习1.1.1 给出以下表达式的值
 * a. ( 0 + 15 ) / 2        // 7
 * b. 2.0e-6 * 100000000.1      // 200.0000002
 * c. true && false || true && true     // true
 */

public class ex1_01 {
    public static void main(String[] args) {
        StdOut.println("练习1.1.1 答案：");
        StdOut.println((0 + 15) / 2);
        StdOut.println( 2.0e-6 * 100000000.1);
        StdOut.println( true && false || true && true);
        StdOut.println();
    }
}