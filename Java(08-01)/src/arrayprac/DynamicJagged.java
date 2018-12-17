package arrayprac;

import java.util.Scanner;

public class DynamicJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		
		Scanner s = new Scanner(System.in);
		System.out.println(" Please enter the no of rows : ");
		int row = s.nextInt();
		
		
		int[][] arrayJag = new int[row][];
		
		
		for (int r = 0; r < row; r++) {
			System.out.println(" Please enter the no of col in row : " + r);
			int col = s.nextInt();
			arrayJag[r] = new int[col];
		}

		
		System.out.println("values are  : ");
		

		for (int r = 0; r < arrayJag.length; r++) {
			
			for (int c = 0; c < arrayJag[r].length; c++) {
				
				arrayJag[r][c] = count++;
				System.out.print(arrayJag[r][c] + " ");
				
			}
			
			System.out.println();
		}

	}

}
