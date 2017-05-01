package Questions.ID15422849;

import java.util.ArrayList;

public class PotGame {

	//the strategy is to get max score, the player b also try to get max score which leave us min score
	public int max_coin(ArrayList<Integer> pots, int start, int end) {
		if (start > end)
			return 0;
		// when b choose start
		int one = max_coin(pots, start + 2, end);
		//when b choose end
		int two = max_coin(pots, start + 1, end - 1);
		//when winner choose start
		int a = pots.get(start) + Math.min(one, two);
		//when b choose start
		int three = max_coin(pots, start + 1, end - 1);
		//when b choose end
		int four = max_coin(pots, start, end - 2);
		//when winner choose end
		int b = pots.get(end) + Math.min(three, four);

		return Math.max(a, b);

	}
}
