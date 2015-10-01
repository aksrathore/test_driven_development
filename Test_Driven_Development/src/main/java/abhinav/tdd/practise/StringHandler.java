package main.java.abhinav.tdd.practise;

/*
 * This class swaps the last two characters of a string.
 * The conditions are :
 * 1. if there is an empty string or null value return empty string e.g., "" -> "" , null -> ""
 * 2. if there is one character in a string return the string e.g., "A" -> "A"
 * 3. for all other strings swap the last two characters e.g., "AB" -> "BA" , "abcd" -> "abdc"
 */
public class StringHandler {

	public String swapLastTwoChar(String string) {
		if (string != null) {
			int length = string.length();
			if (length < 2)
				return string;
			char lastChar = string.charAt(length - 1);
			char secondLastChar = string.charAt(length - 2);
			StringBuilder builder = new StringBuilder(string.substring(0,
					length - 2));
			builder.append(lastChar).append(secondLastChar);

			return builder.toString();
		} else {
			return "";
		}
	}
}
