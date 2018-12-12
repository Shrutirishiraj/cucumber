package encapsulation;

public class EncapDemo {
	private int accountNo;
	public float bal;

	public void setter(int a, float bal) {
		this.accountNo = a;
		this.bal = bal;
	}

	public void getter() {
System.out.println("Account details :\nAccount Number : \t" + accountNo + "\nName :\t" + this.bal);

	}

}
