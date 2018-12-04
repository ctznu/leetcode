package nextPermutation;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-04 21:31:45
 */

 public class NextPermutationTest {
    NextPermutation np = new NextPermutation();

    @Test
    public void testNextPermutation() {
        int[] a = { 1, 2, 3 };
        np.nextPermutation(a);
        assertArrayEquals(a, new int[] { 1, 3, 2 });
    }

    @Test
    public void testNextPermutation2() {
        int[] a = { 1, 5, 1};
        np.nextPermutation(a);
        assertArrayEquals(a, new int[] {5, 1, 1});
    }

 }
