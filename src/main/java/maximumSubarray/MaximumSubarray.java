/*
 * @Source: https://leetcode-cn.com/problems/maximum-subarray
 * @Author: Tian Zhuo
 * @Date: 2018-12-26 20:38:19
 */
package maximumSubarray;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for(int num : nums) {
            if(sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
}