/*
 * @Source: https://leetcode-cn.com/problems/rotate-image/
 * @Author: Tian Zhuo
 * @Date: 2019-01-12 14:03:35
 */
/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function (matrix) {
    const n = matrix.length - 1;
    for (let i = 0; i <= matrix.length / 2 - 1; ++i) {
        for (let j = i; j <= n - i - 1; ++j) {
            let tmp = matrix[i][j];
            matrix[i][j] = matrix[n - j][i];
            matrix[n - j][i] = matrix[n - i][n - j];
            matrix[n - i][n - j] = matrix[j][n - i];
            matrix[j][n - i] = tmp;
        }
    }
};