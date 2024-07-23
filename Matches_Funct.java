package String;

public class Matches_Funct {

	public static void main(String[] args) {
		String s="Rajan";
		
	boolean b=	s.matches("....."); //check if the string has 5 letters(we used 5 dots)
	System.out.println(b);
	
	boolean b1=s.matches("(.*)n"); // check if the string ends with n 
	System.out.println(b1);
	
	boolean b2=s.matches("R(.*)"); // check if the string starts with R 
	System.out.println(b2);
	
	boolean b3=s.matches("(.*)j(.*)"); // check if the j is present in the string  
	System.out.println(b3);
	
	boolean b4=s.matches(".a(.*)"); // check if the second character is a in a string  
	System.out.println(b4);
	
	boolean b5=s.matches("..j(.*)"); // check if the 3rd character is j in a string 
	System.out.println(b5);
	System.out.println("-----------------------");
	
	String s2="Automation testing";
	boolean b8=s2.matches("(.*)n(.*)");
	

	System.out.println(b8);
	System.out.println("===============");
	String s3= "snatch";
	boolean b9=s3.matches("s....h");
	System.out.println(b9);
	
	

	}

}
