/*
 * @Source: https://leetcode-cn.com/problems/find-pivot-index/
 * @Author: Tian Zhuo
 * @Date: 2019-01-01 19:42:49
 */
package findPivotIndex;

// nums = [1, 7, 3, 6, 5, 6]
// leNums = [0, 1, 8, 11, 17, 22, 28]
// riNums = [28, 27, 20, 17, 11, 6, 0]
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0) return -1;
        int len = nums.length;
        int[] leNums = new int[len + 1];
        int[] riNums = new int[len + 1];
        leNums[0] = 0;
        riNums[len] = 0;
        for (int i = 1; i < len + 1; i++) {
            leNums[i] = nums[i - 1] + leNums[i - 1];
            riNums[len - i] = nums[len - i] + riNums[len + 1 - i];
        }
        for (int j = 0; j < len; j++) {
            if(leNums[j] == riNums[j + 1]) return j;
        }
        return -1;
    }

    public int pivotIndex1(int[] nums) {
        int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		int tmpSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (tmpSum == sum - tmpSum - nums[i]) {
				return i;
			}
			tmpSum += nums[i];
		}
		return -1;
    }
}