// Source : https://leetcode-cn.com/problems/zigzag-conversion/
// Author : Tian Zhuo
// Date   : 2018-11-22
/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    if(numRows == 1) return s;
    let l = 1;
    let cov = '';
    while(l <= numRows){
        let downStep = 2 * (numRows - l);
        let upStep = 2 * (l - 1);
        let downPoint = l - 1 + downStep;
        let upPoint = 0;
        cov = cov + s.charAt(l - 1);
        while(downPoint <= s.length || upPoint <= s.length){
            upPoint = downPoint + upStep;
            if(downStep > 0 && downPoint <= s.length) cov = cov + s.charAt(downPoint);
            if(upStep > 0 && upPoint <= s.length) cov = cov + s.charAt(upPoint);
            downPoint = upPoint + downStep;
        }
        l++;
    }
    return cov;
};

/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
let convert = function(s, numRows) {
    if (numRows === 1) return s;
    let res = "";
    let interval = numRows* 2 - 2;
    for (let i = 0; i < numRows; ++i) {
        for (let j = 0; j <= ~~(s.length - 1 - i) / interval; ++j) {
            let pos = i + j * interval;
            res += s[pos];
            if (i > 0 && i < numRows- 1) {
                let nextPos = interval * (j + 1)  - i;
                if (nextPos <= s.length - 1 ) {
                    res += s[nextPos];
                }
            }
        }
    }
    return res;
};