package polymorphism;
class OverP{
	public void show()
	{
		System.out.println("Parent Class :This is method with no arg");
	}
	public void show(int a)
	{
		System.out.println("Parent : This is method with 1 int agr"+a);
	} 
	
}

public class OverloadedClass extends OverP {
	public char show(char a)
	{
		System.out.println("Child : This is method with 1 double arg"+a);
		return a;
	}
	public void show(double a)
	{
		System.out.println("Child : This is method with 1 double arg"+a);
		
	}
	public void show() {
		//super.show();//super keyword use
		System.out.println("Child class :This is method with no arg ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedClass o=new OverloadedClass();
		o.show();
		o.show(10);
		o.show(10.25);
		o.show(5.2f);//type conversion
		System.out.println(o.show('s'));
				

	}

}
