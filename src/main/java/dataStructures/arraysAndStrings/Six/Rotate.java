package dataStructures.ArraysAndStrings.Six;

public class Rotate {

    public byte[][] ninety(byte[][] matrix) {
        /*
         |1 |2 |3 |4 |
         |5 |6 |7 |8 |
         |9 |10|11|12|
         |13|14|15|16|

         |13|9 |5 |1 |
         |14|10|6 |2 |
         |15|11|7 |3 |
         |16|12|8 |4 |
         */
        int length = matrix.length;
        int layer = length / 2;
        for(int i=0;i< layer;i++){
            int index = length -1;
            for(int j=i;j< index -i;j++){
                //save top
                byte top =matrix[i][j] ;

                // top <= left
                matrix[i][j]= matrix[index-j][i];

                // left <= bottom
                matrix[index-j][i]= matrix[index-i][index-j];

                // bottom <= right
                matrix[index-i][index-j]= matrix[j][index-i];

                // right <= top
                matrix[j][index-i]= top;

            }
        }

        return matrix;
    }
}
