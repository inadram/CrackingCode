package main.dataStructures.arraysAndStrings.Seven;

import java.util.HashSet;

public class MatrixZeroWithHashSet {
    public int[][] check(int[][] matrix) {
        HashSet<Integer>[] points = findZeros(matrix);
        return updateToZeroRowAndColumn(matrix, points);
    }

    private int[][] updateToZeroRowAndColumn(int[][] matrix, HashSet<Integer>[] points) {
        for(Integer xPoint:points[0]){
            for(int j=0;j<matrix.length;j++){
                matrix[xPoint][j]=0;
            }
        }
        for(Integer yPoint:points[1]){
            for(int i=0;i<matrix.length;i++){
                matrix[i][yPoint]=0;
            }
        }
        return matrix;
    }
    private HashSet<Integer>[] findZeros(int[][] matrix) {
        HashSet<Integer> xPoints =new HashSet<Integer>();
        HashSet<Integer> yPoints =new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==0){
                    xPoints.add(i);
                    yPoints.add(j);
                }
            }
        }
        return new HashSet[]{xPoints,yPoints};
    }
}
