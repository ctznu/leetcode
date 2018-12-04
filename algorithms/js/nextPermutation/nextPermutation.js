/*
 * @Source: https://leetcode-cn.com/problems/next-permutation/
 * @Author: Tian Zhuo
 * @Date: 2018-12-04 20:49:40
 */

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(nums) {
    if(!nums || nums.length < 2) return;
    let i = nums.length - 1;
    while(i > 0 && nums[i - 1] >= nums[i]) i--;
    if(i == nums.length - 1) {
        nums[i] = nums[i - 1] + (nums[i - 1] = nums[i], 0);
        // [nums[i], nums[i - 1]] = [nums[i - 1], nums[i]];
    }else{
        let j = nums.length - 1;
        let l = i - 1, r = i;
        while(i < j) {
            nums[i] = nums[j] + (nums[j] = nums[i], 0);
            // [nums[i], nums[j]] = [nums[j], nums[i]];
            i++;
            j--;
        }
        if(l > -1){
            while(nums[l] >= nums[r]) r++;
            nums[l] = nums[r] + (nums[r] = nums[l], 0);
            // [nums[l], nums[r]] = [nums[r], nums[l]];
        }
    }
};

