// Source : https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words/
// Author : Tian Zhuo
// Date   : 2018-12-04
/**
 * @param {string} s
 * @param {string[]} words
 * @return {number[]}
 */
var findSubstring = function(s, words) {
    if(!words || words.length === 0) return [];
    const m = words.length, n = words[0].length, len = m * n, res = [];

    const map = {};
    for(word of words) map[word] = ~~map[word] + 1;

    for(let i = 0; i < s.length - len + 1; i++) {
        const temp = Object.assign({}, map);
        for(let j = i; j < i + len; j += n) {
            const str = s.substr(j, n);
            if(!(str in temp)) break;
            if(--temp[str] === 0) delete temp[str];
        }
        if(Object.keys(temp).length === 0) res.push(i)
    }

    return res;
};