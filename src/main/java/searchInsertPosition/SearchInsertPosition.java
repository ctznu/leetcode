/*
 * @Source: https://leetcode-cn.com/problems/search-insert-position/
 * @Author: Tian Zhuo
 * @Date: 2018-12-23 22:32:53
 */
package searchInsertPosition;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}