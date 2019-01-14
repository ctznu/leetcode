/*
 * @Source: https://leetcode-cn.com/problems/valid-anagram/
 * @Author: Tian Zhuo
 * @Date: 2019-01-14 22:46:43
 */
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function (s, t) {
    const sort = str => [...str]
        .sort((a, b) => a.charCodeAt() - b.charCodeAt())
        .join('')
    return sort(s) === sort(t)
};

var isAnagram = function (s, t) {
    let len = s.length;
    for (let i = 0; i < len; i++) {
        if (s === t || s.length !== t.length) break;
        t = t.replace(new RegExp(s[0], 'g'), '');
        s = s.replace(new RegExp(s[0], 'g'), '');
    }
    return s === t;
};