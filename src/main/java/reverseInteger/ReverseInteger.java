/*
 * @Source: https://leetcode-cn.com/problems/reverse-integer/
 * @Author: Tian Zhuo
 * @Date: 2018-12-12 22:35:58
 */
package reverseInteger;

public class ReverseInteger {
    public int reverse(int x) {
        int res = 0;
        while(x != 0){
           res = res * 10 + x % 10;
           x = x < 0 ? (int)Math.ceil(x / 10) : (int)Math.floor(x / 10);
        }
        return res < -Math.pow(2, 31) || res > (Math.pow(2, 31) - 1) ? 0 : res;
    }
}