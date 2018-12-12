package interfaceDemo;

public interface InterDemo {
	int a = 12;
	public static final float f = 5.25f;
	public static final char a1 = 's';

	public void show();//abstract 

	public static void display() {
		System.out.println("This is a static meth in interface InterDEmo");
	}

	public default void concret() {
		System.out.println("This is a default meth in interface InterDEmo");
		
	}
}
