package org.study.arithmetic.util;

public final class NumberUtil {
    private NumberUtil(){}

    public static int max(int... nums) {
        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}