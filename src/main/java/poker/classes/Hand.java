package poker.classes;

import java.util.ArrayList;

import poker.enums.HandTypeEnum;

public abstract class Hand {
	protected ArrayList<Card> hand = new ArrayList<Card>();
	protected HandTypeEnum handType;

	public abstract void calculateHandType();

	public HandTypeEnum getHandType() {
		return handType;
	}

	public ArrayList<Card> getCards() {
		return hand;
	}
}





