package inheritance;

public class Parent {
	public int a;
	private float b;
	protected char c;
	Parent(){
		System.out.println("Parent const");
		a=10;
		b=2.3f;
		c='s';
	}
	public void show()
	{
		System.out.println("Parent : IV\nA:"+a+"\tB:"+b+"\tC:"+c);
	}

	
}
