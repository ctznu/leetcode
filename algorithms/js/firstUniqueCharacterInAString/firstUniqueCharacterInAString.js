/*
 * @Source: https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * @Author: Tian Zhuo
 * @Date: 2019-01-13 19:16:56
 */
/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function (s) {
    let res = -1;
    const cs = 'abcdefghijklmnopqrstuvwxyz';
    for (const c of cs) {
        let index = s.indexOf(c);
        if (index != -1 && index == s.lastIndexOf(c)) {
            res = (res == -1 || res > index) ? index : res;
        }
    }
    return res;
};