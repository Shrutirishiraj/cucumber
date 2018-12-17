package arrayprac;

import java.util.Scanner;

public class OneDarrayUserSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		
		System.out.println("Please enter size of array");
		int size=o.nextInt();
		int[] a = new int[size];
		int i;
		
		System.out.println("please enter the values in the array");
		for (i = 0; i < a.length; i++)
		{
			System.out.println("please enter value at index : "+i);
		a[i] = o.nextInt();
		}
		
	

		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}

	}

}
