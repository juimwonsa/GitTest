package star_out;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountManager {	
	private Scanner sc = new Scanner(System.in);
	private String[] name;
	private String name1;
	ArrayList<BankAccount> accounts = new ArrayList<>();
	
	public String choiceTask() {
		//if(currAccount != null) {
		//	System.out.printf(BankMSG.MSG_CURRACCOUNT,currAccount.accountName());
		//}
		System.out.printf(BankMSG.MSG_CHOICETASK);
		return sc.nextLine();
	}
	
	//개설
	public ArrayList<BankAccount> mkDeposit(ArrayList<BankAccount> accounts) {
		System.out.printf(BankMSG.MSG_TYPEINFO);		
		name = (sc.nextLine()).split(",");
		if(name.length!=3) {
			System.out.printf(BankMSG.ERR_WRONGINFO);
			return null;
		}
		else {
			System.out.printf(BankMSG.MSG_MKACCOUNT);
			accounts.add(new BankAccount(name[0], name[1], Integer.parseInt(name[2])));
			return accounts;
		}
	}
	
	//검색
	public BankAccount searchAccount(ArrayList<BankAccount> accounts) {
		System.out.printf(BankMSG.MSG_INPUTNAME);
		name1 = sc.next();
		for(int i = 0 ; i < accounts.size() ; i++) {
			if(accounts.get(i).accountName().equals(name1)){
				return accounts.get(i);				
			}
			if(i+1 == accounts.size())
				System.out.printf(BankMSG.ERR_CANTFINDNAME);
		}
		return null;
	}
	
	//입금
	public BankAccount receiveMoney(BankAccount currAccount) {
		if(currAccount == null) {
			System.out.printf(BankMSG.ERR_CHOICEACCOUNT);
			return null;
		}
		
		System.out.printf(BankMSG.MSG_RECEIVEDEPOSIT);
		int money = sc.nextInt();
		currAccount.doReceive(money);
		return currAccount;
	}
	
	//출금
	public BankAccount defrayMoney(BankAccount currAccount) {
		if(currAccount == null) {
			System.out.printf(BankMSG.ERR_CHOICEACCOUNT);
			return null;
		}
		
		System.out.printf(BankMSG.MSG_RECEIVEDEPOSIT);
		int money = sc.nextInt();
		currAccount.doReceive(money);
		return currAccount;
	}
	
	//삭제
	public ArrayList<BankAccount> deleteAccount(BankAccount currAccount, ArrayList<BankAccount> accounts) {
		if(currAccount == null) {
			System.out.printf(BankMSG.ERR_CHOICEACCOUNT);
			return null;
		}
		
		accounts.remove(currAccount);
		System.out.printf(BankMSG.MSG_DELETEACCOUNT);
		currAccount = null;
		return accounts;
	}
	
	public void tryAgain() {
		System.out.printf(BankMSG.ERR_TRYAGAIN);
	}
}
