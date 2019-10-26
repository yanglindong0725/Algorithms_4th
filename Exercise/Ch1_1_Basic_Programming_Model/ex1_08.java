package Exercise.Ch1_1_Basic_Programming_Model;

/**
 * 1.1.8
 * 下列语句会打印出什么结果？给出解释。
 * a. System.out.println('b');
 * b. System.out.println('b' + 'c');
 * c. System.out.println((char) ('a' + 4));
 */

public class ex1_08 {
    public static void main(String[] args) {
        // b, 返回两个字节的 char
        System.out.println('b');
        // 197, char 被转换为 int
        System.out.println('b' + 'c');
        // e, char 被转换为 int, 然后再被强制转换为 char
        System.out.println((char) ('a' + 4));
    }
}
