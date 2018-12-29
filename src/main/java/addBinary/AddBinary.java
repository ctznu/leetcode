/*
 * @Source: https://leetcode-cn.com/problems/add-binary/
 * @Author: Tian Zhuo
 * @Date: 2018-12-28 21:42:07
 */
package addBinary;

public class AddBinary {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        String res = "";
        int carry = 0;
        while(i >= 0 || j >= 0){
            int curr = (i < 0 ? 0 : a.charAt(i--) - '0')
                 + (j < 0 ? 0 : b.charAt(j--) - '0') + carry;
            carry = curr > 1 ? 1 : 0;
            res = curr % 2 + res;
        }

        if(carry == 1) res = "1" + res;
        return res;
    }
}