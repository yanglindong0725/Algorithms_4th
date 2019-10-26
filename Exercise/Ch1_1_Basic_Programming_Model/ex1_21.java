package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.21　 编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。
 * 然后用 printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数的结果，
 * 精确到小数点后三位。可以用这种程序将棒球球手的击球命中率或者学生的考试分数制成表格。
 */

public class ex1_21 {
    public static void main(String[] args) {
        while (true) {
            String[] nameArray = new String[100];
            int[] intArray1 = new int[100];
            int[] intArray2 = new int[100];
            for (int i = 0; i < 3; i++) {
                nameArray[i] = StdIn.readString();
                intArray1[i] = StdIn.readInt();
                intArray2[i] = StdIn.readInt();
            }
            StdOut.println("*----*----*----*------*");
            for (int i = 0; i < 3; i++) {
                StdOut.printf("|%4s|%4d|%4d|%6.3f|\n", nameArray[i],
                        intArray1[i], intArray2[i],(float) intArray1[i] / intArray2[i]);
                if (i != 3 - 1) {
                    StdOut.println("*----*----*----*------*");
                }
            }
            StdOut.println("*----*----*----*------*");
        }
    }
}
