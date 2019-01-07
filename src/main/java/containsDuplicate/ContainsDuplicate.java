/*
 * @Source: https://leetcode-cn.com/problems/contains-duplicate/
 * @Author: Tian Zhuo
 * @Date: 2019-01-07 20:39:22
 */
package containsDuplicate;

import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length < 2) return false;
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if(nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        if (nums.length < 2) return false;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j] && j + 1 != i) {
                    int temp = nums[i];
                    nums[i] = nums[j + 1];
                    nums[j + 1] = temp;
                    break;
                }
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}