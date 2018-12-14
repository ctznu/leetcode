/*
 * @Source: https://leetcode-cn.com/problems/string-to-integer-atoi/
 * @Author: Tian Zhuo
 * @Date: 2018-12-13 20:47:26
 */

package stringToIntegerAtoi;

public class StringToIntegerAtoi {
    public int myAtoi(String str) {
        str = str.trim();
        if (str == null || str.length() == 0) {
            return 0;
        }
        final int MAX_DIV = Integer.MAX_VALUE / 10;
        final int MIN_DIV = -(Integer.MIN_VALUE / 10);
        final int MAX_M = Integer.MAX_VALUE % 10;
        final int MIN_M = - (Integer.MIN_VALUE % 10);
        int result = 0;
        int i = 0, len = str.length();
        int sign = 1;
        int digit = str.charAt(0);
        if (digit == '-' || digit == '+') {
            if (digit == '-') {
                sign = -1;
            }
            if (len == 1) {
                return 0;
            }
            i++;
        }
        while (i < len) {
            digit = str.charAt(i++) - '0';
            if (digit >= 0 && digit <= 9) {
                if (sign > 0 && (result > MAX_DIV || (result == MAX_DIV && digit > MAX_M))) { //正数溢出
                    return Integer.MAX_VALUE;
                } else if (sign < 0 && (result > MIN_DIV || (result == MIN_DIV && digit > MIN_M))) { //负数溢出
                    return Integer.MIN_VALUE;
                }
                result = result * 10 + digit;
            } else {
                break;
            }
        }
        return sign > 0 ? result : -result;
    }
}