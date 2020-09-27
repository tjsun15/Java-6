package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class Player {

	private List<Card> hand; // list of hand
	private int score;
	private String name;

	public Player(String name) {
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<Card>();
	}

	public List<Card> getHand() { // way to access private list
		return hand;
	}

	public void setHand(List<Card> hand) { // getters and setters for each field
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void describe() {
		System.out.println("Player: " + this.name);

		for (Card completeCard : hand) { // calls the describe method for each card in the hand list
			completeCard.describe();
		}
	}

	public Card flip() {
		return hand.remove(0);

	}

	public void draw(Deck deck) { // Parameter of method consists of (the "class" and "method") class can be used
									// as an object
		Card completeCard = deck.draw(); // takes Deck as an argument, calls the draw method on deck, add the returned
											// card to the hand field
		hand.add(completeCard);
	}

	public void incrementScore() {
		score += 1;
	}

}
