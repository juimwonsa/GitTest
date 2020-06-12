package star_out;

public class Bank {
	public static void main(String[] args) {

		BankAccount ba = new BankAccount("423-33225", "±èÈñÈÆ", 100000);

		ba.status();

		ba.receive(10000);
		ba.defray(20000);

		ba.status();

	}

}
