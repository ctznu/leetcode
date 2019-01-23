/*
 * @Source: https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @Author: Tian Zhuo
 * @Date: 2019-01-23 21:27:03
 */
package findFirstAndLastPositionOfElementInSortedArray;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[]{-1, -1};
        }
        if(nums.length == 1 && nums[0] == target){
            return new int[]{0, 0};
        }
        int[] res = new int[2];
        res[0] = findLeft(nums, 0, nums.length - 1, target);
        res[1] = findRight(nums, 0, nums.length - 1, target);
        return res;
    }

    private int findLeft(int[] nums, int l, int r, int target){
        while(l < r){
            int mid = ((r - l) >> 1) + l;
            if(target > nums[mid]){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return nums[l] == target ? l : -1;
    }
    private int findRight(int[] nums, int l, int r, int target){
        while(l < r){
            int mid = ((r - l) >> 1) + l + 1;
            if(target < nums[mid]){
                r = mid - 1;
            }else{
                l = mid;
            }
        }
        return nums[l] == target ? l : -1;
    }
}