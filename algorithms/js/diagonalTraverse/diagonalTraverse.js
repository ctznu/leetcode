/*
 * @Source: https://leetcode-cn.com/problems/diagonal-traverse/
 * @Author: Tian Zhuo
 * @Date: 2019-01-03 23:27:27
 */
/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var findDiagonalOrder = function(matrix) {
    if(matrix.length == 0) return [];
        let m = matrix.length;
        let n = matrix[0].length;
        let i = 0;
        let j = 0;
        let res = [];
        let k = 0;
        while(k < m * n) {
            res[k++] = matrix[i][j];
            if((i + j) % 2 == 1) {
                if(i == m - 1) { // at the last row, go right
                    j++;
                }else if(j == 0){ // at the first column, go down
                    i++;
                }else{ // other cases, go left down
                    i++;
                    j--;
                }
            }else{
                if(j == n - 1){ // at the last column, go down
                    i++;
                }else if(i == 0){ //at the first row, go right
                    j++;
                }else{ //other cases, go right up
                    i--;
                    j++;
                }
            }
        }
        return res;
};