package application;

public class Validator {

	/**
	 * Function to checks if parameter can be parsed to binary
	 * @param input String "0" or "1"
	 * @return true if parameter is parsable to int 0 or 1
	 */
	public static boolean isBinaryDigit(String input) {

		try {
			int result = Integer.parseInt(input);
			return (result == 0 || result == 1);
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
