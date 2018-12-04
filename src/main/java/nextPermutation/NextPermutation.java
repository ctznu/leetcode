/*
 * @Source: https://leetcode-cn.com/problems/next-permutation/
 * @Author: Tian Zhuo
 * @Date: 2018-12-04 21:25:35
 */
package nextPermutation;

 public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums.length < 2) return;
        int i = nums.length - 1;
        while(i > 0 && nums[i - 1] >= nums[i]) i--;
        if(i == nums.length - 1) {
            swap(nums, i, i - 1);
        }else{
            int j = nums.length - 1;
            int l = i - 1, r = i;
            while(i < j) {
                swap(nums, i++, j--);
            }
            if(l > -1){
                while(nums[l] >= nums[r]) r++;
                swap(nums, l, r);
            }
        }
    }

    public void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
 }
