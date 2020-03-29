package validation;

public class AtmValidation {

	private static final String amountPattern="[0-9]+";

	//private static final String typePattern="";

	private static final String pinPattern="[0-9]+";

	

	public static boolean validateAmount(int amount) {

		return Integer.toString(amount).matches(amountPattern);

	}

	public static boolean validateType(String type) {

		return( type.equals("credit")||type.equals("debit"));

	}

	

	public static boolean validatePin(int pin) {

		return Integer.toString(pin).matches(pinPattern);

	}

}