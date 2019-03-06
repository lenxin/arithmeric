package org.study.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * @author yangxin
 * @date 2019/3/5 23:30
 */
public class TwoNumSolution {
    private int[] nums = {23, 45, 67, 7, 11, 89, 2, 7, 11, 15};
    private int target = 9;

    /**
     * 暴力法
     * 遍历数组中的每个元素 x，并查找是否存在一个值与 target-x 相等
     * 复杂度分析：
     * 时间复杂度：O(n^2)，对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n) 的时间。因此时间复杂度为 O(n^2)
     * <p>
     * 空间复杂度：O(1)。
     */
    @Test
    public void solution1() {
        long startTime = System.currentTimeMillis();
        int[] indexs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            for (; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    indexs[0] = i;
                    indexs[1] = j;
                    break;
                }
            }
            if(j != nums.length){
                break;
            }
        }
        System.out.println("indexs = " + Arrays.toString(indexs));
        long endTime = System.currentTimeMillis();
        System.out.println("costTime = " + (endTime - startTime));
    }

    @Test
    public void solution2() {
        long startTime = System.currentTimeMillis();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int[] indexs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null && index != i) {
                indexs[0] = index;
                indexs[1] = i;
                break;
            }
        }
        System.out.println("indexs = " + Arrays.toString(indexs));
        long endTime = System.currentTimeMillis();
        System.out.println("costTime = " + (endTime - startTime));
    }
}
