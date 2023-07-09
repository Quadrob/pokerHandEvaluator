package poker;

import poker.classes.Card;
import poker.classes.Deck;
import poker.classes.Hand;
import poker.models.FiveHandPokerDeck;
import poker.models.FiveHandPokerHand;

public class PokerApplication {

	public static void main(String[] args) throws Exception {
		try {
			Deck deck = new FiveHandPokerDeck();
			deck.shuffelDeck();
			Hand hand = new FiveHandPokerHand(deck.dealCards(5));

			System.out.print("Your hand: ");
			for (Card card : hand.getCards()) {
				System.out.print(card.toStringShort() + " ");
			}

			System.out.print("\nYou have: " + hand.getHandType().getLabel());

		} catch (Exception e) {
			System.out.println("Application failed with error: " + e);
			throw e;
		}
	}
}
