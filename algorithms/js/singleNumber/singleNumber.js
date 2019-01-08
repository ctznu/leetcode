/*
 * @Source: https://leetcode-cn.com/problems/single-number/
 * @Author: Tian Zhuo
 * @Date: 2019-01-08 21:47:14
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
    let singleNum = 0;
    for (num of nums) {
        singleNum ^= num;
    }
    return singleNum;
};