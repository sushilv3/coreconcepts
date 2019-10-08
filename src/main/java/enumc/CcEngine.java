package enumc;

public enum CcEngine {
	A(110), B(150), C(180);
	private final int value;

	CcEngine(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}
}
