package main.ConceptsAndAlgorothms.RecursionAndDynamicProgramming.Two;

import java.awt.*;
import java.util.ArrayList;

public class XYGridIsFree {
    private ArrayList<Point> occupied;

    public XYGridIsFree(ArrayList<Point> occupied){
        this.occupied = occupied;
    }
    public int navigate(int x, int y) {
        if (x < 0 || y < 0) {
            return 0;
        } else if (y == 0 && x == 0) {
            return 1;
        }

        int times = (isFree(x-1,y))?navigate(x - 1, y):0;
        times += (isFree(x,y-1))?navigate(x, y - 1):0;
        return times;

    }

    private boolean isFree(int x, int y) {
        return !occupied.contains(new Point(x,y));
    }
}
