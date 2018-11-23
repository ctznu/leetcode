// Source : https://leetcode-cn.com/problems/string-to-integer-atoi/
// Author : Tian Zhuo
// Date   : 2018-11-23

/**
 * @param {string} str
 * @return {number}
 */
var myAtoi = function(str) {
    if(!str || !str.trim()) return 0;
    const num = "1234567890";
    const sign = "+-";
    str = str.trim();
    if((num.indexOf(str[0]) == -1 && sign.indexOf(str[0]) == -1) || (sign.indexOf(str[0]) > -1 && num.indexOf(str[1]) == -1)) return 0;
    for (let i = 1; i < str.length; i++) {
        if(num.indexOf(str[i]) == -1){
            str = str.substring(0, i);
        }
    }
    let res = parseInt(str);
    if(res > 2 ** 31 - 1) return 2 ** 31 - 1;
    if(res < -(2 ** 31)) return -(2 ** 31);
    return res;
};

/**
 * @param {string} str
 * @return {number}
 */
var myAtoi1 = function(str) {
    var test = /^\s*([\+\-]?[0-9]+)/g.exec(str);
    if (!test) return 0;
    
    var res = test[test.length - 1];
    if (res > 2 ** 31 - 1) return 2 ** 31 - 1;
    if (res < -(2 ** 31)) return -(2 ** 31);
    return +res;
};
