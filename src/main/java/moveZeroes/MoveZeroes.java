/*
 * @Source: https://leetcode-cn.com/problems/move-zeroes/
 * @Author: Tian Zhuo
 * @Date: 2019-01-10 21:05:42
 */
package moveZeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0; // non-zero index
        int j = 0; // zero index
        while (i < nums.length) {
            if (nums[i] != 0) {
                i++;
            } else {
                if (j == 0) {
                    j = i;
                }
                while (nums[i] == 0) {
                    i++;
                    if (i == nums.length) {
                        return;
                    }
                }
                swap(nums, i, j);
                j++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public void moveZeroes1(int[] nums) {
        int aa = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                aa++;
            } else {
                nums[i - aa] = nums[i];
            }

        }
        for (int i = nums.length - aa; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes2(int[] nums) {
        int i = 0;
        int start = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[start] = nums[i];
                if (start != i) {
                    nums[i] = 0;
                }
                start++;
            }
            i++;
        }
    }
}