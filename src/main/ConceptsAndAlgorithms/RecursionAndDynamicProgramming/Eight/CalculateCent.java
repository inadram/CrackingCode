package main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Eight;

public class CalculateCent {
    public int execute(int remindMoney,int denom) {
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
        for(int i=0;i*denom<=remindMoney;i++){
            ways+=execute(remindMoney - i * denom,nextDenom);
        }
        return ways;

    }

}
