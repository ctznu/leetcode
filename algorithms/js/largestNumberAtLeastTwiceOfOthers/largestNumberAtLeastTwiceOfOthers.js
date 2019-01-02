/*
 * @Source: https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/
 * @Author: Tian Zhuo
 * @Date: 2019-01-02 22:52:47
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var dominantIndex = function(nums) {
    let max = 0;
    let res = -1;
    for (let i = 0; i < nums.length; i++) {
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
};

let dominantIndex1 = function(nums) {
    if (nums.length === 1) return 0;
    let max = 0;
    let secondMax = -1;
    for (let i = 1; i < nums.length; ++i) {
        if (nums[i] >= nums[max]) {
            secondMax = max;
            max = i;
        } else if (secondMax === -1 || nums[i] > nums[secondMax]) {
            secondMax = i;
        }
    }
    return nums[max] >= nums[secondMax] * 2 ? max : -1;
};