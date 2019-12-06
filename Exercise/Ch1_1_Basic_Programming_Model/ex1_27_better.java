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

public class ex1_27_better {
    // 计算组合数
    public static double combination(double N, double k) {
        // 完全模拟手工计算的约分过程从而减少阶乘数量

        double min = k;
        double max = N-k;
        double t = 0;
        // 双重字母表示阶乘
        double NN = 1;
        double kk = 1;

        // 根据组合数的性质交换k!与（N-k)！阶乘在计算式中的位置
        // 此步骤使计算统一且减少计算量
        if (min > max) {
            t = min;
            min = max;
            max = t;
        }

        // 将分母中较大的阶乘与分子约分并，计算分子的值
        while(N > max)
        {
            NN = NN * N;
            N--;
        }

        // 计算分母中较小数的阶乘
        while(min > 0) {
            kk = kk * min;
            min--;
        }

        // 返回组合数的值
        return NN / kk;
    }

    // 计算二项分布值
    public static double binomial(int N, int k, double p) {
        double a = 1;
        double b = 1;
        double c = combination(N, k);

        // 计算（1-p)的(N-k)次方
        while((N-k) > 0) {
            a *= 1-p;
            N--;
        }

        // 计算p的k次方
        while(k > 0) {
            b *= p;
            k--;
        }

        return a*c*b;
    }

    public static void main(String[] args) {
        StdOut.println(binomial(1000, 50, 0.25));
    }

}
