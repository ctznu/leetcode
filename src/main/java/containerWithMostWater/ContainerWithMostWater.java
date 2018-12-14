/*
 * @Source: https://leetcode-cn.com/problems/container-with-most-water/
 * @Author: Tian Zhuo
 * @Date: 2018-12-14 22:01:52
 */
package containerWithMostWater;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        while(l < r) {
            res = Math.max(res, Math.min(height[l], height[r]) * (r - l));
            if(height[l] < height[r]) l++;
            else r--;
            
        }
        return res;
    }

}