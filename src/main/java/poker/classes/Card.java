package poker.classes;

import poker.enums.CompareCardEnum;
import poker.enums.SuitEnum;
import poker.interfaces.IFaceEnum;

public abstract class Card implements Comparable<Card> {
	protected IFaceEnum face;
	protected SuitEnum suit;

	public IFaceEnum getFace() {
		return face;
	}

	public SuitEnum getSuit() {
		return suit;
	}

	public String toStringShort() {
		return (face.getCardShortcut() + suit.toString());
	}

	@Override
	public String toString() {
		return (face.toString() + " of " + suit.toString());
    }

	@Override
	public int compareTo(Card otherCard) {
		int currentRank = this.face.getRank();
		int otherRank = otherCard.face.getRank();

		if (currentRank == otherRank) {
			return CompareCardEnum.EQUAL.getComparisonValue();
		} else if (currentRank > otherRank) {
			return CompareCardEnum.HIGHER.getComparisonValue();
		} else if (currentRank < otherRank) {
			return CompareCardEnum.LOWER.getComparisonValue();
		} else {
			throw new IllegalArgumentException("Illegal Card Comparison!");
		}
	}
}





