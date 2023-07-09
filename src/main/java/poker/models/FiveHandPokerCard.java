package poker.models;

import poker.classes.Card;
import poker.enums.FiveCardPokerFaceEnum;
import poker.enums.SuitEnum;

public class FiveHandPokerCard extends Card {

	public FiveHandPokerCard(FiveCardPokerFaceEnum cardFace, SuitEnum cardSuit) {
		face = cardFace;
		suit = cardSuit;
	}
}





