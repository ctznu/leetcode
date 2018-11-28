// Source : https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
// Author : Tian Zhuo
// Date   : 2018-11-28

/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function(digits) {
    const map = ["", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"];
    digits.replace('1', '')
    let res = []
    for (var i = 0; i < digits.length; i++) {
        let j = 0;
        let letters = map[digits[i]]
        if(i == 0) {
            res = letters.split('')
        }else{
            let temp = []
            res.map(e => {
                let k = 0
                while(k < letters.length) {
                    temp.push(e + letters[k])
                    k++
                }

            })
            res = temp;
        }
    }
    return res
};

/**
 * @param {string} digits
 * @return {string[]}
 */
let letterCombinations = function(digits) {
    if (digits === '') return [];
    let dict = ["", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"];
    let res = [''];
    for (let digit of digits) {
        let len = res.length;
        while (len-- > 0) {
            let e = res.shift();
            for (let c of dict[digit]) {
                res.push(e + c);
            }
        }
    }
    return res;
};