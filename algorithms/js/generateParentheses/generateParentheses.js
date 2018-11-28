// Source : https://leetcode-cn.com/problems/generate-parentheses/
// Author : Tian Zhuo
// Date   : 2018-11-29
/*
1
()
2
()()
(())
3
()()()
(())()
()(())
(()())
((()))
 */

/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n) {
    let generate = (pars) => {
        let res = []
        const p = '()'
        for (let par of pars) {
            let j = 0;
            while(j <= par.length){
                let target = par.slice(0, j) + p + par.slice(j)
                if(res.indexOf(target) == -1){
                    res.push(target)
                }
                j++
            }
        }
        return res
    }
    let res = ['']
    while(n > 0){
        res = generate(res)
        n--
    }
    return res;
};

/**
 * @param {number} n
 * @return {string[]}
 * awesome
 */
var generateParenthesis = function(n) {
    let res = []
    const fn = (left, right, str) => {
        if(left<0 || right<0 || left>right)
            return
        if(left === 0 && right === 0){
            res.push(str)
            return 
        }
        fn(left-1, right, str+'(')
        fn(left, right-1, str+')')
    }
    fn(n, n, '')
    return res    
};