package threading;

public class Thread1 extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread:"+i);
		}
	}
	public static void main(String[] a) {
		Thread1 ob= new Thread1();
		ob.start();
		
	}

}
