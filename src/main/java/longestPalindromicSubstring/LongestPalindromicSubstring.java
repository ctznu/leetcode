/*
 * @Source: https://leetcode-cn.com/problems/longest-palindromic-substring/
 * @Author: Tian Zhuo
 * @Date: 2018-12-10 21:08:21
 */
package longestPalindromicSubstring;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;
        String longest = Character.toString(s.charAt(0));
        int l = 0;
        int r = s.lastIndexOf(s.charAt(l));
        while (l < s.length() - longest.length()) {
            if (l == r || r == 0) {
                l++;
                r = s.lastIndexOf(s.charAt(l));
            } else {
                int start = l;
                int end = r;
                while (l < r) {
                    if (s.charAt(l) != s.charAt(r)) {
                        l = start;
                        r = s.lastIndexOf(s.charAt(l), end - 1);
                        break;
                    }
                    if (r - l <= 2) {
                        if (longest.length() < end - start + 1)
                            longest = s.substring(start, end + 1);
                        l = start + 1;
                        r = s.lastIndexOf(s.charAt(l));
                        break;
                    } else {
                        l++;
                        r--;
                    }
                }
            }
        }
        return longest;
    }

    // solution 2 (fast)
    public String longestPalindrome1(String s) {
        if (s == null)
            throw new IllegalArgumentException();
        if (s.length() < 2)
            return s;
        char[] arr = s.toCharArray();
        int[] ret = new int[2];
        for (int i = 0; i < arr.length; i++) {
            i = loop(arr, i, ret);
        }
        return s.substring(ret[0], ret[1]);
    }

    private static int loop(char[] arr, int low, int[] ret) {
        int high = low;
        while (high < arr.length - 1 && arr[high + 1] == arr[low])
            high++;
        int res = high;

        while (low >= 0 && high < arr.length && arr[low] == arr[high]) {
            low--;
            high++;
        }
        if (high - low - 1 > ret[1] - ret[0]) {
            ret[1] = high;
            ret[0] = low + 1;
        }
        return res;
    }
}