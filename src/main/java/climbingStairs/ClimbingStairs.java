/*
 * @Source: https://leetcode-cn.com/problems/climbing-stairs/
 * @Author: Tian Zhuo
 * @Date: 2018-12-27 21:13:57
 */
package climbingStairs;

public class ClimbingStairs{
    public int climbStairs(int n) {
        return climbStairsIter(n, 0, 1, 2);
    }

    private int climbStairsIter(int n, int dpWay, int dp1, int dp2){
        if(n <= 1) return dp1;
        if(n == 2) return dp2;
        if((n--) - 2 > 0) {
            dpWay = dp1 + dp2;
            dp1 = dp2;
            dp2 = dpWay;
            return climbStairsIter(n, dpWay, dp1, dp2);
        }else{
            return dpWay;
        }
    }
}