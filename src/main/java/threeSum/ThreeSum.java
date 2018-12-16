/*
 * @Source: https://leetcode-cn.com/problems/3sum/
 * @Author: Tian Zhuo
 * @Date: 2018-12-16 10:06:05
 */
package threeSum;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3 || nums[0] > 0 || nums[nums.length - 1] < 0) return new ArrayList();
        for (int k = 0; k < nums.length; k++) {
            if(nums[k] > 0) break;
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            int target = 0 - nums[k];
            int i = k + 1;
            int j = nums.length - 1;
            while(i < j) {
                if(nums[i] + nums[j] == target){
                    res.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while(i < j && nums[i] == nums[i + 1]) ++i;
                    while(i < j && nums[j] == nums[j - 1]) --j;
                    ++i;
                    --j;
                }else if(nums[i] + nums[j] < target){
                    ++i;
                }else{
                    --j;
                }
            }
        }
        return res;
    }
}