/*
 * @Source: https://leetcode-cn.com/problems/remove-element/
 * @Author: Tian Zhuo
 * @Date: 2018-12-22 15:16:57
 */
package removeElement;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(i != j && nums[j] != val){
                nums[i] = nums[j];
                nums[j] = val;
                i++;
            }
            if(nums[i] != val){
                i++;
            }
        }
        return i;
    }
}