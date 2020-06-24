package io.test.InterviewPreparation;

public class ConervsionString {

	public static void main(String[] args) {
		String str = new String("SprInG");// sPRiNg
		String converted = convert(str);
		System.out.println(converted.toString());
		String convertedCase = changeCase(str);
		System.out.println(convertedCase);

	}

	private static String convert(String str) {
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			String s = String.valueOf(ch);
			if (s.equals("S") || s.equals("I") || s.equals("G")) {
				s = s.toLowerCase();
			}
			if (s.equals("p") || s.equals("r") || s.equals("n")) {
				s = s.toUpperCase();
			}
			sb.append(s);
		}
		return sb.toString();
	}

	// Better approach for generic problems

	private static String changeCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			String k = new String();
			if (ch >= 65 && ch <= 90) {
				char newch = (char) (ch + 32);
				k = String.valueOf(newch);
			} else {
				char newch = (char) (ch - 32);
				k = String.valueOf(newch);
			}
			sb.append(k);
		}
		return sb.toString();

	}

}
