// Source : https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
// Author : Tian Zhuo
// Date   : 2018-11-19

/* 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。 */

/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    if(s.length == 0) return 0;
    let start = 0;
    let end = 1;
    let max = 1;
    while(end < s.length) {
        let subIndex = s.substring(start, end).indexOf(s.charAt(end));
        if( subIndex > -1) {
            max = max < end - start ? end -start : max;
            start += subIndex + 1;
            end++;
        }else{
            end++;
        }
        
    }
    return max < end - start ? end -start : max;
};

/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring1 = function(s) {
    let substr = '', maxLength = 0;
    // find the next substring that longeer than previous to replace previous substring
    for (var i = 0; i < s.length; i++) {
        let findIndex = substr.indexOf(s[i]);
        if (~findIndex) {
            substr = substr.substring(findIndex + 1);
        }
        substr += s[i];
        if (substr.length > maxLength) {
            maxLength = substr.length;
        }
    }
    return maxLength;
};