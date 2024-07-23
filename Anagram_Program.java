package String;

import java.util.Arrays;

public class Anagram_Program {

	public static void main(String[] args) {
		String s1 = "SILENT";
		String s2 = "LISTEN";

		if (s1.length() != s2.length()) {

			System.out.println("not an anagram");
		}
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {

			System.out.println("it is an anagram");
		}
		
		else {
			System.out.println("not anagarm");
		}

	}

}
