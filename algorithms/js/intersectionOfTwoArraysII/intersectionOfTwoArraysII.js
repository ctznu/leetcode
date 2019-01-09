/*
 * @Source: https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 * @Author: Tian Zhuo
 * @Date: 2019-01-09 21:46:07
 */
/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    nums1.sort((a, b) => a - b);
    nums2.sort((a, b) => a - b);
    let i = j = 0;
    let res = [];
    while(i < nums1.length && j < nums2.length) {
        if(nums1[i] < nums2[j]) {
            i++;
        }else if(nums1[i] > nums2[j]){
            j++;
        }else{
            res.push(nums1[i]);
            i++;
            j++;
        }
    }
    return res;
};

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
let intersect1 = function(nums1, nums2) {
    let res = [];
    let map = {};
    for (let e of nums1) {
        map[e] = map[e] + 1 || 1;
    }
    for (let e of nums2) {
        if (map[e]) {
            res.push(e);
            map[e]--;
        }
    }
    return res;
};