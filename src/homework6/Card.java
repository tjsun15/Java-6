package homework6;

public class Card {

	private int value;
	private String name;

	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getCard() {
		return value;

	}

	// public Card(Integer value, String name) {
	// this.value = value;
	// this.name = name;
	public void setCard(Integer value) {
		this.value = value;
	}

	public String getname() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void describe() {
		System.out.println("Card information: " + name + "has a value of" + value);

/////Method that shows card info^^^^^		
	}

}
