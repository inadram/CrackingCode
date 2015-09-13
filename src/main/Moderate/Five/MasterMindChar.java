package main.Moderate.Five;

public class MasterMindChar {

    int[] frequency = new int[4];
    int hits=0;
    int pseudos =0;

    public MasterMindChar(String solution, String guess) {
        char[] solutionChars = solution.toCharArray();
        char[] guessChars = guess.toCharArray();
        calculateHits(solutionChars, guessChars);

        calculatePseudoHits(solutionChars, guessChars);
    }

    private void calculatePseudoHits(char[] solutionChars, char[] guessChars) {
        for(int i=0;i<guessChars.length;i++){
            if(guessChars[i]!=solutionChars[i] && code(guessChars[i])>=0 && frequency[code(guessChars[i])]>0){
                frequency[code(guessChars[i])]--;
                pseudos++;
            }
        }
    }

    private void calculateHits(char[] solutionChars, char[] guessChars) {
        for(int i =0; i<solutionChars.length;i++){
            if(solutionChars[i]==guessChars[i]){
                hits++;
            }else{
                frequency[code(solutionChars[i])]++;
            }
        }
    }

    private int code(Character c){
        switch(c){
            case 'R':
                return 0;
            case 'G':
                return 1;
            case 'B':
                return 2;
            case 'Y':
                return 3;
            default:
                return -1;
        }
    }
    public int getHits() {
        return hits;
    }

    public int getPseudoHit() {
        return pseudos;
    }
}
