/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-25 13:23:22
 */
package combinationSum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class CombinationSumTest {
    @Test
    public void testCombinationSum () {
        CombinationSum cs = new CombinationSum();
        List<List<Integer>> res = cs.combinationSum(new int[]{2, 3, 6, 7}, 7);
        assertEquals(res.size(), 2);
        for (List<Integer> list : res) {
            int sum = 0;
            for (Integer i : list){
                sum += i;
            }
            assertEquals(7, sum);
        }
    }

}