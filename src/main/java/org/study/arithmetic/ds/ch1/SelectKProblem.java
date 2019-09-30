package org.study.arithmetic.ds.ch1;

import java.util.Arrays;

/**
 * 选择第K个最大者
 *
 * @author yangxin
 * @date 2019-09-30 21:24
 */
public class SelectKProblem {
    /*对元素顺序排序，去nums.length - k个元素为第K个最大者*/
    public static <T extends Number> T solution1(T[] nums, int k) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("array num can not be null or empty");
        }
        if (k < 0 || k >= nums.length) {
            throw new IllegalArgumentException("select num " + k + " should be great than or equal to 0 and less than nums.length " + nums.length);
        }

        Arrays.sort(nums);

        return nums[nums.length - k];
    }

    public static <T extends Number> T solution2(T[] nums, int k) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("array num can not be null or empty");
        }
        if (k < 0 || k >= nums.length) {
            throw new IllegalArgumentException("select num " + k + " should be great than or equal to 0 and less than nums.length " + nums.length);
        }

        Arrays.sort(nums);

        return nums[k];
    }
}