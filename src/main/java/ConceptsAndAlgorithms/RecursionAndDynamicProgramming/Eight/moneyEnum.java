package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Eight;

public enum moneyEnum {
	cents(1), nickels(5), dime(10), quarters(25);
	private final int value;

	moneyEnum(int value) {
		this.value = value;
	}

	public int get() {
		return this.value;
	}
}
