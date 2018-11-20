// Source : https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
// Author : Tian Zhuo
// Date   : 2018-11-20
/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function (nums1, nums2) {
    let mergedNums = [];
    if (nums1[nums1.length - 1] <= nums2[0]) mergedNums = nums1.concat(nums2);
    else if (nums2[nums2.length - 1] <= nums1[0]) mergedNums = nums2.concat(nums1);
    else {
        let i = 0;
        let j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mergedNums.push(nums1[i++]);
            } else {
                mergedNums.push(nums2[j++]);
            }
        }
        if (i == nums1.length) mergedNums = mergedNums.concat(nums2.slice(j))
        if (j == nums2.length) mergedNums = mergedNums.concat(nums1.slice(i))
    }
    let len = mergedNums.length;
    return len % 2 == 1 ? mergedNums[(len - 1) / 2] : (mergedNums[len / 2] + mergedNums[len / 2 - 1]) / 2;
};

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */

var findMedianSortedArrays = function(nums1, nums2) {
    var sorted = [];
    var i=0, j=0;
    
    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] <= nums2[j]) {
            sorted.push(nums1[i++]);
        } else {
            sorted.push(nums2[j++]);
        }
    }
    while(i < nums1.length) {
        sorted.push(nums1[i++]);
    }
    while(j < nums2.length) {
        sorted.push(nums2[j++]);
    }
    
    var len = sorted.length;
    
    if (len % 2 === 0) {
        return (sorted[len/2]+sorted[len/2-1])/2;
    } else {
        return sorted[Math.floor(len/2)];
    }
    
};