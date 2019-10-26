package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 1.1.11
 * 编写一段代码，打印出一个二维布尔数组的内容。
 * 其中，使用 * 表示真，空格表示假。打印出 行号和列号。
 */

public class ex1_11 {
    public static void main(String[] args) {
        StdOut.println("Randomly create a two-dimensional boolean array");
        StdOut.println("Please enter the length of the row and column of a random two-dimensional Boolean array： ");
        StdOut.println();

        int x = StdIn.readInt();
        int y = StdIn.readInt();
        boolean[][] b = new boolean[x][y];

        // 创建随机数组
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                b[i][j] = StdRandom.bernoulli();

        // 格式化打印二维布尔数组
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < b[i].length ; j++)
            {
                if (b[i][j])
                    StdOut.print(" * ");
                else
                    StdOut.print(" = ");
            }
            StdOut.print("\n");
        }
    }
}
