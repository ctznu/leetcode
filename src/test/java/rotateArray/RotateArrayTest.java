/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-06 18:22:09
 */
package rotateArray;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateArrayTest {
    @Test
    public void testRotateArray() {
        RotateArray ra = new RotateArray();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        ra.rotate1(nums, 3);
        int[] exp = new int[]{5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(exp, nums);

        int[] nums1 = new int[] { 1, 2, 3, 4, 5, 6 };
        ra.rotate(nums1, 2);
        int[] exp1 = new int[] { 5, 6, 1, 2, 3, 4 };
        assertArrayEquals(exp1, nums1);

        int[] nums11 = new int[] { 1, 2, 3, 4, 5, 6 };
        ra.rotate(nums11, 3);
        int[] exp11 = new int[] { 4, 5, 6, 1, 2, 3 };
        assertArrayEquals(exp11, nums11);

        int[] nums111 = new int[] { 1, 2, 3, 4, 5, 6 };
        ra.rotate(nums111, 4);
        int[] exp111 = new int[] { 3, 4, 5, 6, 1, 2 };
        assertArrayEquals(exp111, nums111);
        
        int[] nums2 = new int[] { 1, 2, 3, 4};
        ra.rotate(nums2, 1);
        int[] exp2 = new int[] { 4, 1, 2, 3 };
        assertArrayEquals(exp2, nums2);

        int[] nums3 = new int[] { 1, 2 };
        ra.rotate(nums3, 1);
        int[] exp3 = new int[] { 2, 1 };
        assertArrayEquals(exp3, nums3);

        int[] nums4 = new int[] { 1 };
        ra.rotate(nums4, 1);
        int[] exp4 = new int[] { 1 };
        assertArrayEquals(exp4, nums4);
    }
}