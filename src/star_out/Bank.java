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
			System.out.println("���ϴ� ����� �Է��ϼ���");
			choose = sc.nextInt();
			
			switch(choose) {
				// ���� ����
				case 1:
					System.out.println("������ �Է����ּ���. (���¹�ȣ �̸� �ܾ�)");		
					account = (sc.next()).split(",");
					System.out.println("���°� �����Ǿ����ϴ�.");
					accounts.add(new BankAccount(account[0], account[1], Integer.parseInt(account[2])));
					break;
					
				// �˻�
				case 2:
					System.out.println("�̸��� �Է��ϼ���.");
					name = sc.next();
					for(int i = 0 ; i < accounts.size() ; i++) {
						if(accounts.get(i).accountName() == name){
							currAccount = accounts.get(i);
							break;
						}
						System.out.println("��ġ�ϴ� �̸��� �����ϴ�.");
					}
					
				// �Ա�
				case 3:

					
				// ���
				case 4:

				//����
				case 5:
				
				default:	System.out.println("�ٽ� �Է��ϼ���.");	break;
				
			}
		}
	}
}
