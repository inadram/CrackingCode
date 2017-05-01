package Moderate.One;

public class Swap {
    public int[] exec(int[] numbers) {
        int a = numbers[0];  //101
        int b = numbers[1];  //011
        a = a^b;  //110
        b =a^b;   //101
        a =a^b;    //011
        return new int[]{a,b};
    }
}
