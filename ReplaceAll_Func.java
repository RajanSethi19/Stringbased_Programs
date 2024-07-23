package String;

public class ReplaceAll_Func {

	public static void main(String[] args) {
		String s="RajanSethi";
		
		System.out.println(s.replaceAll("a", "")); //replace a with nothing
		System.out.println(s.replaceAll("a", "r")); //replace a with r
		
		String s1="My name is rajan";
		System.out.println(s1.replaceAll(" ", "")); //replace space with nothing
		
		String s3="RajanSetHi";
		System.out.println(s3.replaceAll("[A-Z]", "")); //remove capital letter
		System.out.println(s3.replaceAll("[a-z]", ""));// remove all small letter
		
		String s4="Rajan 1836 Sethi";
		System.out.println(s4.replaceAll("[0-9]", "")); //replace numeric value with nothing
		

	}

}
