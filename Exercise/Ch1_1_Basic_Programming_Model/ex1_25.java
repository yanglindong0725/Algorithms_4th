package Exercise.Ch1_1_Basic_Programming_Model;

/**
 * 1.1.25
 * 使用数学归纳法证明欧几里得算法能够计算任意一对非负整数 p 和 q 的最大公约数。
 */

/**
 * 1.基础步骤：求证 gcd(p, q) = gcd(q, r)
 * 证：令 p = a*q+r, 其中P、a、q、r均为非负整数。
 * 设整数 d|p、d|q，则 d|(p-a*q)，
 * 得 p 与 q 的公约数和 q 与 r=p-a*q的公约数相同。
 * 设整数 d|q、d|r，则 d|(a*q+r)，得q与r的公约数和p与r的公约数相同。
 * 基于上述两点得 gcd(p, q) = gcd(q, r)。
 * 2.归纳步骤：设有gcd(p, q) = gcd(q, r)，求证gcd(q, r) = gcd(r, q%r)
 * 证：由gcd(p, q) = gcd(q, r) 可得 d|p、d|q、d|r、p=a*q+r。
 * 由于有 q=(q/r)*r + q%r、d|q、d|r,
 * 所以有 d|q%r
 * 所以有 gcd(q,r) = gcd(r,q%r)。
 */
public class ex1_25 {
    // 无代码，解法在上。
}
