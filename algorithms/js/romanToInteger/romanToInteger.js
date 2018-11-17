// Source : https://leetcode-cn.com/problems/roman-to-integer/
// Author : Tian Zhuo
// Date   : 2018-11-17
/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    var romanMap = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    }
    if(s.length == 1) return romanMap[s];
    var romanArr = s.split('');
    var res = 0;
    for (let i = 0; i < romanArr.length; i++) {
        if(romanMap[romanArr[i]] < romanMap[romanArr[i+1]]){
            res = res + romanMap[romanArr[i+1]] - romanMap[romanArr[i]];
            i++
        }else{
            res = res + romanMap[romanArr[i]];
        }
    }
    return res;
};

/**
 * @param {string} s
 * @return {number}
 */

let romanToInt1 = function(s) {
    let map = {I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000};
    let res = 0;
    let last = 0;
    for (let i = s.length - 1; i >= 0; i--) {
        let curr = map[s.charAt(i)];   
        if (curr < last) res -= curr;
        else res += curr;
        last = curr;
    }
    return res;
}