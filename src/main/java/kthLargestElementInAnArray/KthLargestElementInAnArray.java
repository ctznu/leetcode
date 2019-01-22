/*
 * @Source: https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 * @Author: Tian Zhuo
 * @Date: 2019-01-22 21:40:56
 */
package kthLargestElementInAnArray;

import java.util.Arrays;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}