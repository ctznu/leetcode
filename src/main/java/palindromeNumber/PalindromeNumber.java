/*
 * @Source: https://leetcode-cn.com/problems/palindrome-number/
 * @Author: Tian Zhuo
 * @Date: 2018-12-14 21:36:09
 */
package palindromeNumber;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0)) return false;
        int revert = 0;
        while(x > revert) { //只用转换一半即可
            revert = revert * 10 + x % 10;
            x = x / 10;
        }
        return x == revert || x == revert / 10; //偶数位 与 奇数位
    }
}