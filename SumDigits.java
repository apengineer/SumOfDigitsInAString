package strings;

import java.util.ArrayList;
import java.util.List;

public class SumDigits {

	/**
	 * Given a string, return the sum of the digits 0-9 that appear in the string, 
	 * ignoring all other characters. Return 0 if there are no digits in the string. 
	 * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
	 */
	public static void main(String[] args) {
		String s = "Chocolate";
		
		char chars [] = s.toCharArray();
		int index = 0; int sum = 0;
		for (char c : chars) {
			if(Character.isDigit(c)){
				sum += Character.getNumericValue(c);
			}
		}

		System.out.println(sum);
	
	}

}
