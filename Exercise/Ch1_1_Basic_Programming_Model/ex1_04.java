package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.4 下列语句各有什么问题（如果有的话）？
 * a. if (a > b) then c = 0;
 * 答：Java中无 then 语句。
 * b. if a > b { c = 0; }
 * 答：布尔表达式 a > b 需要加括号。
 * c. if (a > b) c = 0;
 * 此语句正确，见代码。
 * d. if (a > b) c = 0 else b = 0;
 * 赋值语句 c = 0 之后缺少 ";" 。
 */

public class ex1_04 {
    public static void main(String[] args) {
        int a = 20;
        int b = 4;
        int c = 8;
        StdOut.printf("运行if语句前c的值为： %d\n", c);

        if (a > b) c = 0;

        StdOut.printf("运行if语句后c的值为： %d", c);
    }
}
