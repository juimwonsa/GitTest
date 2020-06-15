package star_out;

import java.text.DecimalFormat;

public class BankAccount {
	private String bankNum;
	private String name;
	private int money;

	DecimalFormat formatter = new DecimalFormat("###,###");
	
	
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

	public void showStatus() {
		System.out.println("����: " + bankNum + "  (������ : " + name + ")");
		System.out.println("�ܾ�: " + formatter.format(money) + "��");
	}

	public void doReceive(int money) {
		if(money < 0) {
			System.out.println("����� �Է��ϼ���.");
			return;
		}
		
		this.money += money;
		System.out.println(formatter.format(money) + "�� �Ա��մϴ�.");
		System.out.println("�ܾ�: " + formatter.format(this.money) + "��");
	}

	public void doDefray(int money) {
		if(money < 0) {
			System.out.println("����� �Է��ϼ���.");
			return;
		}
		
		if(money > this.money) {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
		else {
			this.money -= money;
			System.out.println(formatter.format(money) + "�� ����մϴ�." + "��");
			System.out.println("�ܾ�: " + formatter.format(this.money));
		}
	}
}
