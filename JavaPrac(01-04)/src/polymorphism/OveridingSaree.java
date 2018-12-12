package polymorphism;
 class Mother{
	 public void saree(int a) {
		System.out.println("this is original saree"+a);
	}
	
}
class Daughter extends Mother{
	public void saree(int b) {
		System.out.println("this is the orridden (custmized saaree)"+b);
	}
	
	
}
public class OveridingSaree {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.saree(10);
		
		
		Mother m= new Mother();
		m.saree(25);
		
	}

}
