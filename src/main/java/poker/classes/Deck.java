package poker.classes;

import java.util.ArrayList;

import poker.logic.ShuffleDeck;

public abstract class Deck {
	protected ArrayList<Card> deck = new ArrayList<Card>();

	public abstract void buildDeck();

	public void shuffelDeck() {
		ShuffleDeck shuffler = new ShuffleDeck();
		shuffler.shuffle(deck);
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

	public ArrayList<Card> dealCards(int numberToDeal) {
		ArrayList<Card> hand = new ArrayList<Card>();
		for (int i = 0; i < numberToDeal; i++) {
			hand.add(deck.remove(0));
		}
		return hand;
	}

}





