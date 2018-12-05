/*
 * @Source: https://leetcode-cn.com/problems/
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
        for(char i = 0; i < 9; i++) map.put(i, new ArrayList<>());
        for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                char s = board[i][j];
                if(Character.isDigit(s)){
                    int index = ~~(i / 3) * 3 + ~~(j / 3);
                    if(map.get(s) != null){
                        for (int k = 0; k < map.get(s).size(); k++) {
                            if(i == map.get(s).get(k)[0] || j == map.get(s).get(k)[1] || index == map.get(s).get(k)[2])
                                return false;
                        }
                    }
                    ArrayList<int[]> l = new ArrayList<>();
                    l.add(new int[]{i, j, index});
                    map.put(s, l);
                }
            }
        }
        return true;
    }
}