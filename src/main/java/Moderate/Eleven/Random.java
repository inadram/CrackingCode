package Moderate.Eleven;

public class Random {
    public int rand7() {
        while (true) {
            int first = 2 * rand5();
            int second = rand2();
            int random = first + second;
            if (random < 7) return random;
        }
    }

    private int rand2() {
        while (true) {
            int rand5 = rand5();
            if (rand5 != 4) return rand5 % 2;
        }
    }

    private int rand5() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(5);

    }
}
