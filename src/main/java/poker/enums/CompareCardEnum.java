package poker.enums;

public enum CompareCardEnum {
	LOWER(-1),
	EQUAL(0),
	HIGHER(1);

	private int comparisonValue;

	private CompareCardEnum(int value) {
		this.comparisonValue = value;
	}

	public int getComparisonValue() {
		return this.comparisonValue;
	}

	@Override
	public String toString() {
		return this.name().toLowerCase().substring(0, 1).toUpperCase() + this.name().substring(1);
	}

}





