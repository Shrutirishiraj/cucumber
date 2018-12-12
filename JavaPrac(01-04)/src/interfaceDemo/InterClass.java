package interfaceDemo;

public class InterClass implements InterDemo, InterDemo2 {

	public void show2() {
		System.out.println("value of variables of interDemo are :" + InterDemo2.a + InterDemo2.f + InterDemo2.a1);

	}

	@Override
	public void show() {
		System.out.println("value of variables of interDemo are :" + InterDemo.a + InterDemo.f + InterDemo.a1);

	}

	public static void main(String[] args) {
		InterClass i = new InterClass();
		i.concret();
		i.concret2();
		i.show();
		i.show2();
		
		// InterClass.display();
		InterDemo id = new InterClass();
		id.concret();
		//id.concret2();
		id.show();
		// id.show2();
		InterDemo.display();
		InterDemo2 id2 = new InterClass();
		id2.concret();
		id2.concret2();
		id2.show();
		id2.show2();
		InterDemo2.display2();

	}

}
