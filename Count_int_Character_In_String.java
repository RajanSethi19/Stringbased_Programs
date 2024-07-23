package String;

public class Count_int_Character_In_String {

	public static void main(String[] args) {
		String s = "I live in chandigarh 18363 @#$%^&";
		int count_digit = 0;
		int count_letter = 0;
		int count_space=0;
		
		char c[] = s.toCharArray();
		System.out.println(c);

		for (int i = 0; i < c.length; i++) {

			boolean b = Character.isDigit(c[i]);

			if (b == true) {

				count_digit++;
			}
			boolean b1=Character.isLetter(c[i]);
			
			if (b1 == true) {

				count_letter++;
			}
			
			boolean b2=Character.isSpaceChar(c[i]);
			if (b2 == true) {

				count_space++;
			}
			

		}
		System.out.println("no of int in string are " + count_digit);
		System.out.println("no of letters in string are " + count_letter);
		System.out.println("no of spaces in string are " + count_space);
		int count_special=s.length()-(count_digit+ count_letter+count_space);
		System.out.println("no of special character in string are " + count_special);
		
		
		
		

	}

}
