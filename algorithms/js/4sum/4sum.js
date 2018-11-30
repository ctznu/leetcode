// Source : https://leetcode-cn.com/problems/4sum/
// Author : Tian Zhuo
// Date   : 2018-11-30
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
var fourSum = function(nums, target) {
    nums.sort((a, b) => {return a - b})
    let res = []
    if(nums.length < 4) return []
    for (let k = 0; k < nums.length - 3; k++) {
        while(k > 0 && nums[k] == nums[k - 1]) ++k;
        for (let m = nums.length - 1; m - k > 2; m--) {
            while(nums[m] == nums[m + 1]) --m;
            let i = k + 1,
                j = m - 1;
            while(i < j) {
                if(nums[k] + nums[i] + nums[j] + nums[m] == target){
                    res.push([nums[k], nums[i], nums[j], nums[m]]);
                    while (i < j && nums[i] == nums[i + 1])++i;
                    while (i < j && nums[j] == nums[j - 1])--j;
                    ++i; --j;
                }else if(nums[k] + nums[i] + nums[j] + nums[m] < target){
                    ++i
                }else{
                    --j
                }
            }
        }
    }
    return res;
};