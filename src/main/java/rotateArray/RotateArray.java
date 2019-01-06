/*
 * @Source: https://leetcode-cn.com/problems/rotate-array/
 * @Author: Tian Zhuo
 * @Date: 2019-01-06 17:43:40
 */
package rotateArray;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        if(l == 0 || l == 1 || k == 0 || l == k) return;
        k = k % nums.length;
        int i = k;
        int count = 0;
        int temp = nums[0];
        int p = k;
        if(l < k * 2){
            p = l - k;
        }
        while(count < l){
            count++;
            i = i % l;
            nums[i] = temp + nums[i];
            temp = nums[i] - temp;
            nums[i] = nums[i] - temp;
            if(l % p == 0 && count % (l / p) == 0){
                i += 1;
                temp = nums[i];
            }
            i += k;
        }
    }

    public void rotate1(int[] nums, int k) {
        if (nums.length == 0) return;
        k = k % nums.length;
        if (k == 0) return;
        int len = nums.length;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    public void reverse(int[] arr, int start, int end) {
        int t;
        while (start < end) {
            t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }
}