// Source : https://oj.leetcode.com/problems/reverse-integer/
// Author : Tian Zhuo
// Date   : 2018-11-17
/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    if(x == 0) return 0;
    if(x > 0) {
        var result = parseInt(x.toString().split('').reverse().join('')) 
         return result > Math.pow(2, 31) - 1 ? 0 : result
    }else{
        var result = parseInt('-' + x.toString().substr(1).split('').reverse().join(''))
        return result < -Math.pow(2, 31) ? 0 : result
    }
};

/**
 * @param {number} x
 * @return {number}
 * better one
 */
let reverse1 = function(x) {
    let res = 0;
    while (x !== 0) {
        res = res * 10 + x % 10;
        x = x < 0 ? Math.ceil(x / 10) : Math.floor(x / 10);
    }
    return res < -(2**31) || res > 2**31 - 1 ? 0 : res;
};