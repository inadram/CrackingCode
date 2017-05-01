package Moderate.Five;

import java.util.Arrays;

public class MasterMind {

	int hits = 0;
	int pseudos = 0;

	public MasterMind(String solution, String guess) {
		char[] solutionChars = solution.toCharArray();
		char[] guessChars = guess.toCharArray();
		solution = findHits(solutionChars, guessChars);
		findPsuedoHit(solution, guessChars);

	}

	private void findPsuedoHit(String solution, char[] guessChars) {
		for (char guess : guessChars) {
			if (solution.contains(String.valueOf(guess))) {
				solution = solution.replace(guess, '\0');
				pseudos++;
			}
		}

	}

	private String findHits(char[] solutionChars, char[] guessChars) {
		for (int i = 0; i < solutionChars.length; i++) {
			if (solutionChars[i] == guessChars[i]) {
				hits++;
				solutionChars[i] = '\0';
			}
		}
		return Arrays.toString(solutionChars);

	}

	public int getHits() {
		return hits;
	}

	public int getPseudoHit() {
		return pseudos;
	}
}
