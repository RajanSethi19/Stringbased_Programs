package String;

public class Reverse_String2 {

	public static void main(String[] args) {
		String s=" Rajan lives in chadigarh";
		
		String s1[]=s.split(" ");
		String rev1="";
		
		for(String s2:s1) {
			String rev2="";
			for(int i=s2.length()-1;i>=0;i--) {
				
				rev2=rev2+s2.charAt(i);
			}
			rev1=rev1+rev2+" ";
			
			
		}
		
		System.out.println(rev1);
		

	}

}
