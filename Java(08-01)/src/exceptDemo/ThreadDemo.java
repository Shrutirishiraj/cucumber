package exceptDemo;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.out.println("hiiiiii");
		Thread.sleep(2000);
		ArithmeticException ob=new ArithmeticException();
		throw ob;
		//System.out.println("byeeeeeee");
	}

}
