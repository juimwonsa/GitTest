package star_out;
import java.util.Scanner;


public class Bank {
	public static void main(String[] args) {

		BankAccount ba = new BankAccount("423-33225", "김희훈", 100000);
		
		int choose;
		int money;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("입금 : 1,  출금 :2");
			choose = sc.nextInt();
			
			if(choose == 1) {
				System.out.println("금액을 입력하세요");
				money = sc.nextInt();
				ba.doReceive(money);
			}
			
			else if(choose == 2) {
				System.out.println("금액을 입력하세요");
				money = sc.nextInt();
				ba.doDefray(money);
			}
			
			ba.showStatus();
		}
	}

}
