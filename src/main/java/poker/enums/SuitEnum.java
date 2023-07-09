package poker.enums;

public enum SuitEnum {
	HEARTS("Red", "♥"),
	DIMONDS("Red", "♦"),
	SPADES("Black", "♠"),
	CLUBS("Black", "♣");

	private String suitColor;
	private String suitImage;

	private SuitEnum(String suitColor, String suitImage) {
		this.suitColor = suitColor;
		this.suitImage = suitImage;
	}

	public String getName() {
		return this.name();
	}

	public String getSuitColor() {
		return suitColor;
	}

	public String getSuitImage() {
		return suitImage;
	}

	@Override
	public String toString() {
		return this.getSuitImage();
	}

}





