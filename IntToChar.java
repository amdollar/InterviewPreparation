package io.test.InterviewPreparation;

public class IntToChar {

	public static void main(String[] args) {

		String str = new String("a5k3b4");// afknbf
		System.out.println(opr(str));
	}

	private static String opr(String str) {
		StringBuilder result = new StringBuilder("");
		char[] chars = str.toCharArray();
		for (int i = 0; i < str.length() - 1; i++) {
			int aci = chars[i];
			char current = (char) aci;
			if (i % 2 == 0) {
				String cha = String.valueOf(chars[i + 1]);
				int nu = Integer.valueOf(cha);
				int nextasci = aci + nu;
				char nextch = (char) nextasci;
				result.append(current).append(nextch);
			}

		}
		return result.toString();
	}

}
