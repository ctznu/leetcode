// Source : https://leetcode-cn.com/problems/3sum/
// Author : Tian Zhuo
// Date   : 2018-11-27
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function (nums) {
    nums.sort((a, b) => { return a - b })
    let res = []
    if (nums.length < 3 || nums[0] > 0 || nums[nums.length - 1] < 0) return [];
    for (let k = 0; k < nums.length; k++) {
        if (nums[k] > 0) break
        if (k > 0 && nums[k] == nums[k - 1]) continue;
        let target = 0 - nums[k];
        let i = k + 1, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                res.push([nums[k], nums[i], nums[j]]);
                while (i < j && nums[i] == nums[i + 1])++i;
                while (i < j && nums[j] == nums[j - 1])--j;
                ++i; --j;
            } else if (nums[i] + nums[j] < target)++i;
            else --j;
        }
    }
    return res;
};