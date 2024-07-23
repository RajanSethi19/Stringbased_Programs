package String;

public class Practice1 {

	public static void main(String[] args) {
		String s="I love india";
		String s1[]=s.split(" ");
		String rev="";
		for(String s2:s1) {
			
			String revw="";
			for(int i=s2.length()-1;i>=0;i--) {
				
				rev=rev+s2.charAt(i);
			}
			revw=revw+rev+" ";
			System.out.println(revw);
		}
		
		
	
	}

}
