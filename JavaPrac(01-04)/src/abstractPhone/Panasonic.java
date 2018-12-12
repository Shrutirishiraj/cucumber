package abstractPhone;

public class Panasonic extends Phone {

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println(" this is panasonics camera : details");

	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("this is panasonics calling feature");

	}

	public void bluetooth() {
		System.out.println("this is panasonics own feature");
	}
}
