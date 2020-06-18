package star_out;

import java.util.ArrayList;
import java.util.Scanner;

class Init{
	private Scanner sc = new Scanner(System.in);
	private String[] name;
	private String name1;
	private BankAccount currAccount = null;
	private ArrayList<BankAccount> accounts = new ArrayList<>();
	
	
	
	

}

public class BankAccountManager {	
	private Scanner sc = new Scanner(System.in);
	private String[] name;
	private String name1;
	private BankAccount currAccount = null;
	private ArrayList<BankAccount> accounts = new ArrayList<>();

	
	public String choiceTask() {
		if(currAccount != null) {
			System.out.printf(BankMSG.MSG_CURRACCOUNT, currAccount.accountName());
		}
		System.out.printf(BankMSG.MSG_CHOICETASK);
		return sc.nextLine();
	}
	
	//개설
	public void mkDeposit() {
		System.out.printf(BankMSG.MSG_TYPEINFO);		
		name = (sc.nextLine()).split(",");
		if(name.length!=3) {
			System.out.printf(BankMSG.ERR_WRONGINFO);
			return;
		}
		else {
			System.out.printf(BankMSG.MSG_MKACCOUNT);
			accounts.add(new BankAccount(name[0], name[1], Integer.parseInt(name[2])));
		}
	}
	
	//검색
	public void searchAccount() {
		System.out.printf(BankMSG.MSG_INPUTNAME);
		name1 = sc.nextLine();
		for(int i = 0 ; i < accounts.size() ; i++) {
			if(accounts.get(i).accountName().equals(name1)){
				currAccount = accounts.get(i);
				return;
			}
			if(i+1 == accounts.size())
				System.out.printf(BankMSG.ERR_CANTFINDNAME);
		}
	}
	
	//입금
	public void receiveMoney() {
		if(currAccount == null) {
			System.out.printf(BankMSG.ERR_CHOICEACCOUNT);
			return;
		}
		
		System.out.printf(BankMSG.MSG_RECEIVEDEPOSIT);
		int money = sc.nextInt();
		sc.nextLine();
		
		currAccount.doReceive(money);
		return;
	}
	
	//출금
	public void defrayMoney() {
		if(currAccount == null) {
			System.out.printf(BankMSG.ERR_CHOICEACCOUNT);
			return;
		}
		
		System.out.printf(BankMSG.MSG_RECEIVEDEPOSIT);
		int money = sc.nextInt();
		sc.nextLine();
		currAccount.doReceive(money);
		return;
	}
	
	//삭제
	public void deleteAccount() {
		if(currAccount == null) {
			System.out.printf(BankMSG.ERR_CHOICEACCOUNT);
			return;
		}
		
		accounts.remove(currAccount);
		System.out.printf(BankMSG.MSG_DELETEACCOUNT);
		currAccount = null;
		return;
	}
	
	public void tryAgain() {
		System.out.printf(BankMSG.ERR_TRYAGAIN);
	}
}
