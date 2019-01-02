/*
 * @Source: https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/
 * @Author: Tian Zhuo
 * @Date: 2019-01-02 20:39:25
 */
package largestNumberAtLeastTwiceOfOthers;

public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= max * 2){
                max = nums[i];
                res = i;
            }else if(max < nums[i]){
                max = nums[i];
                res = -1;
            }else if(max > nums[i] && max < nums[i] * 2){
                res = -1;
            }
        }
        return res;
    }
}