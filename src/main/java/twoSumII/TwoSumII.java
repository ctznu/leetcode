/*
 * @Source: https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 * @Author: Tian Zhuo
 * @Date: 2019-01-25 21:20:55
 */
package twoSumII;


public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int remain = target - numbers[0];
        while(remain < numbers[j]){
            j--;
        }
        while(i < j){
            int res = numbers[i] + numbers[j];
            if(res == target){
                return new int[]{i + 1, j + 1};
            }else if(res < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[2];
    }
}