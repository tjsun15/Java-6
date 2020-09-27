package homework6;

//import java.util.Collections;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck(); // instantiated new deck
		Player jmomoa = new Player("Jmomoa");
		Player djohnson = new Player("DJohnson"); // instantiated new players

		deck.shuffle();

		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				jmomoa.draw(deck);
			} else {
				djohnson.draw(deck);
			}

		}

		for (int i = 0; i < 26; i++) {

			Card jmomoaflip = jmomoa.flip();
			Card djohnsonflip = djohnson.flip();

		//	System.out.println(jmomoaflip.getName());
		//	System.out.println(djohnsonflip.getName());

			if (jmomoaflip.getCard() > djohnsonflip.getCard()) {
				jmomoa.incrementScore();

			} else if (djohnsonflip.getCard() > jmomoaflip.getCard()) {
				djohnson.incrementScore();

			} else {
				jmomoa.incrementScore();
				djohnson.incrementScore();

			}

		}

		int jmomoaScore = jmomoa.getScore();

		int djohnsonScore = djohnson.getScore();

		if (jmomoaScore > djohnsonScore) {
			System.out.println("The winner is: " + jmomoa.getName() + " with a score of " + jmomoaScore);
		} else if (djohnsonScore > jmomoaScore) {
			System.out.println("The winner is: " + djohnson.getName() + " with a score of " + djohnsonScore);
		} else {
			System.out.println("You both tied!");
		}

	}
}
