package main.ConceptsAndAlgorithms.BitManipulation.Lib;

public class BitInteger {
    public static int SIZE;
    boolean[] booleans=new boolean[SIZE];
    public BitInteger(int value){
        for(int i=0;SIZE>i;i++){
            booleans[i]= (((value >> i) & 1) == 1);
        }
    }

    public int get(int i){
        return (booleans[i])?1:0;
    }
}
