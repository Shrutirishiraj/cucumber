package encap;

public class Demo {
	
	
	public int a;
	
	private int b;
	private int name;
	
	public void m1() {
		this.b=222;
		
		System.out.println(" This is public method of demo class");
		m2();
		System.out.println("Value of public a : "+a);
		System.out.println("Value of private b : "+b);
		
	}
	private void m2() {
		this.b=333;
		System.out.println(" This is private method of demo class");
		
		System.out.println("Value of public a : "+a);
		System.out.println("Value of private b : "+b);
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	

	

}
