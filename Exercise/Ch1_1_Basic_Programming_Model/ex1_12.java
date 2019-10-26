package Exercise.Ch1_1_Basic_Programming_Model;

/**
 * 1.1.12
 * 以下代码段会打印出什么结果？
 * int[] a = new int[10];
 * for (int i = 0; i < 10; i++)
 *     a[i] = 9 - i;
 * for (int i = 0; i < 10; i++)
 *     a[i] = a[a[i]];
 * for (int i = 0; i < 10; i++)
 *     System.out.println(i);
 */

public class ex1_12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }
}

/* output
0
1
2
3
4
5
6
7
8
9
 */