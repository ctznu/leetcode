/*
 * @Source: https://leetcode-cn.com/problems/sort-colors/
 * @Author: Tian Zhuo
 * @Date: 2019-01-22 21:01:28
 */
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function (nums) {
    for (let i = 0, left = 0, right = nums.length - 1; i <= right; i++) {
        if (nums[i] === 0) {
            [nums[i], nums[left++]] = [nums[left], nums[i]];
        } else if (nums[i] === 2) {
            [nums[right--], nums[i--]] = [nums[i], nums[right]];
        }
    }
};