package star_out;

public class Bank {	
	public static void main(String args[]){	
		BankAccountManager bankAccountManager = new BankAccountManager();
		
		while(true) {
			switch(choiceTask.valueOf(bankAccountManager.choiceTask())) {
				// ���� ����
				case ����:
					bankAccountManager.mkDeposit();
					break;
					
				// �˻�
				case �˻�:
					bankAccountManager.searchAccount();
					break;
					
				// �Ա�
				case �Ա�:
					bankAccountManager.receiveMoney();
					break;
					
				// ���
				case ���:
					bankAccountManager.defrayMoney();
					break;
					
				//����
				case ����:
					bankAccountManager.deleteAccount();
					break;
					
				default:	
					bankAccountManager.tryAgain();
					break;
			}
		}
	}
}
