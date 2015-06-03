package main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Four;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetOfStrings {
    public ArrayList<Set<String>> getSubsets(ArrayList<Set<String>> setOfStrings, int index, ArrayList<Set<String>> subsets) {
        if(index>=setOfStrings.size()){
            subsets.add(new HashSet<String>());
            return subsets;
        }
        Set<String> set = setOfStrings.get(index);
        subsets =addSubset(set,0, subsets);
        return getSubsets(setOfStrings,++index,subsets);
    }

    public  ArrayList<Set<String>> addSubset(Set<String> set, int index, ArrayList<Set<String>> subsets){
        if(index>=subsets.size()){
            subsets.add(set);
            return subsets;
        }
        Set<String>  subset= new HashSet<String>(subsets.get(index)) ;
        subset.addAll(set);
        if(!subsets.contains(subset)){
            subsets.add(subset);
        }
        return addSubset(set, ++index,subsets);
    }
}
