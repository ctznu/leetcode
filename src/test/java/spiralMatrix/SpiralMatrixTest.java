/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-04 22:49:27
 */
package spiralMatrix;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

public class SpiralMatrixTest {
    @Test
    public void testSpiralOrder() {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        List<Integer> res = sm.spiralOrder(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertArrayEquals(res.toArray(), expected.toArray());

        int[][] matrix1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12},
        };
        res = sm.spiralOrder(matrix1);
        expected = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        assertArrayEquals(res.toArray(), expected.toArray());

        int[][] matrix11 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12},
            {13,14,15,16},
        };
        res = sm.spiralOrder(matrix11);
        expected = Arrays.asList(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10);
        assertArrayEquals(res.toArray(), expected.toArray());

        int[][] matrix2 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
        };
        res = sm.spiralOrder(matrix2);
        expected = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 14, 13, 12, 11, 6, 7, 8, 9);
        assertArrayEquals(res.toArray(), expected.toArray());

        int[][] matrix3 = {
            {1, 2, 3, 4, 5, 6},
            {6, 7, 8, 9, 10, 11},
            {11, 12, 13, 14, 15, 16},
        };
        res = sm.spiralOrder(matrix3);
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 11, 16, 15, 14, 13, 12, 11, 6, 7, 8, 9, 10);
        assertArrayEquals(res.toArray(), expected.toArray());

        int[][] matrix4 = {
            {1,2,3,4,5,6,7,8,9,10},
            {11,12,13,14,15,16,17,18,19,20},
        };
        res = sm.spiralOrder(matrix4);
        expected = Arrays.asList(1,2,3,4,5,6,7,8,9,10, 20, 19, 18, 17,16,15,14,13,12,11);
        assertArrayEquals(res.toArray(), expected.toArray());

        int[][] matrix5 = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11,12,13,14,15,16,17,18,19,20},
            {21,22,23,24,25,26,27,28,29,30},
            {31,32,33,34,35,36,37,38,39,40},
            {41,42,43,44,45,46,47,48,49,50},
            {51,52,53,54,55,56,57,58,59,60},
            {61,62,63,64,65,66,67,68,69,70},
            {71,72,73,74,75,76,77,78,79,80},
            {81,82,83,84,85,86,87,88,89,90},
            {91,92,93,94,95,96,97,98,99,100}
        };
        res = sm.spiralOrder(matrix5);
        expected = Arrays.asList(1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,
        100,99,98,97,96,95,94,93,92,91,81,71,61,51,41,31,21,11,12,13,14,15,16,
        17,18,19,29,39,49,59,69,79,89,88,87,86,85,84,83,82,72,62,52,42,32,22,23,
        24,25,26,27,28,38,48,58,68,78,77,76,75,74,73,63,53,43,33,34,35,36,37,47,57,67,66,65,64,54,44,45,46,56,55);
        assertArrayEquals(res.toArray(), expected.toArray());
    }
}