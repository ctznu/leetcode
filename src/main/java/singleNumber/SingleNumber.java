/*
 * @Source: https://leetcode-cn.com/problems/single-number/
 * @Author: Tian Zhuo
 * @Date: 2019-01-08 21:48:03
 */
package singleNumber;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i += 2){
            if(nums[i] != nums[i + 1]){
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public int singleNumber(int[] nums) {
        int singleNum = 0;
        for (int num : nums) {
            singleNum ^= num;
        }
        return singleNum;
    }
}