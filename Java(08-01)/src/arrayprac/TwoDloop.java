package arrayprac;

public class TwoDloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, c;
		int[][] a = new int[][] { { 2, 3, 4 }, { 4, 5, 6 } };

		for (r = 0; r < a.length; r++) {
			for (c = 0; c < a[0].length; c++) {
				System.out.print(a[r][c] + "\t");
			}
			System.out.println();
		}

	}

}
