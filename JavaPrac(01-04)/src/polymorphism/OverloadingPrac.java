package polymorphism;

public class OverloadingPrac {
	public void show()
	{
		System.out.println("This is method with no arg");
	}
	public void show(int a)
	{
		System.out.println("This is method with 1 int agr"+a);
	}
	public void show(double a)
	{
		System.out.println("This is method with 1 double arg"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingPrac o=new OverloadingPrac();
		o.show();
		o.show(100);
		o.show(3.52);

	}

}
