// Source : https://leetcode-cn.com/problems/valid-parentheses/
// Author : Tian Zhuo
// Date   : 2018-11-18

/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    if(s == '') return true;
    if(s.length % 2 == 1 || ')]}'.indexOf(s.charAt(0)) > -1) return false;
    let map = {
        '(': ')',
        '[': ']',
        '{': '}'
    }
    var stack = [s.charAt(0)];
    for (let i = 1; i < s.length; i++) {
        let curr = s.charAt(i);
        if(')]}'.indexOf(curr) > -1 && map[stack[stack.length-1]] == curr) stack.pop();
        else stack.push(curr);
    }
    return stack.length == 0

};

/**
 * @param {string} s
 * @return {boolean}
 */
var isValid1 = function(s) {
    let arr = [];
    for (var char of s) {
        if (char==='(' || char=== '[' || char==='{') {
            arr.unshift(char)
        } else {
            let popStr = arr.shift();
            if (!popStr 
                || popStr==='(' && char!==')' 
                || popStr==='[' && char!== ']' 
                || popStr==='{' && char!=='}') {
                return false;
            }
        }
    }
    return !arr.length;
};