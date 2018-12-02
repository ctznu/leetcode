/*
 * @Source: https://leetcode-cn.com/problems/
 * @Author: Tian Zhuo
 * @Date: 2018-12-02 15:02:59
 */
package twoSum;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit test for TwoSum.
 */
public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum t = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        assertArrayEquals(t.twoSum(nums, 9), new int[]{0, 1});

        nums = new int[]{2, 4, 5, 1};
        assertArrayEquals(t.twoSum(nums, 9), new int[]{1, 2});
    }
}