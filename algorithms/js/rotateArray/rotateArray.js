/*
 * @Source: https://leetcode-cn.com/problems/rotate-array/
 * @Author: Tian Zhuo
 * @Date: 2019-01-07 20:25:00
 */
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    if(nums.length === 0) return;
    k = k % nums.length;
    if(k === 0) return;
    const len = nums.length;
    reverse(nums, 0, len - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, len - 1);

};
let reverse = function(nums, start, end){
    let t;
    while(start < end){
        t = nums[start];
        nums[start] = nums[end];
        nums[end] = t;
        start++;
        end--;
    }
}

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate1 = function (nums, k) {
    if (Array.isArray(nums) && k) {
        if (nums.length !== k) {
            let a = nums.splice(nums.length - k)
            nums.splice(0, 0, ...a)
        }
    }
};

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate2 = function(nums, k) {
    if(!k){
       return nums;
    }
    if(nums && nums.length === 0){
       return [];
    }
    const arr1 = nums.splice(nums.length - k, nums.length);
      nums.unshift(...arr1);
  };