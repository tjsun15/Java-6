package homework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.List;

public class Deck {

	// private List<Card> value; //List of card called value

	List<Card> names = new ArrayList<Card>();

	final String[] valuesC = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	final String[] cardSuit = { "Hearts", "Spades", "Diamonds", "Clubs" };

	final Integer[] cardWorth = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

	// String cardsuitNew = (" "); //cardSuit[i];

	public Deck() {

		for (String suit : cardSuit) {
			// System.out.println(suits);

			for (int i = 0; i < valuesC.length; i++) {

				// for (String values: valuesC) {
				// System.out.println(values);
				String cardsuit = valuesC[i] + " of " + suit;

				int value = cardWorth[i];

				Card card = new Card(value, cardsuit);
				names.add(card);

			}
		}
	}

	public void shuffle() { // changed to static

		Random random = new Random();

		for (int i = names.size() - 1; i > 0; i--) {

			int b = random.nextInt(i + 1); // <<<<<when I try to change the size, 52, I get an out of bounds error; it
											// will only accept 8 or less

			Card namesAtIndexI = names.get(i);
			Card namesAtIndexB = names.get(b);

			names.set(i, namesAtIndexB);
			names.set(b, namesAtIndexI);

		}

	}

	public Card draw() {
		return names.remove(0);
	}
}
