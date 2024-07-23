package String;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_String_Array {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array here");
		int a=sc.nextInt();
		String s[]= new String[a];
		
		s[0]="Rajan";
		s[1]="Sethi";
		s[2]="chadigarh";
		s[3]="chadigarh";
		System.out.println(Arrays.toString(s));
		
		for(int i=s.length-1;i>=0;i--) {
			
			
			
			System.out.println(s[i]);
			
		}
		
		
		
		

	}

}
