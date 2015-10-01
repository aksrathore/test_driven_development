package main.java.abhinav.tdd.practise;

public class RomanToArabic {

	private static enum RomanNumbers {
		I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

		private int value;
		private RomanNumbers(int value) {
			this.value = value;
		}
		public int getValue() {
			return this.value;
		}
	};

	// Regex Pattern for validating a Roman Number
	private static String romanNumberRegex = "^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

	private static boolean romanNValidator(String number) {
		if (number.matches(romanNumberRegex))
			return true;
		else
			return false;
	}

	private static int getArabicValue(char romanChar) {
		int numericalValue = 0;

		switch (romanChar) {
		case 'I':
			numericalValue = RomanNumbers.I.getValue();
			break;
		case 'V':
			numericalValue = RomanNumbers.V.getValue();
			break;
		case 'X':
			numericalValue = RomanNumbers.X.getValue();
			break;
		case 'L':
			numericalValue = RomanNumbers.L.getValue();
			break;
		case 'C':
			numericalValue = RomanNumbers.C.getValue();
			break;
		case 'D':
			numericalValue = RomanNumbers.D.getValue();
			break;
		case 'M':
			numericalValue = RomanNumbers.M.getValue();
			break;
		}
		return numericalValue;
	}

	public String convertRomanToArabic(String romanNumber) {

		if (romanNValidator(romanNumber) == true) {
			char[] romanChar = romanNumber.toCharArray();
			int prevNumber = 0;
			int arabicN = 0;
			int currentNumber = 0;
			for (int i = (romanChar.length - 1); i >= 0; i--) {
				currentNumber = getArabicValue(romanChar[i]);
				if (prevNumber > currentNumber)
					arabicN = arabicN - currentNumber;
				else
					arabicN = arabicN + currentNumber;
				prevNumber = currentNumber;
			}
			return String.valueOf(arabicN);
		} else
			return "Invalid Roman Number";

	}

}
