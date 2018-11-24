// Source : https://leetcode-cn.com/problems/count-and-say/
// Author : Tian Zhuo
// Date   : 2018-11-24
/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    let cs = function(s) {
        let i = 1;
        let count = 1;
        let val = s[0];
        let res = '';
        while(i < s.length){
            if(s[i] != val){
                res = res + count + val;
                count = 0;
                val = s[i];
            }else{
                i++;
                count++;
            }
        }
        res = res + count + val;
        return res;
    }
    if(n == 1) return '1';
    let res = cs('1');
    for (let j = 2; j < n; j++) {
        res = cs(res)
    }
    return res;
};

/**
 * @param {number} n
 * @return {string}
 */
let countAndSay1 = function(n) {
    let res = '1';
    for (let i = 1; i < n; i++) {
        let temp = res;
        let tag = temp[0];
        let count = 1;
        res = [];
        for (let j = 1; j < temp.length; j++) {
            if (temp[j] === tag) {
                count++;
            } else {
                res += count + tag;
                tag = temp[j];
                count = 1;
            } 
        }
        res += count + tag;
    }
    return res;
};