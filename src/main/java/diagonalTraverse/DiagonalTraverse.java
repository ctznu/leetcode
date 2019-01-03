/*
 * @Source: https://leetcode-cn.com/problems/diagonal-traverse/
 * @Author: Tian Zhuo
 * @Date: 2019-01-03 21:05:50
 */
package diagonalTraverse;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[]{};
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = 0;
        int[] res = new int[m * n];
        int k = 0;
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
    }
}