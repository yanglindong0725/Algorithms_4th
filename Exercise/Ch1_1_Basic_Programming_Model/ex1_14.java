package Exercise.Ch1_1_Basic_Programming_Model;


/*
 * 1.1.14
 * 编写一个静态方法lg()，接受一个整型参数N
 * 返回不大于log2(N)的最大整数。不要使用Math库。
 */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex1_14 {
    private static int lg1(int N) {
        int x = 1;
        int flag = 0;
        if (N > 0) {
            while (x <= N) {
                x *= 2;
                flag++;
            }
            return flag-1;
        }
        return -1;
    }

    // 此方法参照了jimmysuncp 编写的代码，以下是地址。
    // https://github.com/jimmysuncpt/Algorithms/blob/master/src/com/jimmysun/algorithms/chapter1_1/Ex14.java
    private static int lg2(int n) {
        int right_shift_count = 0;
        do {
            n >>= 1;
            right_shift_count++;
        } while (n != 0);
        return right_shift_count-1;
    }
    public static void main(String[] args) {
        StdOut.println("Please enter apositive integer N :");
        StdOut.print("N = ");
        int N = StdIn.readInt();

        StdOut.printf("the result of method lg1 is: %s\r\n", lg1(N));
        StdOut.printf("the result of method lg2 is: %s\r\n", lg2(N));
    }
}
