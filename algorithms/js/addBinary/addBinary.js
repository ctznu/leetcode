// Source : https://leetcode-cn.com/problems/add-binary/
// Author : Tian Zhuo
// Date   : 2018-11-25
/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    let i = a.length - 1;
    let j = b.length - 1;
    let carry = 0;
    let res = '';
    while(i >= 0 || j >= 0){
        let curr = (+a[i] || 0) + (+b[j] || 0) + carry;
        if(curr > 1){
            carry = Math.floor(curr / 2);
            curr = curr % 2;
        }else{
            carry = 0;
        }
        res = curr + res;
        i--;
        j--;
     }
     if(carry) res = "1" + res;
     return res;
};