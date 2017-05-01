package Questions.ID15556758;

import java.awt.*;
import java.util.ArrayList;

public class Island {
    private int size;

    public Island(int size) {
        this.size = size;
    }


    public double getAlivePossibility(ArrayList<Point> islandMap, int steps, double possibility) {
        if (steps == 0) return possibility;
        double goesOut =0.0;
        ArrayList<Point> nextIsland = new ArrayList<Point>();
        for (Point entry : islandMap) {
            int x = (int) entry.getX();
            int y = (int) entry.getY();
            //goes up
            if(isGoesOut(x-1, y)) goesOut += 1;
            nextIsland.add(new Point(x-1, y));

            //goes down
            if(isGoesOut(x+1, y)) goesOut += 1;
            nextIsland.add(new Point(x+1, y));

            //goes left
            if(isGoesOut(x, y-1)) goesOut += 1;
            nextIsland.add(new Point(x, y-1));

            //goes right
            if(isGoesOut(x, y+1)) goesOut += 1;
            nextIsland.add(new Point(x, y+1));

        }
        double movement = nextIsland.size();
        return getAlivePossibility(nextIsland, steps - 1, 1 - (goesOut / movement));
    }

    private double move(double goesOut, int x, int y) {
        if (isGoesOut(x, y)) {
            goesOut += 1;
        }
        return goesOut;
    }

    public boolean isGoesOut(int x, int y) {
        return (x > size || x <= 0 || y > size || y <= 0);
    }
}
