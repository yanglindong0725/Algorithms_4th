package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.27
 * 二项分布。估计用以下代码计算 binomial(100, 50, 0.25) 将会产生的递归调用次数：
 * public static double binomial(int N, int k, double p)
 * {
 *  if (N == 0 && k == 0) return 1.0;
 *  if (N < 0 || k < 0) return 0.0;
 *  return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
 * }
 * 将已经计算过的值保存在数组中并给出一个更好的实现。
 */

public class ex1_27 {
    private static long COUNT = 0;
    private static long COUNT2 = 0;
    private static double[][] MATRIX;

    private static double binomial(int N, int k, double p) {
        long l = COUNT++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 -p) * binomial(N-1, k, p) + p * binomial(N-1, k-1, p);
    }

    private static double fasterBinomial(int N, int k, double p) {
        COUNT2++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        if (MATRIX[N][k] == -1) {
           MATRIX[N][k] = (1.0 -p) * fasterBinomial(N-1, k, p) + p * fasterBinomial(N-1, k-1, p);
        }
        return MATRIX[N][k];
    }

    public static double binmial2(int N, int k, double p) {
        MATRIX = new double[N+1][k+1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                MATRIX[i][j] = -1;
            }
        }
        return fasterBinomial(N, k, p);
    }

    public static void main(String[] args) {
        double array = binmial2(1000, 50, 0.25);
        StdOut.println(array);
        StdOut.println(COUNT2);
//        double array2 = binomial(30, 20, 0.5);
//        StdOut.println(array2);
//        StdOut.println(COUNT);
    }
}
