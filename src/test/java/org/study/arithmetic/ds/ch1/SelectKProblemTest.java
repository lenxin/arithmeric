package org.study.arithmetic.ds.ch1;

import org.hamcrest.core.IsSame;
import org.junit.Assert;
import org.junit.Test;

public class SelectKProblemTest {
    Integer[] nums = new Integer[]{1, 3, 2, 4, 6, 5, 8, 7, 10, 9};
    int k = 4;

    @Test
    public void testSolution1() {
        Integer answer = SelectKProblem.solution1(nums, k);
        Assert.assertThat(answer, IsSame.sameInstance(7));
        System.out.println("answer = " + answer);
    }

    @Test
    public void testSolution2() {
        SelectKProblem.solution2(nums, k);
    }
}