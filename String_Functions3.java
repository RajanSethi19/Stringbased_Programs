package String;

import java.util.Arrays;

public class String_Functions3 {

	public static void main(String[] args) {
		//equalIgnorecase
		String s="RAJAN";
		System.out.println(s.equalsIgnoreCase("rajan"));
		//isEmpty
		String s1="";
		System.out.println(s1.isEmpty());
		//EndsWith
		System.out.println(s.endsWith("N"));
		//Split
		String s2="MY NAME IS RAJAN";
		String s3[]=s2.split(" ");
		String s4[]=s2.split(" ",2);
		System.out.println(Arrays.toString(s3));
		System.out.println(Arrays.toString(s4));
		
		//repeat
		
		String s5="Rajan";
		System.out.println(s5.repeat(5));

	}

}
