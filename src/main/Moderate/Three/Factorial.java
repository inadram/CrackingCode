package main.Moderate.Three;

public class Factorial {

    private int n;

    public Factorial(int n) {
        this.n = n;
    }

    public int zeros() {
        int value = calculateValue(n);
        return calculateZeros(value);
    }

    private int calculateZeros(int value) {
        if (value == 0) return 0;
        if (value % 10 != 0) return 0;
        return 1 + calculateZeros(value / 10);
    }

    private int calculateValue(int n) {
        if (n == 1) return 1;
        return n * calculateValue(n - 1);
    }


    public int optimiseZeros() {
        return calculateValueOptimise(n, n);
    }

    private int calculateValueOptimise(int n, int value) {
        if (n == 0) return 0;
        int reminder = value % 10;
        int zero = (reminder == 0) ? 1 : 0;
        value = (reminder == 0) ? value/10 : reminder;
        return zero + calculateValueOptimise(n - 1, (n - 1) * value);
    }

    public int multiples5() {
       int count =0;
        while (n>0){
           n/=5;
           count+=n;
        }
        return count;
    }
}
