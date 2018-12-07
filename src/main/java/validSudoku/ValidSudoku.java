/*
 * @Source: https://leetcode-cn.com/problems/valid-sudoku/
 * @Author: Tian Zhuo
 * @Date: 2018-12-05 22:38:24
 */
package validSudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, ArrayList<int[]>> map = new HashMap<>(9);
        for(char i = 0; i < 9; i++) map.put(i, new ArrayList<int[]>());
        for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                char s = board[i][j];
                if(Character.isDigit(s)){
                    int index = (i / 3) * 3 + j / 3;
                    if(map.get(s) != null){
                        for (int k = 0; k < map.get(s).size(); k++) {
                            if(i == map.get(s).get(k)[0] || j == map.get(s).get(k)[1] || index == map.get(s).get(k)[2])
                                return false;
                        }
                    }
                    ArrayList<int[]> l = map.get(s);
                    if(l == null) l = new ArrayList<int[]>();
                    l.add(new int[]{i, j, index});
                    map.put(s, l);
                }
            }
        }
        return true;
    }

    // solution 2
    public boolean isValidSudoku2(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                for (int k = 8; k > j; k--)
                    if (board[i][j] == board[i][k])
                        return false;
                for (int k = 8; k > i; k--)
                    if (board[i][j] == board[k][j])
                        return false;
                for (int k = i + 1; k % 3 != 0; k++) {
                    for (int h = j / 3 * 3; h < j / 3 * 3 + 3; h++)
                        if (board[i][j] == board[k][h])
                            return false;
                }
            }
        }
        return true;
    }
}