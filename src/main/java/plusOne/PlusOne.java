/*
 * @Source: https://leetcode-cn.com/problems/plus-one/
 * @Author: Tian Zhuo
 * @Date: 2018-12-28 21:22:13
 */
package plusOne;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i > 0; i--) {
            if(digits[i] == 10){
                digits[i] = 0;
                digits[i - 1] += 1;
            }else{
                break;
            }
        }
        if(digits[0] == 10){
            digits[0] = 0;
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int j = 1; j < newDigits.length; j++) {
                newDigits[j] = digits[j - 1];
            }
            return newDigits;
        }
        return digits;
    }
}