// Source : https://leetcode-cn.com/problems/two-sum/
// Author : Tian Zhuo
// Date   : 2018-11-18
/**
 * @param {string[]} strs
 * @return {string}
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 */
var longestCommonPrefix = function(strs) {
    if(strs.length == 0) return ''
    if(strs.length == 1 || strs[0] == '') return strs[0]
    var p;
    for (let i = 0; i < strs[0].length; i++) {
        p = strs[0].charAt(i);
        for (let j = 1; j < strs.length; j++) {
            if(strs[j].charAt(i) !== p){
                p = strs[0].substr(0, i);
                return p;
            } 
        }
    }
    return strs[0];
};

/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix1 = function(strs) {
    if (strs.length == 0) return "";
    let prefix = strs[0];
    for (let i = 1; i < strs.length; i++)
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1);
            if (prefix.length == 0) return "";
        }
    return prefix;
};