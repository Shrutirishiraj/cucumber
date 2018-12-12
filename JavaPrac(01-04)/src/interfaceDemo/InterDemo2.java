package interfaceDemo;

public interface InterDemo2 extends InterDemo{
	int a = 20;
	public static final float f = 15.25f;
	public static final char a1 = 'z';

	public void show2();//abstract 

	public static void display2() {
		System.out.println("This is a static meth in interface InterDEmo2");
	}

	public default void concret2() {
		System.out.println("This is a default meth in interface InterDEmo2");

}
}
