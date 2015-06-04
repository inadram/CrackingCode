package main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Six;

import java.util.HashSet;

public class Parentheses {
    public HashSet<String> getAll(int i) {
       return generate(i,i,"", new HashSet<String>());
    }

    public HashSet<String> generate(int openLeft, int closeLeft, String output, HashSet<String> collection){
        if(openLeft==0 && closeLeft==0){
            collection.add(output);
            return collection;
        }
        if(openLeft>0) {
            collection= generate(decrease(openLeft), closeLeft, output.concat("("),collection);
        }
        if(closeLeft>0 && (opened(output) > closed(output))){
            collection =generate(openLeft,decrease(closeLeft),output.concat(")"),collection);
        }
       return   collection;

    }

    private int closed(String output) {
        return countOccurrence(output,")");
    }

    private int opened(String output) {
        return countOccurrence(output,"(");
    }

    private int decrease(int number){
         return (number<=1)?0:--number;
    }

    private int countOccurrence(String str, String character){
        int length = str.length();
        String replace = str.replace(character, "");
        return length - replace.length();
    }

}
