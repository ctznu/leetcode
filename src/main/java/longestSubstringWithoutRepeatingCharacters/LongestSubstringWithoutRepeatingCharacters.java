/*
 * @Source: https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @Author: Tian Zhuo
 * @Date: 2018-12-07 12:10:49
 */
package longestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        String subStr = "";
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int findIndex = subStr.indexOf(s.charAt(i));
            if(findIndex > -1){
                subStr = subStr.substring(findIndex + 1);
            }
            subStr += s.charAt(i);
            if(maxLen < subStr.length()) maxLen = subStr.length();
        }
        return maxLen;
    }

    public int lengthOfLongestSubstring1(String s) {
		int ans = 0;
		int[] vis = new int[257]; //store ascii code as index
		int len = s.length();
		int left = -1;
		Arrays.fill(vis,-1);
		for(int i = 0; i < len; i++) {
			if(vis[s.charAt(i)] > left) {
				left = vis[s.charAt(i)];
			}
            ans = Math.max(ans,i - left);
            vis[s.charAt(i)] = i;
		}
		
		return ans;
    }
}