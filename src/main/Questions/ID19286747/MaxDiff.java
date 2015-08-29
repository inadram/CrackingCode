package main.Questions.ID19286747;

import java.util.ArrayList;

public class MaxDiff {
    ArrayList<Integer> maxArray = new ArrayList<Integer>();
    ArrayList<Integer> minArray = new ArrayList<Integer>();
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    int maxDiff = Integer.MIN_VALUE;
    public int get(ArrayList<Integer> input) {
        for(int i=1;i<input.size()+1;i++) {
            getMax(input, 0, i);
            getMin(input, i + 1, input.size());
            int tempDiff = max - min;
            if(tempDiff >maxDiff){
                maxDiff = tempDiff;
            }
        }
        for(int i=1;i<input.size()+1;i++) {
            getMin(input, 0, i);
            getMax(input, i + 1, input.size());
            int tempDiff = max - min;
            if(tempDiff >maxDiff){
               maxDiff = tempDiff;
            }
        }

        return maxDiff;
    }

    public void getMax(ArrayList<Integer> input, int start,int end) {
        if (end > start) {
            int tempMax = 0;
            ArrayList<Integer> tempMaxArray = new ArrayList<Integer>();
            for (int i = start; i < end; i++) {
                tempMaxArray.add(input.get(i));
                tempMax += input.get(i);

                if (tempMax > max) {
                    max = tempMax;
                    maxArray = tempMaxArray;
                }

            }
            getMax(input, start + 1,end);
        }
    }

    public void getMin(ArrayList<Integer> input, int start,int end){
        if(end>start) {

            int tempMin = 0;
            ArrayList<Integer> tempMinArray = new ArrayList<Integer>();
            for (int i = start; i < end; i++) {
                tempMinArray.add(input.get(i));
                tempMin += input.get(i);

                if (tempMin < min) {
                    min = tempMin;
                    minArray = tempMinArray;
                }

            }
            getMin(input, start + 1,end);
        }
    }
}
