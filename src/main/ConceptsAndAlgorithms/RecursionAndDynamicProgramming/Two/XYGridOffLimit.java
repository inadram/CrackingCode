package main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Two;

import java.awt.*;
import java.util.ArrayList;

public class XYGridOffLimit {
    private ArrayList<Point> occupied;

    public XYGridOffLimit(ArrayList<Point> occupied){
        this.occupied = occupied;
    }
    public int navigate(int x, int y) {
        if (occupied(x,y) ||x < 0 || y < 0) {
            return 0;
        } else if (y == 0 && x == 0) {
            return 1;
        }

        int times = navigate(x - 1, y);
        times += navigate(x, y - 1);
        return times;

    }

    private boolean occupied(int x, int y) {
        return occupied.contains(new Point(x,y));
    }
}
