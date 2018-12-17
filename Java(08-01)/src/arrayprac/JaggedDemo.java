package arrayprac;

public class JaggedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] jArray = new int[][] { { 1, 2, 3, 4 }, { 1, 2 }, { 2, 3, 4, 5, 6, 7 }, { 1 }, { 9, 10 } };

		for (int r = 0; r < jArray.length; r++) {
			for (int c = 0; c < jArray[r].length; c++) {
				System.out.print(jArray[r][c] + " ");
			}
			System.out.println();
		}
		

	}

}
