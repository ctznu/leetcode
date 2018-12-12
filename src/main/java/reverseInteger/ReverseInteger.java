/*
 * @Source: https://leetcode-cn.com/problems/reverse-integer/
 * @Author: Tian Zhuo
 * @Date: 2018-12-12 22:35:58
 */
package reverseInteger;

public class ReverseInteger {
    public int reverse(int x) {
        long res = 0;
        while(x != 0){
           res = res * 10 + x % 10;
           x = x < 0 ? (int)Math.ceil(x / 10) : (int)Math.floor(x / 10);
        }
        return res < -Math.pow(2, 31) || res > (Math.pow(2, 31) - 1) ? 0 : (int)res;
    }

    // solution 2
    public int reverse1(int x) {
        int temp = 0;
        int result = 0;
        while(x != 0){
            temp = result * 10 + x % 10;
            if(temp / 10 != result) //if temp overflow, it will not same as result 
                return 0;
            result = temp;
            x /= 10;
        }
        return result;
    }
}