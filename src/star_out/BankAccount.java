package star_out;

import java.text.DecimalFormat;

public class BankAccount {
	private String bankNum;
	private String name;
	private int money;

	DecimalFormat formatter = new DecimalFormat("###,###");
	
	
	public BankAccount() {
		this.bankNum = "123-456789";
		this.name = "홍길동";
		this.money = 100000000;
	}

	public BankAccount(String bankNum, String name, int money) {
		this.bankNum = bankNum;
		this.name = name;
		this.money = money;
	}

	public void status() {
		System.out.println("계좌: " + bankNum + "  (예금주 : " + name + ")");
		System.out.println("잔액: " + money);
	}

	public void receive(int money) {
		this.money += money;
		System.out.println(formatter.format(money) + "원 입금합니다.");
		System.out.println("잔액: " + formatter.format(this.money) + "원");
	}

	public void defray(int money) {
		
		if(money > this.money) {
			System.out.println("잔액이 부족합니다.");
		}
		
		else {
			this.money -= money;
			System.out.println(formatter.format(money) + "원 출금합니다." + "원");
			System.out.println("잔액: " + formatter.format(this.money));
		}
	}
}
