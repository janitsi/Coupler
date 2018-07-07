package application;

public class Validator {

	/**
	 * Function to checks if parameter can be parsed to binary
	 * @param input String
	 * @return true if parameter is "0" or "1"
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
