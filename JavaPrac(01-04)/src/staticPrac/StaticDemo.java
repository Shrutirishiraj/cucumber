package staticPrac;

public class StaticDemo {
	int a;
	static int b;
	/*static {
		System.out.println("hi");
		b=10;
	}*/

	public void show() {
		System.out.println(" Value of variables IN:  " + a + "\t Static var" + b);
	}

	static public void add() {
		b = b + 1;
	}

	public static void main(String[] args) {
		StaticDemo s = new StaticDemo();
		s.a = 10;
		//s.b = 20;
		s.show();
		add();
		s.show();
		System.out.println("2nd obj");
		StaticDemo s1 = new StaticDemo();
		s1.a = 20;
	
		StaticDemo.add();
		s1.show();
		System.out.println("3rd obj");
		StaticDemo s11 = new StaticDemo();
		s11.a = 30;
		s11.add();
		s11.show();

	}

}
