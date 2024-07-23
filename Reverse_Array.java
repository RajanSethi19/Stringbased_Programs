package String;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		int a[]= new int[4];
		
		a[0]=23;
		a[1]=45;
		a[2]=34;
		a[3]=77;
		
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}
		Arrays.toString(a);
		
	}

}
