/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-03 21:46:50
 */
package diagonalTraverse;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DiagonalTraverseTest {
    @Test
    public void testFindDiagonalOrder () {
        DiagonalTraverse dt = new DiagonalTraverse();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
          };
        int[] res = dt.findDiagonalOrder(matrix);
        int[] expected = new int[] { 1, 2, 4, 7, 5, 3, 6, 8, 9 };
        assertArrayEquals(expected, res);

        int[][] matrix1 = {
            {1, 2, 3, 0},
            {4, 5, 6, 10},
            {7, 8, 9, 11},
            {12, 13, 14, 15},
        };
        res = dt.findDiagonalOrder(matrix1);
        expected = new int[] { 1, 2, 4, 7, 5, 3, 0, 6, 8, 12, 13, 9, 10, 11, 14, 15 };
        assertArrayEquals(expected, res);
    }
}