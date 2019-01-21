/*
 * @Source: https://leetcode-cn.com/problems/sort-colors/
 * @Author: Tian Zhuo
 * @Date: 2019-01-21 21:04:18
 */
package sortColors;
public class SortColors {
    public void sortColors1(int[] nums) {
        int[] store = new int[]{0, 0, 0};
        for(int i = 0; i < nums.length; i++) {
            int count = store[nums[i]];
            store[nums[i]] = count + 1;
        }
        int k = 0;
        int j = 0;
        while(k < nums.length){
            if(store[j] > 0){
                nums[k++] = j;
                store[j]--;
            }else{
                j++;
            }
        }
    }

    public void sortColors(int[] nums) {
        if (nums.length == 0) return;
        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        while (i <= right) {
            if (nums[i] == 0) {
                if (i == left) {
                    i++;
                    left++;
                } else {
                    swap(nums, i, left);
                    left++;
                }
            } else if (nums[i] == 2) {
                swap(nums, i, right);
                right--;
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}