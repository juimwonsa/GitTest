package star_out;

public class BankAccount {
	private String bankNum;
	private String name;
	private int money;

	public BankAccount() {
		this.bankNum = "123-456789";
		this.name = "ȫ�浿";
		this.money = 100000000;
	}

	public BankAccount(String bankNum, String name, int money) {
		this.bankNum = bankNum;
		this.name = name;
		this.money = money;
	}

	public void status() {
		System.out.println("����: " + bankNum + "  (������ : " + name + ")");
		System.out.println("�ܾ�: " + money);
	}

	public void receive(int money) {
		this.money += money;
		System.out.println(money + "�� �Ա��մϴ�.");
		System.out.println("�ܾ�: " + this.money);
	}

	public void defray(int money) {
		
		if(money > this.money) {
			System.out.println("�ܾ��� �����մϴ�.")
		}
		
		else {
			this.money -= money;
			System.out.println(money+"�� ����մϴ�.");
			System.out.println("�ܾ�: " + this.money);
		}
	}
}
