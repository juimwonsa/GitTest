package star_out;
import java.util.Scanner;
import java.text.DecimalFormat;

public class BankAccount {
	private String bankNum;
	private String name;
	private int money;

	DecimalFormat formatter = new DecimalFormat("###,###");
	
	private boolean isPositiveNumber(int money) {
		if(money < 0) {
			System.out.println("����� �Է��ϼ���.");
			return false;
		}
		return true;
	}	
	
	private boolean withDraw(int money) {
		if(this.money<money) {
			System.out.println("�ܾ��� �����մϴ�.");
			return false;
		}
		return true;
	}
	
	
	//������ �⺻ ������
	public BankAccount() {
		this.bankNum = "123-456789";
		this.name = "ȫ�浿";
		this.money = 100000000;
	}
	//������ ������
	public BankAccount(String bankNum, String name, int money) {
		this.bankNum = bankNum;
		this.name = name;
		this.money = money;
	}

	//���� ������ �̸�, �ܾ� �� ���¸� ��Ÿ��
	public void showStatus() {
		System.out.println("����: " + bankNum + "  (������ : " + name + ")");
		System.out.println("�ܾ�: " + formatter.format(money) + "��");
	}

	//�Ա�
	public void doReceive(int money) {
		if(money < 0) {
			System.out.println("����� �Է��ϼ���.");
			return;
		}
		
		this.money += money;
		System.out.println(formatter.format(money) + "�� �Ա��մϴ�.");
		System.out.println("�ܾ�: " + formatter.format(this.money) + "��");
	}

	//���
	public void doDefray(int money) {
		if(isPositiveNumber(money)==false) {
			System.out.println("����� �Է��ϼ���.");
			return;
		}
		
		if(withDraw(money)==false) {
			System.out.println("����Ϸ��� �ݾ��� ���� �ܾ׺��� �����ϴ�.");
			return;
		}
		
		else {
			this.money -= money;
			System.out.println(formatter.format(money) + "�� ����մϴ�." + "��");
			System.out.println("�ܾ�: " + formatter.format(this.money));
		}
	}
	
	//���� ������ �̸��� ��ȯ��
	public String accountName() {
		return this.name;
	}
	
	
}
