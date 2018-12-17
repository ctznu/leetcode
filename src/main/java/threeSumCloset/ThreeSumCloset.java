/*
 * @Source: https://leetcode-cn.com/problems/3sum-closest/
 * @Author: Tian Zhuo
 * @Date: 2018-12-17 11:59:26
 */
package threeSumCloset;

import java.util.Arrays;

public class ThreeSumCloset {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        int sum = nums[0] + nums[1] + nums[2];
        int diff = Math.abs(target - sum);
        for (int k = 0; k < nums.length; k++) {
            int l = k + 1;
            int r = nums.length - 1;
            while(l < r) {
                sum = nums[k] + nums[l] + nums[r];
                int newDiff = Math.abs(target - sum);
                if(newDiff <= diff){
                    diff = newDiff;
                    res = sum;
                }
                if(sum < target) l++;
                else r--;
            }
        }
        return res;
    }
}