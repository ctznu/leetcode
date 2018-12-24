/*
 * @Source: https://leetcode-cn.com/problems/count-and-say/
 * @Author: Tian Zhuo
 * @Date: 2018-12-24 12:11:41
 */
package countAndSay;

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        for (int i = 1; i < n; i++) {
            String temp = res.toString();
            char tag = temp.charAt(0);
            int count = 1;
            res = new StringBuilder("");
            for (int j = 1; j < temp.length(); j++) {
                if(temp.charAt(j) == tag) {
                    count++;
                }else{
                    res.append(count).append(tag);
                    tag = temp.charAt(j);
                    count = 1;
                }
            }
            res.append(count).append(tag);
        }
        return res.toString();
    }
}