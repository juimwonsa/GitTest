package star_out;

import java.util.ArrayList;


public class Bank {	
	public static void main(String args[]){	
		String choose;
		BankAccount currAccount = null;
		ArrayList<BankAccount> accounts = new ArrayList<>();
		BankAccountManager bankAccountManager = new BankAccountManager();
		
		
		while(true) {
			
			choose = bankAccountManager.choiceTask();
			switch(choiceNum.valueOf(choose)) {
				// 계좌 개설
				case 개설:
					accounts = bankAccountManager.mkDeposit(accounts);
					break;
					
				// 검색
				case 검색:
					currAccount = bankAccountManager.searchAccount(accounts);
					break;
					
				// 입금
				case 입금:
					currAccount = bankAccountManager.receiveMoney(currAccount);
					break;
					
				// 출금
				case 출금:
					currAccount = bankAccountManager.defrayMoney(currAccount);
					break;
					
				//삭제
				case 삭제:
					accounts = bankAccountManager.deleteAccount(currAccount, accounts);
					break;
					
				default:	
					bankAccountManager.tryAgain();
					break;
			}
		}
	}
}
