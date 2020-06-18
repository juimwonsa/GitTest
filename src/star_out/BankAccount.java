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
			System.out.printf(BankMSG.ERR_INPUTDUALNUMBER);
			return false;
		}
		return true;
	}	
	
	private boolean withDraw(int money) {
		if(this.money<money) {
			System.out.printf(BankMSG.ERR_LESSDEPOSIT);
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
		System.out.printf(BankMSG.MSG_ACCOUNTSTATUS,bankNum,name);
		System.out.printf(BankMSG.MSG_MONEYSTATUS,formatter.format(money));
	}

	//�Ա�
	public void doReceive(int money) {
		if(money < 0) {
			System.out.printf(BankMSG.ERR_INPUTDUALNUMBER);
			return;
		}
		
		this.money += money;
		System.out.printf(BankMSG.MSG_RECEIVEMONEY, formatter.format(money));
		System.out.printf(BankMSG.MSG_MONEYSTATUS, formatter.format(this.money));
	}

	//���
	public void doDefray(int money) {
		if(isPositiveNumber(money)==false) {
			System.out.printf(BankMSG.ERR_INPUTDUALNUMBER);
			return;
		}
		
		if(withDraw(money)==false) {
			System.out.printf(BankMSG.ERR_OVERDEFRAY);
			return;
		}
		
		else {
			this.money -= money;
			System.out.printf(BankMSG.MSG_DEFRAYMONEY, formatter.format(money));
			System.out.printf(BankMSG.MSG_MONEYSTATUS,formatter.format(this.money));
		}
	}
	
	//���� ������ �̸��� ��ȯ��
	public String accountName() {
		return this.name;
	}
	
	
}
