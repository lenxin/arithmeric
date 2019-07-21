package org.study.arithmetic;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 质数(素数)筛
 *
 * @author yangxin
 * @date 2019-07-22 00:16
 */
public class PrimeNumber {
    /**
     * 找到所有小于等于num的质数序列
     * 1、从2到num开始循环消除可被整除的数
     * 2、若当前正在消除p的倍数，应从P * p开始，直至p * p <= num结束，因为其更小的倍数已经在前面的步骤中消除了
     */
    public Set<Integer> sieve(int num) {
        long startTime = System.currentTimeMillis();
        if (num < 2) {
            throw new IllegalArgumentException("Invalid argument:" + num);
        }

        int[] array = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            array[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (array[i] != 0) {
                int j = i * i;
                while (j <= num) {
                    array[j] = 0;
                    j += i;
                }
            }
        }
        Set<Integer> sequence = new LinkedHashSet<>();
        for (int i : array) {
            if (i != 0) {
                sequence.add(i);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("costTime = " + (endTime - startTime));
        return sequence;
    }

    @Test
    public void testSieve() {
        Set<Integer> sequence = this.sieve(1000000);
        System.out.println("sequence = " + sequence);
    }
}