// Source : https://leetcode-cn.com/problems/plus-one/
// Author : Tian Zhuo
// Date   : 2018-11-25

/* *
 * @param {number[]} digits
 * @return {number[]}
 * This is wrong!! 
 * 输入：
    [6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3]
    输出：
    [6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,0,0,0]
    预期：
    [6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,4]

    because Number.MAX_SAFE_INTEGER = 2 ** 53 - 1
    it exced the max precision
 */
/* var plusOne = function(digits) {
    let res = digits.join('');
    res = +res + 1 + '';
    return res.split('').map(e => {
        return +e
    });
}; */

/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let carry = 0;
    for(i = digits.length - 1; i > -1; i--){
        let res = digits[i] + ((i == digits.length - 1) ? 1 : carry);
        if(res > 9){
            digits[i] = 0;
            carry = 1;
        }else{
            digits[i] = res;
            carry = 0;
        }
        if(!carry) break;
    }
    if(carry) digits.unshift(1);
    return digits;
};

/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne1 = function(digits) {
    digits[digits.length - 1]+=1;
    for(var i = digits.length-1;i>0;i--){
        if(digits[i]>=10){
            digits[i]=0;
            digits[i-1]+=1;
        }else{
            break;
        }
    }
    if(digits[0]==10){
        digits[0]=0;
        digits.unshift(1);
    }
    return digits;
};