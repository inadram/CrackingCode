package main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Nine;

import java.awt.*;
import java.util.ArrayList;

public class ChessQueen {
    int gridSize;


    public ChessQueen(int gridSize){
        this.gridSize = gridSize;
    }
    public int find(ArrayList<Point> queensPosition, int x, int possibleWays) {
        if(x<gridSize) {
            for (int y = 0; y < gridSize; y++) {
                Point nextPoint = new Point(x, y);
                if (isValid(queensPosition, nextPoint,x)) {
                    queensPosition.add(x, nextPoint);
                    possibleWays=find(queensPosition, x + 1, possibleWays);
                }
            }
        } else{
            possibleWays= possibleWays+1;
        }
        return possibleWays;
    }

    private boolean isValid(ArrayList<Point> queensPosition, Point nextPoint, int currentX) {
        for(int x =0;x<currentX;x++) {
            Point point = queensPosition.get(x);
            boolean xCollide = nextPoint.getX() == point.getX();
            boolean yCollide = nextPoint.getY() == point.getY();
            boolean inSameGradient = (Math.abs(nextPoint.getY() - point.getY()) / Math.abs(nextPoint.getX() - point.getX()) == 1);
            if ((xCollide || yCollide || inSameGradient)) {
                return false;
            }
        }
        return true;
    }
}
