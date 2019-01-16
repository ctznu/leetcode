/*
 * @Source: https://leetcode-cn.com/problems/valid-palindrome/
 * @Author: Tian Zhuo
 * @Date: 2019-01-16 21:40:21
 */
/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function (s) {
    var found = s.replace(new RegExp('[^a-zA-Z0-9]', "g"), '').toLocaleLowerCase();
    if(!found) return true;
    let i = 0;
    let j = found.length - 1;
    while(i < j){
        if(found[i++] !== found[j--]){
            return false;
        }
    }
    return true;
};