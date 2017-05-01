import dataStructures.ArraysAndStrings.Seven.MatrixZeroWithHashSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixZeroWithHashSetTest {

	int[][] expectedMatrix;
	int[][] matrix;


	@Before
	public void setUp() {
		matrix = new int[4][4];
	    /*
         |1 |2 |0 |4 |
         |5 |0 |0 |8 |
         |9 |10|11|12|
         |13|14|15|16|
         */
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 0;
		matrix[0][3] = 4;
		matrix[1][0] = 5;
		matrix[1][1] = 0;
		matrix[1][2] = 0;
		matrix[1][3] = 8;
		matrix[2][0] = 9;
		matrix[2][1] = 10;
		matrix[2][2] = 11;
		matrix[2][3] = 12;
		matrix[3][0] = 13;
		matrix[3][1] = 14;
		matrix[3][2] = 15;
		matrix[3][3] = 16;
       /*
         |0 |0 |0 |0 |
         |0 |0 |0 |0 |
         |9 |0 |0 |12|
         |13|0 |0 |0 |
         */
		expectedMatrix = new int[4][4];
		expectedMatrix[0][0] = 0;
		expectedMatrix[0][1] = 0;
		expectedMatrix[0][2] = 0;
		expectedMatrix[0][3] = 0;
		expectedMatrix[1][0] = 0;
		expectedMatrix[1][1] = 0;
		expectedMatrix[1][2] = 0;
		expectedMatrix[1][3] = 0;
		expectedMatrix[2][0] = 9;
		expectedMatrix[2][1] = 0;
		expectedMatrix[2][2] = 0;
		expectedMatrix[2][3] = 12;
		expectedMatrix[3][0] = 13;
		expectedMatrix[3][1] = 0;
		expectedMatrix[3][2] = 0;
		expectedMatrix[3][3] = 16;

	}

	@Test
	public void test_matrix_should_update_columns_and_rows_that_have_zero_value_with_HashSet() {

		MatrixZeroWithHashSet matrixZeroWithHashSet = new MatrixZeroWithHashSet();
		int[][] actualMatrix = matrixZeroWithHashSet.check(matrix);
		Assert.assertArrayEquals(actualMatrix, expectedMatrix);

	}


}
