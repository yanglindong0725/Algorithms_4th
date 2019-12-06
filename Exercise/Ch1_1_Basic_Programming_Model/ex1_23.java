package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.23
 * 为 BinarySearch 的测试用例添加一个参数：
 * + 打印出标准输入中不在白名单上的值；
 * -，则打印出标准输入中在白名单上的值。
 */

public class ex1_23 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length-1, 0);
    }
    public static int rank(int key, int[] a, int lo, int hi, int depth) {
//        for (int i = 0; i < depth; i++) {
//            StdOut.print(" ");
//        }
//        StdOut.println("lo=" + lo + ", hi=" + hi);
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid-1,depth+1);
        } else if (key > a[mid]) {
            return rank(key, a, mid+1, hi, depth+1);
        } else {
            return mid;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7,8,9,12,13,14,15};
        StdOut.println("请输入 + or -");
        char arg = StdIn.readChar();
        StdIn.readLine();
        StdOut.printf("Input keys: ");
        String[] keys = StdIn.readLine().split(" ");
        for (int i = 0; i < keys.length; i++) {
            if (rank(Integer.parseInt(keys[i]), a) != -1 && arg == '-') {
                StdOut.printf("白名单上的值：%s ", keys[i]);
            } else if (rank(Integer.parseInt(keys[i]), a) == -1 && arg == '+') {
                StdOut.printf("%s ", keys[i]);
            }
        }
        StdOut.println();
    }
}
