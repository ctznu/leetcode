/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-18 11:11:33
 */
package fourSum;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class FourSumTest {
    @Test
    public void testFourSum() {
        FourSum fs = new FourSum();
        List<List<Integer>> res = fs.fourSum1(new int[]{1, 0, -1, 0, -2, 2}, 0);
        assertEquals(res.size(), 3);
        for (List<Integer> list : res) {
            int sum = 0;
            for (Integer i : list){
                sum += i;
            }
            assertEquals(0, sum);
        }

    }
}