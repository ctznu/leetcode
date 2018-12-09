/*
 * @Source: https://leetcode-cn.com/problems/median-of-two-sorted-arrays/description/
 * @Author: Tian Zhuo
 * @Date: 2018-12-09 21:59:55
 */
package medianOfTwoSortedArrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedNums = new int[nums1.length + nums2.length];
        if(nums1.length == 0 && nums2.length == 0) return 0;
        if(nums1.length == 0){
            mergedNums = nums2;
        }else if(nums2.length == 0){
            mergedNums = nums1;
        }else if (nums1[nums1.length - 1] <= nums2[0]) {
            System.arraycopy(nums1, 0, mergedNums, 0, nums1.length);
            System.arraycopy(nums2, 0, mergedNums, nums1.length, nums2.length);
        } else if (nums1[0] >= nums2[nums2.length - 1]) {
            System.arraycopy(nums2, 0, mergedNums, 0, nums2.length);
            System.arraycopy(nums1, 0, mergedNums, nums2.length, nums1.length);
        } else {
            int i = 0;
            int j = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    mergedNums[i + j] = nums1[i++];
                } else {
                    mergedNums[i + j] = nums2[j++];
                }
            }
            if(i == nums1.length){
                System.arraycopy(nums2, j, mergedNums, i + j, nums2.length - j);
            }
            if(j == nums2.length){
                System.arraycopy(nums1, i, mergedNums, i + j, nums1.length - i);
            }
        }
        int len = mergedNums.length;
        return len % 2 == 1 ? mergedNums[(len - 1) / 2] : (mergedNums[len / 2] + mergedNums[len / 2 - 1]) / 2.0;
    }

    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
		int nums2length = nums2.length;
		int[] r = new int[nums1.length + nums2length];

		int index = 0;
		int j = 0;
		for (int num : nums1) {
			while (j < nums2length && num > nums2[j]) {
				r[index] = nums2[j];
				j++;
				index++;
			}
			r[index] = num;
			index++;
		}
		for (; j < nums2length; j++) {
			r[index] = nums2[j];
			index++;
		}

		int mi = r.length / 2;
		return r.length % 2 == 1 ? r[mi] : (r[mi - 1] + r[mi]) / 2.0;
	}
}