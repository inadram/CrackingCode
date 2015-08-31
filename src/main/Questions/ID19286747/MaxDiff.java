package main.Questions.ID19286747;

import java.util.ArrayList;

public class MaxDiff {
    int[][] dpMax ;
    int[][] dpMin ;
    ArrayList[][] dpMaxArray ;
    ArrayList[][] dpMinArray ;

    ArrayList maxArray = new ArrayList<Integer>();
    ArrayList minArray = new ArrayList<Integer>();
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    int maxDiff = Integer.MIN_VALUE;

    public int get(ArrayList<Integer> input) {
        int size = input.size();
        dpMax = new int[size+1][size+1];
        dpMin = new int[size+1][size+1];
        dpMaxArray = new ArrayList[size+1][size+1];
        dpMinArray = new ArrayList[size+1][size+1];
        for(int i=1;i< size +1;i++) {
            getMax(input, 0, i);
            getMin(input, i + 1, size);
            int tempDiff = max - min;
            if(tempDiff >maxDiff){
                maxDiff = tempDiff;
            }
        }
        for(int i=1;i< size +1;i++) {
            getMin(input, 0, i);
            getMax(input, i + 1, size);
            int tempDiff = max - min;
            if(tempDiff >maxDiff){
               maxDiff = tempDiff;
            }
        }

        return maxDiff;
    }

    public void getMax(ArrayList<Integer> input, int start,int end) {
        if (end > start) {
            if (dpMax[start][end] != 0) {
                max = dpMax[start][end];
                maxArray = dpMaxArray[start][end];
            } else {
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
                dpMax[start][end] = max;
                dpMaxArray[start][end] = maxArray;
                getMax(input, start + 1, end);
            }
        }
    }

    public void getMin(ArrayList<Integer> input, int start,int end){
        if(end>start) {
            if (dpMin[start][end] != 0) {
                min = dpMin[start][end];
                minArray = dpMinArray[start][end];
            } else {
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
                dpMin[start][end] = min;
                dpMinArray[start][end] = minArray;
                getMin(input, start + 1, end);
            }
        }
    }
}
