package star_out;

public class Bank {	
	public static void main(String args[]){	
		BankAccountManager bankAccountManager = new BankAccountManager();
		
		while(true) {
			switch(choiceTask.valueOf(bankAccountManager.choiceTask())) {
				// 계좌 개설
				case 개설:
					bankAccountManager.mkDeposit();
					break;
					
				// 검색
				case 검색:
					bankAccountManager.searchAccount();
					break;
					
				// 입금
				case 입금:
					bankAccountManager.receiveMoney();
					break;
					
				// 출금
				case 출금:
					bankAccountManager.defrayMoney();
					break;
					
				//삭제
				case 삭제:
					bankAccountManager.deleteAccount();
					break;
					
				default:	
					bankAccountManager.tryAgain();
					break;
			}
		}
	}
}
