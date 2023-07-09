package poker.enums;

import poker.interfaces.IFaceEnum;

public enum FiveCardPokerFaceEnum implements IFaceEnum {
	
	TWO(0, "2"),
	THREE(1, "3"),
	FOUR(2, "4"),
	FIVE(3, "5"),
	SIX(4, "6"),
	SEVEN(5, "7"),
	EIGHT(6, "8"),
	NINE(7, "9"),
	TEN(8, "10"),
	JACK(9, "J"),
	QUEEN(10, "Q"),
	KING(11, "K"),
	ACE(12, "A");

	private int cardRank;
	private String cardShortcut;

	FiveCardPokerFaceEnum(int rank, String shortcut) {
		this.cardRank = rank;
		this.cardShortcut = shortcut;
	}

	@Override
	public int getRank() {
		return this.cardRank;
	}

	@Override
	public String getCardShortcut() {
		return this.cardShortcut;
	}

	@Override
	public String toString() {
		return this.name().substring(0, 1) + this.name().substring(1).toLowerCase();
	}

}






