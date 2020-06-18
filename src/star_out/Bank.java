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
				// ���� ����
				case ����:
					accounts = bankAccountManager.mkDeposit(accounts);
					break;
					
				// �˻�
				case �˻�:
					currAccount = bankAccountManager.searchAccount(accounts);
					break;
					
				// �Ա�
				case �Ա�:
					currAccount = bankAccountManager.receiveMoney(currAccount);
					break;
					
				// ���
				case ���:
					currAccount = bankAccountManager.defrayMoney(currAccount);
					break;
					
				//����
				case ����:
					accounts = bankAccountManager.deleteAccount(currAccount, accounts);
					break;
					
				default:	
					bankAccountManager.tryAgain();
					break;
			}
		}
	}
}
