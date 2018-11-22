// Source : https://leetcode-cn.com/problems/longest-palindromic-substring/
// Author : Tian Zhuo
// Date   : 2018-11-21

// abcabacd

/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    if(s.length == 1) return s;
    let longest = s.charAt(0);
    let l = 0;
    let r = s.lastIndexOf(s.charAt(l));
    while(l < s.length - longest.length){
        if(r == l || r == 0){
            l++;
            r = s.lastIndexOf(s.charAt(l));
        }else{
            let start = l;
            let end = r;
            while(l < r){
                if(s.charAt(l) !== s.charAt(r)){
                    l = start;
                    r = s.lastIndexOf(s.charAt(l), end - 1);
                    break;
                }
                if(r - l <= 2){
                    if(longest.length < end + 1 - start) longest = s.substring(start, end + 1);
                    l = start + 1;
                    r = s.lastIndexOf(s.charAt(l));
                    break;
                }else{
                    l++;
                    r--;
                }
            }
        } 
    }
    return longest;
};