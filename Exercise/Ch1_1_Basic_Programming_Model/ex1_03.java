package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.3 编写一个程序，从命令行得到三整数参数，
 * 如果它们都相等则打印 equal, 否则打印 not equal。
 */

public class ex1_03 {
    public static void main(String[] args) {
        StdOut.println("请输入三个整数：");
        int a = new In().readInt();
        int b = new In().readInt();
        int c = new In().readInt();
        if ( a == b  && b == c )
            StdOut.println("equal");
        else
            StdOut.println("not equal");
        StdOut.println();
    }
}
