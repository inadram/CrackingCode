package main.ConceptsAndAlgorothms.RecursionAndDynamicProgramming.Five;

import java.util.ArrayList;

public class Permutations {
    public ArrayList<String> getAllPermutations(char[] chars, int index, ArrayList<String> permutations) {
        if (chars.length <= index) {
            return permutations;
        }
        if(permutations.size()==0){
            permutations.add("");
        }
        ArrayList<String> allPermutations = new ArrayList<String>();
        for (String permutation : permutations) {
            allPermutations = generatePermutations(String.valueOf(chars[index]), 0, permutation, allPermutations);
        }
        return getAllPermutations(chars, ++index, allPermutations);
    }

    public ArrayList<String> generatePermutations(String ch, int index, String permutation, ArrayList<String> permutations) {

        String prefix = permutation.substring(0, index);
        String suffix = permutation.substring(index, permutation.length());
        permutations.add(prefix.concat(ch).concat(suffix));

        if (index >= permutation.length()) {
            return permutations;
        }

        return generatePermutations(ch, ++index, permutation, permutations);
    }
}
