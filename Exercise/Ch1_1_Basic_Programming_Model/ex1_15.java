package Exercise.Ch1_1_Basic_Programming_Model;


import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.15
 * 编写一个静态方法 histogram()，
 * 接受一个整型数组 a[] 和一个整数 M 作为参数并返回一个大小为 M 的数组
 * 其中第 i 个元素的值为整数 i 在参数数组 a[] 中出现的次数。
 * 如果 a[] 中的值均在0到M-1 之间，返回的数组中所有元素之和应该和 a.length 相等。
 */

public class ex1_15 {
//    private static int[] histogram(int[] a, int M) {
//        int[] frequency = new int[M];
//        for (int i = 0; i < M; i++) {
//            int count = 0;
//            for (int value : a) {
//                if (value == i)
//                    count++;
//            }
//            frequency[i] = count;
//        }
//        return frequency;
//    }

    // 这位老哥写的比我优雅多了！我稍微改了一下循环语句
    // https://github.com/jimmysuncpt/Algorithms/blob/master/src/com/jimmysun/algorithms/chapter1_1/Ex15.java
    private static int[] histogram(int[] a, int M) {
        int[] frequency = new int[M];
        for (int value : a) {
            if (value >= 0 && value < M) {
                frequency[value]++;
            }
        }
        return frequency;
    }



    public static void main(String[] args) {
        int[] a = {1,4,6,2,7,3,1,6,8,3,2,5,7,8,2,3,5,7,2,4,4,};
        int M = 30;

        String s = " ";
        StdOut.println("参数数组");
        for (int value : a) {
            StdOut.print(value + s);
        }
        StdOut.print("\n参数数组的长度 = " + a.length);

        StdOut.println("\n返回的数组");
        for (int value : histogram(a, M)) {
            StdOut.print(value + s);
        }
        StdOut.println();

        int sum = 0;
        for (int value : histogram(a, M)) {
            sum += value;
        }
        StdOut.print("返回数组中各元素之和 = ");
        StdOut.println(sum);
    }
}
