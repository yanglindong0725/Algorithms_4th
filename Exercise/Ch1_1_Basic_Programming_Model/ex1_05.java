package Exercise.Ch1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.5
 * 编写一段程序，如果 double 类型的变量 x 和 y 都严格位于
 * 0 和 1 之间则打印 true，否则打印 false。
 */

public class ex1_05 {
    public static void main(String[] args) {
        while (true) {
            StdOut.println("请输入 x 和 y 的值：");
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();

            if (x > 0.0 && x < 1.0 && y > 0.0 && y < 1.0)
                StdOut.println("true");
            else
                StdOut.println("false");
        }
    }
}
