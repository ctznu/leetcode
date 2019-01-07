/*
 * @Source: https://leetcode-cn.com/problems/contains-duplicate/
 * @Author: Tian Zhuo
 * @Date: 2019-01-07 20:38:51
 */
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
    if (nums.length < 2) return false;
    for (let i = 1; i < nums.length; i++) {
        for (let j = i - 1; j >= 0; j--) {
            if (nums[i] > nums[j] && j + 1 != i) {
                let temp = nums[i];
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
};

/**
 * @param {number[]} nums
 * @return {boolean}
 */
let containsDuplicate1 = function(nums) {
    let map = {};
    for (let i = 0; i < nums.length; i++) {
        if (map[nums[i]] === undefined) {
            map[nums[i]] = true; 
        } else {
            return true;
        }
    }
    return false;
};