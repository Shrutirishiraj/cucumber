package basic;

import java.util.Scanner;

public class Student {
	int regID;
	String name="abbb";
	float marks;
	public void add() {
		Scanner sc= new Scanner(System.in);
				
		System.out.println("Please enter regID: ");
		regID=sc.nextInt();
		System.out.println("Please enter name: ");
		this.name=sc.next();
		//sc.next();
		System.out.println("Please enter marks");
		marks=sc.nextFloat();
	}
	
	public void show()
	{
		System.out.println("RegID is : "+regID+" student name is : "+name+"maRKS : "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob=new Student();
		ob.add();
		ob.show();

	}

}
