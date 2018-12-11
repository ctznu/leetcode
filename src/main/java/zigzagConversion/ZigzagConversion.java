/*
 * @Source: https://leetcode-cn.com/problems/zigzag-conversion/
 * @Author: Tian Zhuo
 * @Date: 2018-12-11 21:15:26
 */
package zigzagConversion;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows >= s.length() || numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int interval = numRows * 2 - 2;
        for(int i = 0; i < numRows; ++i) {
            for(int j = 0; j <= (s.length() - 1 - i) / interval; ++j) {
                int pos = i + interval * j;
                sb.append(s.charAt(pos));
                if(i > 0 && i < numRows - 1) {
                    int nextPos = interval * (j + 1) - i;
                    if(nextPos <= s.length() - 1) {
                        sb.append(s.charAt(nextPos));
                    }
                }
            }
        }
        return sb.toString();
    }
}