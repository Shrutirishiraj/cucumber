package exceptDemo;

class MyException extends Exception {
	public MyException() {

		super("Bebo Exception");
		System.out.println("my exception caught");

	}
	public MyException(String s) {

		super(s);
		System.out.println("my exception caught");

	}
}

public class CustomExcept {

	public static void main(String[] args) {

		try {
			System.out.println("In try ....");
			throw new MyException("Bebo Exception");
			//System.out.println("In try ....");
		} catch (MyException e) {
			e.printStackTrace();

			System.out.println("in catch...");
		}

	}

}
