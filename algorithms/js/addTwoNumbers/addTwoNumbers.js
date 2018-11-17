// Source : https://leetcode-cn.com/problems/two-sum/
// Author : Tian Zhuo
// Date   : 2018-11-17
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for(var i=0;i<nums.length;i++) {
        for(var j=i+1;j<nums.length;j++) {
            if(nums[i] + nums[j] == target){
                return [i, j]
                break;
            }
        }
    }
};

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 *
 * 使用store存储所需的数及匹配的数所在的下标
 * 遍历时查询store中是否存在匹配的数
 *
 */
var twoSum1 = function(nums, target) {
    const store = {}
    for (let i = 0; i < nums.length; i++) {
        const need = nums[i];
        const needIndex = store[need];
        if (needIndex !== undefined) return [needIndex, i]
        store[target - need] = i;
    }
};