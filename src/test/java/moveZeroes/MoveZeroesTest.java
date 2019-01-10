/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-10 21:45:02
 */
package moveZeroes;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MoveZeroesTest {
    @Test
    public void testMoveZeros() {
        MoveZeroes mz = new MoveZeroes();
        int[] res = new int[] { 1, 2, 0, 0, 3, 8, 0 };
        mz.moveZeroes2(res);
        assertArrayEquals(new int[] { 1, 2, 3, 8, 0, 0, 0 }, res);

        int[] res1 = new int[] { 0, 1, 0, 3, 12 };
        mz.moveZeroes(res1);
        assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, res1);
    }
}