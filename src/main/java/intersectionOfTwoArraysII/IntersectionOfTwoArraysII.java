/*
 * @Source: https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 * @Author: Tian Zhuo
 * @Date: 2019-01-09 20:56:16
 */
package intersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0){
            return new int[]{};
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> array = new ArrayList<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]) {
                array.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]) {
                i++;
            }else{
                j++;
            }
        }
        int[] res = new int[array.size()];
        for (int k = 0; k < array.size(); k++) {
            res[k] = array.get(k);
        }
        return res;
    }
}