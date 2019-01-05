/*
 * @Source: https://leetcode-cn.com/problems/spiral-matrix/
 * @Author: Tian Zhuo
 * @Date: 2019-01-05 19:49:29
 */
/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    if(matrix.length == 0) return [];
    let m = matrix.length;
    let n = matrix[0].length;
    let top = 0;
    let left = 0;
    let right = n - 1;
    let bottom = m - 1;
    let res = [];
    let i = 0;
    let j = 0;

    while(res.length < m * n){
        res.push(matrix[i][j]);
        if(top == bottom){
            if(m % 2 == 1)j++;
            else j--;
            continue;
        }
        if(left == right){
            if(n % 2 == 1)i++;
            else i--;
            continue;
        }
        if(i == top && j < right){ // at the top, go right
            j++;
            if(j == right){ // at the upper right conner
                res.push(matrix[i][j]);
                i++;
                top++;
            }
        }else if(j == right && i < bottom){ // at the right, go down
            i++;
            if(i == bottom){ // at the lower right conner
                res.push(matrix[i][j]);
                j--;
                right--;
            }
        }else if(i == bottom && j > left){ // at the bottom, go left
            j--;
            if(j == left){ // at the lower left conner
                res.push(matrix[i][j]);
                i--;
                bottom--;
            }
        }else if(j == left && i > top){ // at the left, go up
            i--;
            if(i == top){ // at the upper left conner
                res.push(matrix[i][j]);
                j++;
                left++;
            }
        }
    }
    return res;
};

var spiralOrder1 = function(matrix) {
    const col = matrix.length;
    if (col === 0) return [];
    const row = matrix[0].length;
    const [RIGHT, DOWN, LEFT, UP] = [0, 1, 2, 3];
    // right: i, j+1, down: i+1,j, left: i, j-1, up: i-1,j
    const ans = [];
    let [i, j] = [0, 0];
    let [visited, d] = [0, RIGHT];
    while (visited < row * col) {
      if (matrix[i][j] !== "#") {
        ans.push(matrix[i][j]);
        matrix[i][j] = "#";
        visited++;
      }
      switch (d) {
        case RIGHT:
          if (j + 1 === row || matrix[i][j + 1] === "#") {
            // change direction
            d = (d + 1) % 4;
            i = Math.min(i + 1, col - 1);
          } else {
            j++;
          }
          break;
        case DOWN: {
          if (i + 1 === col || matrix[i + 1][j] === "#") {
            d = (d + 1) % 4;
            j = Math.max(j - 1, 0);
          } else {
            i++;
          }
          break;
        }
        case LEFT: {
            if (j === 0 || matrix[i][j - 1] === "#") {
              d = (d + 1) % 4;
              i = Math.max(i - 1, 0);
            } else {
              j--;
            }
          }
          break;
        case UP: {
          if (i === 0 || matrix[i - 1][j] === "#") {
            d = (d + 1) % 4;
            j = Math.min(j + 1, row - 1);
          } else {
            i--;
          }
          break;
        }
      }
    }
  
    return ans;
  };