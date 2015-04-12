package main.dataStructures.arraysAndStrings.Seven;

import java.awt.*;
import java.util.HashSet;

public class MatrixZero {
    public int[][] check(int[][] matrix) {
        HashSet<Point> points =new HashSet<Point>();
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix.length;j++){
              if(matrix[i][j]==0){
                  points.add(new Point(i,j));
              }
           }
       }

       for(Point point:points){
           for(int j=0;j<matrix[point.x].length;j++){
               matrix[point.x][j]=0;
           }
           for(int i=0;i<matrix.length;i++){
               matrix[i][point.y]=0;
           }
       }
        return matrix;
    }
}
