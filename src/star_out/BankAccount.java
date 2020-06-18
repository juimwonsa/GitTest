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
	
	//계좌의 기본 생성자
	public BankAccount() {
		this.bankNum = "123-456789";
		this.name = "홍길동";
		this.money = 100000000;
	}
	
	//계좌의 생성자
	public BankAccount(String bankNum, String name, int money) {
		this.bankNum = bankNum;
		this.name = name;
		this.money = money;
	}

	//현재 계좌의 이름, 잔액 등 상태를 나타냄
	public void showStatus() {
		System.out.printf(BankMSG.MSG_ACCOUNTSTATUS,bankNum,name);
		System.out.printf(BankMSG.MSG_MONEYSTATUS,formatter.format(money));
	}

	//입금
	public void doReceive(int money) {
		if(money < 0) {
			System.out.printf(BankMSG.ERR_INPUTDUALNUMBER);
			return;
		}
		
		this.money += money;
		System.out.printf(BankMSG.MSG_RECEIVEMONEY, formatter.format(money));
		System.out.printf(BankMSG.MSG_MONEYSTATUS, formatter.format(this.money));
	}

	//출금
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
	
	//현재 계좌의 이름을 반환함
	public String accountName() {
		return this.name;
	}
	
	
}
