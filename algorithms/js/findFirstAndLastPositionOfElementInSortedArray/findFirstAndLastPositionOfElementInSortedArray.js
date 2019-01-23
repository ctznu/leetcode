/*
 * @Source: https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @Author: Tian Zhuo
 * @Date: 2019-01-23 22:43:28
 */
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    let sl = 0;
    let sm = 0;
    let sr = nums.length - 1;
    let el = 0;
    let em = 0;
    let er = nums.length - 1;
    while (sl < sr || el < er) {
        if (sl < sr) {
            sm = ~~((sr - sl) >> 1) + sl;
            if (nums[sm] < target) {
                sl = sm + 1;
            } else {
                sr = sm;
            }
        }
        
        if (el < er) {
            em = ~~((er - el) >> 1) + el + 1;
            if (nums[em] > target) {
                er = em - 1;
            } else {
                el = em;
            }
        }
    }
    return nums[sl] === target ? [sl, er] : [-1, -1];
};