/*
 * @Source: https://leetcode-cn.com/problems/integer-to-roman/
 * @Author: Tian Zhuo
 * @Date: 2018-12-15 10:38:14
 */
package integerToRoman;

public class IntegerToRoman {
    public String intToRoman(int num) {
        String[] M = new String[]{"", "M", "MM", "MMM"};
        String[] C = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[(num % 10)];
    }
}