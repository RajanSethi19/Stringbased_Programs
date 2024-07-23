package String;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string value here");
		String s=sc.next();
		//String s = "I love India";
		String s1 = s.toLowerCase();
		String rev = "";

		for (int i = s1.length() - 1; i >= 0; i--) {

			rev = rev + s1.charAt(i);

		}
		System.out.println(rev);

		if (s1.equals(rev)) {
			System.out.println("it is palindrom");
		} else {
			System.out.println("not palindrom");
		}

	}

}
