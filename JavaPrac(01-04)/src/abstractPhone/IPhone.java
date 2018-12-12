package abstractPhone;

public class IPhone extends Phone {

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("iphone camera : details");

	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("iphone calling feature");

	}

	public void appStore() {
		System.out.println("this is iphone own feature");
	}

}
