package polymorphism;
 class Parent
{
	public void over()
	{
		System.out.println("This is Parent class method");
	}
}

 class Child extends Parent
{
	public void over()
	{
		System.out.println("This is Child class method");
		
	}
}


public class OverriddingPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.over();
		Parent o1=new Parent();
		o1.over();
		
		
		
		Parent ob=new Child();
		ob.over();
		
		
		

	}

}
