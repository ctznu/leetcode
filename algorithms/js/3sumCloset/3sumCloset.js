// Source : https://leetcode-cn.com/problems/3sum-closest/
// Author : Tian Zhuo
// Date   : 2018-11-29
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var threeSumClosest = function(nums, target) {
    nums.sort((a, b) => { return a - b })
    if (nums.length < 3) return [];
    let minDiff = Infinity
    for (let k = 0; k < nums.length - 2; k++) {
        if (k > 0 && nums[k] == nums[k - 1]) continue;
        let closest = target - nums[k];
        let i = k + 1, j = nums.length - 1;
        while (i < j) {
            let diff = nums[i] + nums[j] - closest
            minDiff = Math.abs(minDiff) > Math.abs(diff) ? diff : minDiff
            if(minDiff == 0){
                return target
            }
            if (diff < 0) {
                i++
            } else {
                j--
            }
        }
    }
    return target + minDiff;
};