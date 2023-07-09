package poker.models;

import poker.classes.Deck;
import poker.enums.FiveCardPokerFaceEnum;
import poker.enums.SuitEnum;

public class FiveHandPokerDeck extends Deck {

	public FiveHandPokerDeck() {
		buildDeck();
	}

	@Override
	public void buildDeck() {
		deck.clear();
		for (SuitEnum suit : SuitEnum.values()) {
			for (FiveCardPokerFaceEnum face : FiveCardPokerFaceEnum.values()) {
				deck.add(new FiveHandPokerCard(face, suit));
			}
		}
	}
}





