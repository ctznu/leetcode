/*
 * @Source: https://leetcode-cn.com/problems/find-pivot-index/
 * @Author: Tian Zhuo
 * @Date: 2019-01-01 20:39:49
 */

 /**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    let sum = 0;
    for (let i = 0; i < nums.length; i++) {
        sum += nums[i];
    }
    let tmpSum = 0;
    for (let i = 0; i < nums.length; i++) {
        if (tmpSum == sum - tmpSum - nums[i]) {
            return i;
        }
        tmpSum += nums[i];
    }
    return -1;
};