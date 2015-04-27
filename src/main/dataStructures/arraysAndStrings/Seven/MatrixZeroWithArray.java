package main.dataStructures.ArraysAndStrings.Seven;

import java.util.ArrayList;

public class MatrixZeroWithArray {
    public int[][] check(int[][] matrix) {
        ArrayList<boolean[]> points = findZeros(matrix);
        return updateToZeroRowAndColumn(matrix, points.get(0), points.get(1));
    }


    private int[][] updateToZeroRowAndColumn(int[][] matrix, boolean[] xPoints, boolean[] yPoints) {
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(xPoints[i] || yPoints[j]){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }
    private ArrayList<boolean[]> findZeros(int[][] matrix) {
        boolean[] xPoints =new boolean[matrix.length];
        boolean[] yPoints =new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==0){
                    xPoints[i]=true;
                    yPoints[j]=true;
                }
            }
        }
        ArrayList<boolean[]> points= new ArrayList<boolean[]>();
        points.add(xPoints);
        points.add(yPoints);
        return points;
    }
}
