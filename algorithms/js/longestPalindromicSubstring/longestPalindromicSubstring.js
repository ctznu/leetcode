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
    let l = 0;
    let r = s.length - 1;
    while(l < r  && l < s.length - 1 && r > 0) {
        if(s.charAt(l) == s.charAt(r)){
            let start = l;
            let end = r;
            while(l <= r && l < s.length - 1 && r > 0){
                if(s.charAt(l) !== s.charAt(r)) break;
                if(l == r || l + 1 == r) return s.substring(start, end + 1);
                l++;
                r--;
            }
            if(l + 1 == r){
                l = start + 1;
                r = s.length - 1;
            }
        }else{
            r--;
        }
        if(r == l){
            l++;
            r = s.length - 1;
        } 
    }
    return s.charAt(0);
};