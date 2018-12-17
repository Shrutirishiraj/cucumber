package interDemo;

public interface Inter1 {
	int abcd=1;
	void m();
	
	static void iStatic() {
		System.out.println("This is static method of interface with definition");
	}
	default void iDefault() {
		System.out.println("This is default method of interface1 with definition");
	}
}
