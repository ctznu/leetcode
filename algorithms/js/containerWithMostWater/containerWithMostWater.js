// Source : https://leetcode-cn.com/problems/container-with-most-water/
// Author : Tian Zhuo
// Date   : 2018-11-26
/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let max = 0;
    for (let i = 0; i < height.length - 1; i++) {
        for(let j = height.length - 1; j > 0; j--) {
            max = Math.max(Math.min(height[i], height[j]) * (j - i), max);
            if(height[i] * (j - i - 1) <= max) break;
        }
    }
    return max;
};

/**
 * @param {number[]} height
 * @return {number}
 */
let maxArea1 = function (height) {
    let maxValue = -Infinity,
        len = height.length,
        i = 0,
        j = len - 1;
    while (i < j) {
        maxValue = Math.max(maxValue, (j - i) * Math.min(height[i], height[j]));
        height[i] < height[j] ? i++ : j--;
    }
    return maxValue;
};