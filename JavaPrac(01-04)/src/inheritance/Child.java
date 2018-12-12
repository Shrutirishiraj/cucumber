package inheritance;

public class Child extends Parent{
	int roll;
	String name;
	Child(){
		System.out.println(" This is child constructor");
		roll=123;
		name="abc";
		
	}
	public void display(){
		System.out.println(" Child : \nRoll no :\t"+roll+"\nName :\t"+name);
		System.out.println("Parent class iv:\t"+a+"\t"+c);
		
	}

}
