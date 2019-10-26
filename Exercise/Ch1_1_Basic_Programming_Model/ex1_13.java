package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 1.1.13
 * 编写一段代码，打印出一个 M 行 N 列的二维数组的转置（交换行和列）。
 */

public class ex1_13 {
    public static void main(String[] args) {
        StdOut.println("请输入二维数组的行列数 ");
        StdOut.print("行数 M = ");
        int M = StdIn.readInt();
        StdOut.print("列数 N = ");
        int N = StdIn.readInt();
        StdOut.println();

        // 初始化数组并输出
        StdOut.println("原始数组");
        int[][] a = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = StdRandom.uniform(0, 9);
                StdOut.print(" " + a[i][j] + " ");
            }
            StdOut.println();
        }
        StdOut.println();

        // 将原始数组转置并输出
        StdOut.println("转置数组");
        int[][] b = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                b[i][j] = a[j][i];
                StdOut.print(" " + b[i][j] + " ");
            }
            StdOut.println();
        }
    }
}
