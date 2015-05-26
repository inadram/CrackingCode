package main.ConceptsAndAlgorothms.RecursionAndDynamicProgramming.Two;

import java.awt.*;
import java.util.ArrayList;

public class XYGridPath {
    public int navigate(int x, int y, ArrayList<Point> path) {
        if (x >= 0 && y >= 0) {

            if (y == 0 && x == 0) {
                path.add(new Point(x, y));
            }
            navigate(x - 1, y, path);
            navigate(x, y - 1, path);
        }
        return path.size();
    }
}
