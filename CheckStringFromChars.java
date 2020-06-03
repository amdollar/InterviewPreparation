package io.test.InterviewPreparation;

import java.util.HashMap;
import java.util.Map;

/**
 * Check whether the second String can be formed using characters of First
 * String.
 * 
 */
public class CheckStringFromChars {

	public static void main(String[] args) {
		String stringOne = new String("anuagawasthi");
		String stringSecond = new String("this");

		String result = canBeFormed(stringOne, stringSecond);
		System.out.println(result);
	}

	private static String canBeFormed(String stringOne, String stringSecond) {
		if (stringOne.length() < stringSecond.length())
			return "NO";
		Map<Character, Integer> datamap = new HashMap<Character, Integer>();

		for (char c : stringOne.toCharArray()) {
			datamap.put(c, datamap.getOrDefault(c, 0) + 1);
		}

		for (char c : stringSecond.toCharArray()) {
			if (datamap.containsKey(c)) {
				int fre = datamap.get(c);
				datamap.put(c, --fre);
				if (fre < 0)
					return "NO";
			} else {
				return "NO";
			}
		}

		return "YES";
	}

}
