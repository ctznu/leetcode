/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-16 18:14:51
 */
package threeSum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;
public class ThreeSumTest {
    @Test
    public void test3Sum() {
        ThreeSum ts = new ThreeSum();
        List<List<Integer>> res = ts.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals(res.size(), 2);
        for (List<Integer> list : res) {
            int sum = 0;
            for (Integer i : list){
                sum += i;
            }
            assertEquals(0, sum);
        }
    }
}