// Source : https://leetcode-cn.com/problems/remove-element/
// Author : Tian Zhuo
// Date   : 2018-11-24

/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let i = 0;
    let j = nums.length - 1;
    while(i <= j){
        if(nums[i] == val && nums[j] != val){
            nums[i] = nums[j];
            nums[j] = null;
            j--;
            i++;
        }else if(nums[i] == val && nums[j] == val){
            nums[j] = null;
            j--;
        }else if(nums[i] != val){
            i++;
        }
    }
    return j + 1;
};
/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
let removeElement1 = function(nums, val) {
    let i = 0;
    let j = nums.length - 1;
    while (i <= j) {
        if(nums[i] === val){
            [nums[i], nums[j]] = [nums[j], nums[i]]
            --j;
        } else {
            ++i;
        }
    }
    return i;
};