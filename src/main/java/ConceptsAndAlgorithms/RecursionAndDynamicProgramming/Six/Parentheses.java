package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Six;

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
            collection= generate(openLeft-1, closeLeft, output.concat("("),collection);
        }
        if(closeLeft>openLeft){
            collection =generate(openLeft,closeLeft-1,output.concat(")"),collection);
        }
       return   collection;
    }
}
