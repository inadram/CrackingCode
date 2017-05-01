package Questions.ID15556758;

import java.util.HashMap;
import java.util.Map;

public class DpIsland {

    public double aliveProb(int x, int y, int N, int n) {
        if (x < 0 || x > (N - 1) || y < 0 || y > (N - 1) || N < 1) return 0.0;
        return aliveProb(x, y, N, n, new HashMap<String, Double>());
    }

    private double aliveProb(int x, int y, int n, int step, Map<String, Double> map) {
        if (0 == step) return 1.0;

        String key = x + "," + y + "," + step;
        if (map.containsKey(key)) return map.get(key);

        double p = 0.0;
        //up
        if (x > 0) {
            double v = aliveProb(x - 1, y, n, step - 1, map);
            p += 0.25 * v;
        }
        //down
        if (x <= n ) {
            double v = aliveProb(x + 1, y, n, step - 1, map);
            p += 0.25 * v;
        }
        //left
        if (y > 0) {
            double v = aliveProb(x, y - 1, n, step - 1, map);
            p += 0.25 * v;
        }
        //right
        if (y <= n ) {
            double v = aliveProb(x, y + 1, n, step - 1, map);
            p += 0.25 * v;
        }

        map.put(key, p);
        return p;
    }


}
