package test;

import main.dataStructures.ArraysAndStrings.Six.Rotate;
import org.junit.Assert;
import org.junit.Test;

public class RotateTest {

    @Test
    public void test_matrix_rotate_90_degree(){
        byte[][] matrix = new byte[4][4];
        /*
         |1 |2 |3 |4 |
         |5 |6 |7 |8 |
         |9 |10|11|12|
         |13|14|15|16|
         */
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[0][3]=4;
        matrix[1][0]=5;
        matrix[1][1]=6;
        matrix[1][2]=7;
        matrix[1][3]=8;
        matrix[2][0]=9;
        matrix[2][1]=10;
        matrix[2][2]=11;
        matrix[2][3]=12;
        matrix[3][0]=13;
        matrix[3][1]=14;
        matrix[3][2]=15;
        matrix[3][3]=16;
        Rotate rotate=new Rotate();
        byte[][] expectedMatrix = new byte[4][4];
        /*
         |13|9 |5 |1 |
         |14|10|6 |2 |
         |15|11|7 |3 |
         |16|12|8 |4 |
         */
        expectedMatrix[0][0]=13;
        expectedMatrix[0][1]=9;
        expectedMatrix[0][2]=5;
        expectedMatrix[0][3]=1;
        expectedMatrix[1][0]=14;
        expectedMatrix[1][1]=10;
        expectedMatrix[1][2]=6;
        expectedMatrix[1][3]=2;
        expectedMatrix[2][0]=15;
        expectedMatrix[2][1]=11;
        expectedMatrix[2][2]=7;
        expectedMatrix[2][3]=3;
        expectedMatrix[3][0]=16;
        expectedMatrix[3][1]=12;
        expectedMatrix[3][2]=8;
        expectedMatrix[3][3]=4;
        byte[][] actualMatrix= rotate.ninety(matrix);

        Assert.assertArrayEquals(expectedMatrix,actualMatrix);
    }
}
