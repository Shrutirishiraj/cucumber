package exceptDemo;

public class StackTraceDemo {
	void m1() {
		System.out.println("hiiiiiii");
		 int a=10/0;
		 System.out.println("Byeeeee");
	}
	 void m2() {
		 m1();
	 }
	 void m3() {
		 
		 m2();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackTraceDemo ob=new StackTraceDemo();
		ob.m3();

	}

}
