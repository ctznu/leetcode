/*
 * @Source: https://leetcode-cn.com/problems/4sum/
 * @Author: Tian Zhuo
 * @Date: 2018-12-18 10:48:48
 */
package fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4)
            return Collections.emptyList();
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length - 3; k++) {
            while (k > 0 && nums[k] == nums[k - 1])
                ++k;
            for (int m = nums.length - 1; m - k > 2; m--) {
                while (m < nums.length - 1 && nums[m] == nums[m + 1])
                    --m;
                int i = k + 1;
                int j = m - 1;
                while (i < j) {
                    if (nums[k] + nums[i] + nums[j] + nums[m] == target) {
                        res.add(Arrays.asList(nums[k], nums[i], nums[j], nums[m]));
                        while (i < j && nums[i] == nums[i + 1])
                            ++i;
                        while (i < j && nums[j] == nums[j - 1])
                            --j;
                        ++i;
                        --j;
                    } else if (nums[k] + nums[i] + nums[j] + nums[m] < target) {
                        ++i;
                    } else {
                        --j;
                    }
                }
            }
        }
        return res;
    }

    public List<List<Integer>> fourSum1(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4)
            return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            if (nums[i] * 4 > target)
                break;// Too Big!!太大了，后续只能更大，可以直接结束循环；
            if (nums[i] + 3 * nums[nums.length - 1] < target)
                continue;// Too Small！太小了，当前值不需要再算，可以继续循环尝试后面的值。

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                if (nums[j] * 3 > target - nums[i])
                    break;// Too Big！ 注意此时不能结束i的循环，因为j是移动的 当j移动到后面的时候继续i循环也sum可能变小
                if (nums[j] + 2 * nums[nums.length - 1] < target - nums[i])
                    continue;// Too Small

                int begin = j + 1;
                int end = nums.length - 1;
                while (begin < end) {
                    int sum = nums[i] + nums[j] + nums[begin] + nums[end];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[begin], nums[end]));
                        while (begin < end && nums[begin] == nums[begin + 1]) {
                            begin++;
                        }
                        while (begin < end && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        begin++;
                        end--;
                    } else if (sum < target) {
                        begin++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return res;
    }

    public List<List<Integer>> fourSum2(int[] nums, int target) {

        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 3 && nums[i] * 4 <= target; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            if (nums[i] + 3 * nums[n - 1] < target)
                continue;
            for (int j = i + 1; j < n - 2 && nums[i] + nums[j] * 3 <= target; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int left = j + 1, right = n - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target)
                        left++;
                    else if (sum > target)
                        right--;
                    else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    }
                }
            }
        }
        return res;
    }
}