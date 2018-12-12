package abstractPhone;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone a=new Phone();
		IPhone ip=new IPhone();
		ip.appStore();// iphone own methods
		ip.calling();// Inherited abstract method
		ip.camera();// Inherited abstract method
		
		Panasonic ps=new Panasonic();
		ps.bluetooth();// Panasonic own methods
		ps.calling();// Inherited abstract method
		ps.camera();// Inherited abstract method

	}

}
