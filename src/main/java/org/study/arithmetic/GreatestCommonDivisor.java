package org.study.arithmetic;

import org.junit.Test;

/**
 * 最大公约数
 *
 * @author yangxin
 * @date 2019-07-21 21:07
 */
public class GreatestCommonDivisor {
    /**
     * 欧几里得算法计算gcd(m, n)
     * 1、如果n=0，则m的值为最大公约数
     * 2、m除以n，将余数赋给r
     * 3、将n的值赋给m，将r的值赋给n，返回第一步
     */
    public long euclid(long m, long n) {
        Long startTime = System.currentTimeMillis();
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("只能求正整数的最大公约数");
        }

        if (m == 0 && n == 0) {
            throw new IllegalArgumentException("只能求正整数的最大公约数");
        }

        while (n > 0) {
            long r = m % n;
            m = n;
            n = r;
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("costTime = " + (endTime - startTime));
        return m;
    }

    @Test
    public void testEuclid() {
        long gcd = this.euclid(24, 60);
        System.out.println("gcd = " + gcd);
    }

    /**
     * 连续整数检测算法计算gcd(m, n)
     * 如果m或n其中一个为0，则最大公约数为m和n中不为0的一个
     * 1、将min(m, n)的值赋给t
     * 2、如果m可被t整除，进入第3步，否则进入第4步
     * 3、如果n可被t整除，则t为最大公约数，否则进入第4步
     * 4、t = t - 1，返回第2步
     */
    public long recurse(long m, long n) {
        Long startTime = System.currentTimeMillis();
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("只能求正整数的最大公约数");
        }

        if (m == 0 && n == 0) {
            throw new IllegalArgumentException("只能求正整数的最大公约数");
        }

        if (m == 0 || n == 0) {
            return m > n ? m : n;
        }

        long gcd = 1;
        long t = m > n ? n : m;
        for (long i = t; i > 1; i--) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
                break;
            }
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("costTime = " + (endTime - startTime));
        return gcd;
    }

    @Test
    public void testRecurse() {
        long gcd = this.recurse(24, 60);
        System.out.println("gcd = " + gcd);
    }

    /**
     * 1、找到m的所有质因数
     * 2、找到n的所有质因数
     * 3、从第1步和第2步的所有质因数分解式中找出所有的公因数(如果p是一个公因数，而且在m和n的质因数分解式分别出现过pm和pn次，那么应该将p重复min(pm, pn)次)
     * 4、将第3步找到的公因数相乘即为最大公约数
     */
}