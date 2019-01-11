/*
 * @Source: https://leetcode-cn.com/problems/reverse-string/
 * @Author: Tian Zhuo
 * @Date: 2019-01-11 22:27:20
 */
/**
 * @param {string} s
 * @return {string}
 */
var reverseString = function(s) {
    debugger
    let l = s.length
    if(l < 2) return s;
    s = s.split(''); 
    for (let i = 0; i < ~~(l / 2); i++) {
        let t = s[i];
        s[i] = s[l - i - 1];
        s[l - i - 1] = t;
    }
    return s.join('');
};

var reverseString1 = function(s) {
    let str = '';
    for (let i=s.length-1; i>=0; i--) {
        str += s[i];
    }
    
    return str;
};