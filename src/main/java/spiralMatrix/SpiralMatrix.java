/*
 * @Source: https://leetcode-cn.com/problems/spiral-matrix/
 * @Author: Tian Zhuo
 * @Date: 2019-01-04 22:15:59
 */
package spiralMatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return Collections.emptyList();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = m - 1;
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(res.size() < m * n){
            res.add(matrix[i][j]);
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
                    res.add(matrix[i][j]);
                    i++;
                    top++;
                }
            }else if(j == right && i < bottom){ // at the right, go down
                i++;
                if(i == bottom){ // at the lower right conner
                    res.add(matrix[i][j]);
                    j--;
                    right--;
                }
            }else if(i == bottom && j > left){ // at the bottom, go left
                j--;
                if(j == left){ // at the lower left conner
                    res.add(matrix[i][j]);
                    i--;
                    bottom--;
                }
            }else if(j == left && i > top){ // at the left, go up
                i--;
                if(i == top){ // at the upper left conner
                    res.add(matrix[i][j]);
                    j++;
                    left++;
                }
            }
        }
        return res;
    }
}