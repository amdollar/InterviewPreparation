package io.test.InterviewPreparation;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

	public static void main(String[] args) {
		String s = new String("abcabcbb");
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		int result = 0;
		int finalres = 0;
		int strLen = s.length();
		Set<Character> chars = new HashSet<Character>();

		for (int j = 0; j < strLen; j++) {
			for (int i = j; i < strLen; i++) {
				boolean added = chars.add(s.charAt(i));
				if (added != true) {
					chars.clear();
					result = 0;
					break;
				} else {
					++result;
					if (result > finalres) {
						finalres = result;
					}
					continue;
				}
			}
		}
		return finalres;
	}
}
