package main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Eight;

public class CalculateCent {
    public int execute(int remainMoney,int denom) {
        int nextDenom=0;
        switch (denom) {
            case 25:
                nextDenom = 10;
                break;
            case 10:
                nextDenom = 5;
                break;
            case 5:
                nextDenom = 1;
                break;
            case 1:
                return 1;
        }
        int ways =0;
        for(int i=0;i*denom<=remainMoney;i++){
            ways+=execute(remainMoney - i * denom,nextDenom);
        }
        return ways;

    }

}
