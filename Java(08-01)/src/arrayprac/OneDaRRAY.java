package arrayprac;

public class OneDaRRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {100,200,300,400};
		
		
		System.out.println("value of array a at index 2 is :"+a[2]);
		System.out.println("size of array is"+a.length);
		
		
		
		float[] b,v[],f;
		
		
		b=new float[3];
		
		b[0]=3.1f;
		b[1]=2.5f;
		b[2]=3.6f;
		//b[3]=5.9f;
		System.out.println("size of array is :"+b.length);
		System.out.println("value out of bound"+b[2]);
		

	}

}
