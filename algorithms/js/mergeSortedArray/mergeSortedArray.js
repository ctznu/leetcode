/*
 * @Source: https://leetcode-cn.com/problems/merge-sorted-array/
 * @Author: Tian Zhuo
 * @Date: 2019-02-18 21:35:44
 */
/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let i = m - 1;
    let j = n - 1;
    let k = m + n - 1;
    while(i >= 0 && j >= 0){
        if(nums1[i] > nums2[j]){
            nums1[k--] = nums1[i--];
        }else{
            nums1[k--] = nums2[j--];
        }
    }
    while(j >= 0){
        nums1[k--] = nums2[j--];
    }
};

var merge2 = function(nums1, m, nums2, n) {
    let i = m - 1;
    let j = n - 1;
    while(i >= 0 || j >= 0) {
        if (nums1[i] >= nums2[j] || j < 0) {
            nums1[i + j + 1] = nums1[i];
            i--;
        } else {
            nums1[i + j + 1] = nums2[j];
            j--;
        }
    }
};