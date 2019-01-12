/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-12 13:29:12
 */
package rotateImage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RotateImageTest {
    @Test
    public void testRotate() {
        RotateImage ri = new RotateImage();
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] expected = {
            {7,4,1},
            {8,5,2},
            {9,6,3}
        };
        ri.rotate(matrix);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                assertEquals(expected[i][j], matrix[i][j]);
            }
        }
        int[][] matrix1 = {
            { 5, 1, 9,11},
            { 2, 4, 8,10},
            {13, 3, 6, 7},
            {15,14,12,16}
        };
        int[][] expected1 = {
            {15,13, 2, 5},
            {14, 3, 4, 1},
            {12, 6, 8, 9},
            {16, 7,10,11}
        };
        ri.rotate(matrix1);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                assertEquals(expected1[i][j], matrix1[i][j]);
            }
        }
    }
}