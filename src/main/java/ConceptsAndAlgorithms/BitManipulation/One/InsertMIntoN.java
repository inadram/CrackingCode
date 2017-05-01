package ConceptsAndAlgorithms.BitManipulation.One;

public class InsertMIntoN {
    public int add(int n, int m, int i, int j) {
        //n=11111111111
        //m=10011
        //i=2
        //j=6
        int shiftedM = m<<i; //1001100
        int clearedN = ~(((1<<(j-i))-1)<<i) ; // 10000 => 1111 =>111100 => 11111000011
        n = clearedN & n; //11111111111 &   11111000011 => 11111000011
        return n|shiftedM; //11111000011 | 1001100 => 11111001111
    }
}
