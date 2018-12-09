/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-09 23:00:25
 */
package medianOfTwoSortedArrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void testFindMedianSortedArrays() {
        MedianOfTwoSortedArrays mftsa = new MedianOfTwoSortedArrays();
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        double res = mftsa.findMedianSortedArrays1(nums1, nums2);
        System.out.println(res);
        assertEquals(2.0, res, 0.01);
    }
    @Test
    public void testFindMedianSortedArrays1() {
        MedianOfTwoSortedArrays mftsa = new MedianOfTwoSortedArrays();
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        double res = mftsa.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
        assertEquals(2.5, res, 0.01);
    }
    @Test
    public void testFindMedianSortedArrays2() {
        MedianOfTwoSortedArrays mftsa = new MedianOfTwoSortedArrays();
        int[] nums1 = {};
        int[] nums2 = {1};
        double res = mftsa.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
        assertEquals(1, res, 0.01);
    }
}