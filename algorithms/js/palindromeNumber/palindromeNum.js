// Source : https://leetcode-cn.com/problems/palindrome-number/
// Author : Tian Zhuo
// Date   : 2018-11-17
/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x < 0) return false;
    let rev = 0;
    let orig = x;
    while(x !== 0){
        rev = rev * 10 + x % 10;
        x = Math.floor(x / 10);
    }
    return orig === rev;
};

/**
 * @param {number} x
 * @return {boolean}
 */
let isPalindrome1 = function(x) {
    if (x < 0 || (x % 10 === 0 && x !== 0)) return false;
    let revert = 0;
    while (x > revert) { // this condition reduce the loop to half! optimization!
        revert = (revert * 10) + x % 10;
        x = Math.floor(x / 10);
    }
    return x === revert || x === Math.floor(revert / 10);
};