/*
 * @Source: https://leetcode-cn.com/problems/rotate-image/
 * @Author: Tian Zhuo
 * @Date: 2019-01-12 11:21:49
 */

package rotateImage;

public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i <= matrix.length / 2 - 1; ++i) {
            for (int j = i; j <= n - i - 1; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j][i];
                matrix[n - j][i] = matrix[n - i][n - j];
                matrix[n - i][n - j] = matrix[j][n - i];
                matrix[j][n - i] = tmp;
            }
        }
    }

    
    public void rotate1(int[][] matrix) {
        int n = matrix.length;
        int start = 0;
        int end = n - 1;
        while(start < end){
            cycle(start, end, matrix, start, start, start + 1, start);
            start++;
            end--;
        }
    }
    private void cycle(int s, int e, int[][]matrix, int si, int sj, int ei, int ej){
        int n = e - s + 1;
        int count = n * n - (n - 2) * (n - 2);
        reverse(s, e, matrix, si, sj, ei, ej, count);
        reverse(s, e, matrix, si, sj, si, si + e - s - 1, e - s);
        reverse(s, e, matrix, si, si + e - s, ei, ej, count - e + s);
    }
    private int[] cw(int s, int e, int i, int j){
        if(i == s && j < e){
            j++;
        }else if(j == e && i < e){
            i++;
        }else if(i == e && j > s){
            j--;
        }else if(j == s && i > s){
            i--;
        }
        return new int[]{i, j};
    }
    private int[] ccw(int s, int e, int i, int j){
        if(i == s && j > s){
            j--;
        }else if(j == e && i > s){
            i--;
        }else if(i == e && j < e){
            j++;
        }else if(j == s && i < e){
            i++;
        }
        return new int[]{i, j};
    }
    private void reverse(int s, int e, int[][] arr, int si, int sj, int ei, int ej, int count) {
        int t;
        int k = 0;
        while (k < count / 2) {
            k++;
            t = arr[si][sj];
            arr[si][sj] = arr[ei][ej];
            arr[ei][ej] = t;
            int[] sij = cw(s, e, si, sj);
            si = sij[0];
            sj = sij[1];
            int[] eij = ccw(s, e, ei, ej);
            ei = eij[0];
            ej = eij[1];
        }
    }

}