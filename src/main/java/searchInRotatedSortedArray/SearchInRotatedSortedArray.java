/*
 * @Source: https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 * @Author: Tian Zhuo
 * @Date: 2019-01-24 21:49:01
 */
package searchInRotatedSortedArray;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int l, int r, int target){
        if(l > r){
            return -1;
        }
        int mid = ((r - l) >> 1) + l;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] >= nums[l]){
            if(target < nums[mid] && target >= nums[l]){
                return search(nums, l, mid - 1, target);
            }else{
                return search(nums, mid + 1, r, target);
            }
        }else{
            if(target > nums[mid] && target <= nums[r]){
                return search(nums, mid + 1, r, target);
            }else{
                return search(nums, l, mid - 1, target);
            }
        }
    }
}