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
			System.out.println("양수를 입력하세요.");
			return false;
		}
		return true;
	}	
	
	private boolean withDraw(int money) {
		if(this.money<money) {
			System.out.println("잔액이 부족합니다.");
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
		System.out.println("계좌: " + bankNum + "  (예금주 : " + name + ")");
		System.out.println("잔액: " + formatter.format(money) + "원");
	}

	//입금
	public void doReceive(int money) {
		if(money < 0) {
			System.out.println("양수를 입력하세요.");
			return;
		}
		
		this.money += money;
		System.out.println(formatter.format(money) + "원 입금합니다.");
		System.out.println("잔액: " + formatter.format(this.money) + "원");
	}

	//출금
	public void doDefray(int money) {
		if(isPositiveNumber(money)==false) {
			System.out.println("양수를 입력하세요.");
			return;
		}
		
		if(withDraw(money)==false) {
			System.out.println("출금하려는 금액이 현재 잔액보다 많습니다.");
			return;
		}
		
		else {
			this.money -= money;
			System.out.println(formatter.format(money) + "원 출금합니다." + "원");
			System.out.println("잔액: " + formatter.format(this.money));
		}
	}
	
	//현재 계좌의 이름을 반환함
	public String accountName() {
		return this.name;
	}
	
	
}
