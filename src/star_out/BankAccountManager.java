package star_out;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountManager {
	
	private ArrayList<BankAccount> accounts = new ArrayList<>();
	private int money;
	private int choose;
	private String name;
	private String[] account;
	private BankAccount currAccount = null;
	
	void runBankAccountExample() {

		
		
		while(true) {
			

			Scanner sc = new Scanner(System.in);
			if(currAccount != null) {
				System.out.print("현재 계좌는 "+currAccount.accountName()+"님의 계좌입니다.\n");
			}
			System.out.println("업무를 선택해주세요.");

			choose = sc.nextInt();
			
			switch(choose) {
				// 계좌 개설
				case 1:

					System.out.println("정보를 입력해주세요. (계좌번호 이름 잔액)");		
					account = (sc.next()).split(",");
					if(account.length!=3) System.out.println("잘못된 정보를 입력하였습니다.");
					else {
						System.out.println("계좌가 개설되었습니다.");
						accounts.add(new BankAccount(account[0], account[1], Integer.parseInt(account[2])));
					}
					break;
					
				// 검색
				case 2:
					System.out.println("이름을 입력하세요.");
					name = sc.next();
					for(int i = 0 ; i < accounts.size() ; i++) {
						if(accounts.get(i).accountName().equals(name)){
							currAccount = accounts.get(i);
							break;
						}
						if(i+1 == accounts.size())
							System.out.println("일치하는 이름이 없습니다.");
					}
					break;
					
				// 입금
				case 3:
					System.out.println("입금하실 금액을 입력하세요.");
					money = sc.nextInt();
					currAccount.doReceive(money);
					break;
					
				// 출금
				case 4:
					System.out.println("출금하실 금액을 입력하세요.");
					money = sc.nextInt();
					currAccount.doDefray(money);
					break;
					
				//삭제
				case 5:
					System.out.println("현재 계좌를 삭제하겠습니다.");
					break;
					
				default:	
					System.out.println("다시 입력하세요.");	
					break;
				
			}
		}
	}
	
}
