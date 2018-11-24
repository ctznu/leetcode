// Source : https://leetcode-cn.com/problems/search-insert-position/
// Author : Tian Zhuo
// Date   : 2018-11-24
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let res = nums.indexOf(target);
    if(res > -1) return res;
    let low = 0;
    let high = nums.length - 1;
    while(low <= high){
        if(nums[low] > target) return low;
        if(nums[high] < target) return high + 1;
        if(low + 1 == high) return high;
        let mid = Math.floor((low + high)/2);
        if(nums[mid] > target){
            high = mid;
        }else{
            low = mid;
        }
    }
};

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
let searchInsert1 = function(nums, target) {
    let left = 0;
    let right = nums.length - 1;
    while (left <= right) {
        let mid = ~~((left + right) / 2);
        if (nums[mid] === target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return left;
};