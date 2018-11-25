// Source : https://leetcode-cn.com/problems/maximum-subarray/
// Author : Tian Zhuo
// Date   : 2018-11-25

// 输入: [-2,1,-3,4,-1,2,1,-5,4],
// 输出: 6
// 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function (nums) {
    let i = 0;
    let max = nums[0];
    let left = null;
    let mid = null;
    let right = null;
    let flag = true;
    let neg = false;
    while(i < nums.length){
        if(flag && nums[i] <= 0){
            max = Math.max(max, nums[i]);
        }else{
            flag = false;
            if(mid == null && nums[i] > 0){
                left = (left || 0) + nums[i];
            }
            if(right == null && nums[i] < 0){
                mid = (mid || 0) + nums[i];
            }
            if(mid && nums[i] > 0){
                right = (right || 0) + nums[i];
            }
            if(right && nums[i] < 0){
                neg = true;
            }
        }
        if(left && mid && right && neg){
            let sum = left + mid + right;
            max = Math.max(left, right, sum, max);
            left = Math.max(right, sum);
            mid = right = null;
            neg = false;
        }else{
            i++;
        }
    }
    if(!flag){
        if(right){
            let sum = left + mid + right;
            max = Math.max(left, right, sum, max);
        }else{
            max = Math.max(max, left);
        }
    }
    return max;
};

/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray1 = function(nums) {
    let m = nums.length
    const dp = Array(m).fill(null)
    dp[0] = nums[0]
    for(let i = 1; i < nums.length; i++) {
        dp[i] = Math.max(nums[i], dp[i-1] + nums[i])
    }
    return Math.max(...dp)
};