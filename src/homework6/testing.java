package homework6;

import java.util.ArrayList;
import java.util.List;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<String> cardNames = new ArrayList<String>();
		// List<Integer> valuec = new ArrayList<Integer>();
		// valuec.addAll();

		List<Card> names = new ArrayList<Card>();

		final String[] valuesC = { "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace" };
		final String[] cardSuit = { "Hearts", "Spades", "Diamonds", "Clubs" };

		final Integer[] cardWorth = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

		// String cardsuitNew = (" "); //cardSuit[i];
		Integer i = 0;
		for (String values : valuesC) {
			// System.out.println(values);

			for (String suits : cardSuit) {
				// System.out.println(suits);

				String cardsuit = values + " of " + suits;
				int value = cardWorth[i];

				Card card = new Card(value, cardsuit);

				System.out.println(card);
				// System.out.println(cardsuit);

			}
		}
	}
}
