package main.java.abhinav.tdd.practise;

/*
 * This class is for validating password string based on certain conditions.
 * The password must be based on below three pre-conditions :
 * 1. the length must be between 6 and 10
 * 2. there must be atleast one digit
 * 3. there must be atleast one uppercase alphabet
 */
public class PasswordValidator {

	//Maximum password length
	private final int MAX_PASSWROD_LENGTH = 10;
	//Minimum Password Length
	private final int MIN_PASSWROD_LENGTH = 6;
	//Regex for one or more digits in a string
	private final String DIGIT_REGEX = ".*[0-9].*";
	//Regex for one or more alphabets in a string
	private final String UPPERCASE_ALPHA_REGEX = ".*[A-Z].*";

	public boolean isValidLength(final String password) {
		final int len = password.length();
		return len>=MIN_PASSWROD_LENGTH && len<=MAX_PASSWROD_LENGTH;
	}

	public boolean containsDigit(final String password) {
		return password.matches(DIGIT_REGEX);
	}

	public boolean containsUpperCaseAlpha(final String password) {
		return password.matches(UPPERCASE_ALPHA_REGEX);
	}

	public boolean isPasswordValid(final String password) {
		return isValidLength(password) && containsDigit(password) && containsUpperCaseAlpha(password);
	}

}
