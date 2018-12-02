/*
 * @Source: https://leetcode-cn.com/problems/two-sum/
 * @Author: Tian Zhuo
 * @Date: 2018-12-01 20:56:31
 */

package twoSum;

import java.util.HashMap;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> store = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (store.containsKey(need)){
                return new int[]{store.get(need), i};
            } 
            store.put(nums[i], i);
        }
        return null;
    }
}