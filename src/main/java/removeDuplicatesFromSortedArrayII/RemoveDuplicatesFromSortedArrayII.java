/*
 * @Source: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 * @Author: Tian Zhuo
 * @Date: 2019-01-20 20:20:49
 */
package removeDuplicatesFromSortedArrayII;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums){
            if (i < 2 || n > nums[i-2]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}