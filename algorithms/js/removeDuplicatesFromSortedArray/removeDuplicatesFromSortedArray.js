// Source : https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
// Author : Tian Zhuo
// Date   : 2018-11-23

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if(nums.length == 0) return 0;
    let i = 1;
    while(i < nums.length){
        if(nums[i - 1] == nums[i]){
            nums.splice(i, 1);
        }else{
            i++;
        }
    }
    return nums.length;
};

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates1 = function(nums) {
    let i = 0;
    
    for(let j = 0; j < nums.length; j++) {
        if(nums[j] != nums[i]){
            i++;
            nums[i] = nums[j];
        }
    }
    
    return i+1;
};