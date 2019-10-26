package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.9
 * 编写一段代码，将一个正整数 N 用二进制表示并转换为一个 String 类型的值 s。
 * 解答：Java 有一个内置方法 Integer.toBinaryString(N) 专门完成这个任务，
 * 但该题的目的就是给出这个方法的其他实现方法。下面就是一个特别简洁的答案：
 * String s = "";
 * for (int n = N; n > 0; n /= 2)
 *     s = (n % 2) + s;
 */

public class ex1_09 {
    public static void main(String[] args) {
        StdOut.print("Please enter a positive interger: ");
        int N = StdIn.readInt();

        StringBuilder s = new StringBuilder();
        for (int n = N; n > 0; n /= 2)
            s.insert(0, (n % 2));
        StdOut.printf("The binary representation of a positive integer %d is %s\n\n", N, s.toString());
    }
}
