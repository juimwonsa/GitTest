package star_out;
import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
	public static void main(String[] args) {

		ArrayList<BankAccount> accounts = new ArrayList<>();
		
		int money;
		int choose;
		String name, accName;
		String[] account;
		
		BankAccount currAccount;
		
		while(true) {
			

			Scanner sc = new Scanner(System.in);
			System.out.println("원하는 기능을 입력하세요");
			choose = sc.nextInt();
			
			switch(choose) {
				// 계좌 개설
				case 1:
					System.out.println("정보를 입력해주세요. (계좌번호 이름 잔액)");		
					account = (sc.next()).split(",");
					System.out.println("계좌가 개설되었습니다.");
					accounts.add(new BankAccount(account[0], account[1], Integer.parseInt(account[2])));
					break;
					
				// 검색
				case 2:
					System.out.println("이름을 입력하세요.");
					name = sc.next();
					for(int i = 0 ; i < accounts.size() ; i++) {
						if(accounts.get(i).accountName() == name){
							currAccount = accounts.get(i);
							break;
						}
						System.out.println("일치하는 이름이 없습니다.");
					}
					
				// 입금
				case 3:

					
				// 출금
				case 4:

				//삭제
				case 5:
				
				default:	System.out.println("다시 입력하세요.");	break;
				
			}
		}
	}
}
