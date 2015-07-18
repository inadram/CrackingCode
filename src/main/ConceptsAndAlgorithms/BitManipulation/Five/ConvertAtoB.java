package main.ConceptsAndAlgorithms.BitManipulation.Five;

import main.ConceptsAndAlgorithms.BitManipulation.Three.Lib.HowManyOnes;
import main.ConceptsAndAlgorithms.BitManipulation.Three.Lib.Utils;

public class ConvertAtoB {
    public int get(int a, int b) {
        //110010000
        //001000110
        int different=0;
        while (a>0||b>0){
           if(Utils.get(a,1)!=Utils.get(b,1)) different++;
            a>>=1;
            b>>=1;
        }

        return different;
    }

    public int getWithXOR(int a, int b){
       return HowManyOnes.get(a^b);
    }
}
