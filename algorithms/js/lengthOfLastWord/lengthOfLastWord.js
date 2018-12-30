/*
 * @Source: https://leetcode-cn.com/problems/length-of-last-word/
 * @Author: Tian Zhuo
 * @Date: 2018-12-30 22:20:17
 */
/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    s = s.trim();
    return s.length - s.lastIndexOf(' ') - 1;
};