// Source : https://leetcode-cn.com/problems/climbing-stairs/
// Author : Tian Zhuo
// Date   : 2018-11-29
/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    return climbStairsIter(n, 0,1,2);
};
var climbStairsIter = function(n, dpWay, dp1, dp2) {
    if (n <= 1) return dp1;
    if (n == 2) return dp2;
    if ((n--) - 2) {
        dpWay = dp1 + dp2;
        dp1 = dp2;
        dp2 = dpWay;
        return climbStairsIter(n, dpWay, dp1, dp2);
    }
    else return dpWay;
}
