package String;

public class Swap_Two_Strings {

	public static void main(String[] args) {
		String a="Rajan";
		String b="Malhotra";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		
		
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
		
		
	
		
		

	}

}
