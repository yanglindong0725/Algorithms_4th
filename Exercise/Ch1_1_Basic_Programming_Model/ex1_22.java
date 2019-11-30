package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.22
 * 使用 1.1.6.4 节中的 rank() 递归方法重新实现 BinarySearch 并跟踪该方法的调用。每当该方法
 * 被调用时，打印出它的参数 lo 和 hi 并按照递归的深度缩进。提示：为递归方法添加一个参数
 * 来保存递归的深度。
 *
 * 此代码参考 https://github.com/jimmysuncpt/Algorithms/blob/master/src/com/jimmysun/algorithms/chapter1_1/Ex22.java
 */

public class ex1_22 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        for (int i = 0; i < depth; i++) {
            StdOut.print(" ");
        }
        StdOut.println("lo=" + lo + ", hi=" + hi);
        if(lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth + 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth + 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 56};
        int key = 5;
        int pos = rank(key, a);
        if (pos == -1) {
            StdOut.println("not found!");
        } else {
            StdOut.println("position=" + pos);
        }
    }

}
