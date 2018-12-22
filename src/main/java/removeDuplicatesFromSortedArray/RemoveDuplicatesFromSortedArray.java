/*
 * @Source: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * @Author: Tian Zhuo
 * @Date: 2018-12-22 14:59:54
 */
package removeDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i + 1;
    }
}