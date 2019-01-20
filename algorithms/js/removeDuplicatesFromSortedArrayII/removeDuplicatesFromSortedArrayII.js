/*
 * @Source: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 * @Author: Tian Zhuo
 * @Date: 2019-01-20 23:08:33
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    let i = 0;
    for (let n of nums) {
        if (i < 2 || n > nums[i - 2]) {
            nums[i++] = n;
        }
    }
    return i;
};