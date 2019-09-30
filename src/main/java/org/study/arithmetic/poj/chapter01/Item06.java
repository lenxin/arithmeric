package org.study.arithmetic.poj.chapter01;

import org.junit.Test;
import org.study.arithmetic.util.NumberUtil;

/**
 * @author yangxin
 * @date 2019-09-30 16:56
 */
public class Item06 {
    /**
     * 三角形
     * 有n根棍子，棍子i的长度为ai。从中选出3根棍子，组成周长尽可能长的三角形，若无法组成则输出0.
     * 限制条件
     * 3 <= n <= 100
     * 1 <= ai <= 1000000
     * O(nlog(n))
     */
    @Test
    public void test1() {
        int n = 5;
        int[] a = new int[]{2, 3, 4, 5, 10};

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                for (int j = k + 1; j < n; j++) {
                    int perimeter = a[i] + a[j] + a[k];
                    int max = NumberUtil.max(a[i], a[j], a[k]);

                    /*两边之和大于第三边*/
                    if (perimeter > 2 * max) {
                        answer = NumberUtil.max(answer, perimeter);
                    }
                }
            }
        }

        System.out.println("answer = " + answer);
    }
}