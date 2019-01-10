/*
 * @Source: https://leetcode-cn.com/problems/move-zeroes/
 * @Author: Tian Zhuo
 * @Date: 2019-01-10 23:26:56
 */
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {
    let i = 0;
    let start = 0;
    while (i < nums.length) {
        if (nums[i] != 0) {
            nums[start] = nums[i];
            if (start != i) {
                nums[i] = 0;
            }
            start++;
        }
        i++;
    }
};

var moveZeroes2 = function (nums) {
    let zero = 0;
    let count = 0
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === zero) {
            nums.splice(i, 1);
            i--;
            count++
        }
    }
    for (let j = 0; j < count; j++) {
        nums.push(zero);
    }
};