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
				System.out.print("���� ���´� "+currAccount.accountName()+"���� �����Դϴ�.\n");
			}
			System.out.println("������ �������ּ���.");

			choose = sc.nextInt();
			
			switch(choose) {
				// ���� ����
				case 1:

					System.out.println("������ �Է����ּ���. (���¹�ȣ �̸� �ܾ�)");		
					account = (sc.next()).split(",");
					if(account.length!=3) System.out.println("�߸��� ������ �Է��Ͽ����ϴ�.");
					else {
						System.out.println("���°� �����Ǿ����ϴ�.");
						accounts.add(new BankAccount(account[0], account[1], Integer.parseInt(account[2])));
					}
					break;
					
				// �˻�
				case 2:
					System.out.println("�̸��� �Է��ϼ���.");
					name = sc.next();
					for(int i = 0 ; i < accounts.size() ; i++) {
						if(accounts.get(i).accountName().equals(name)){
							currAccount = accounts.get(i);
							break;
						}
						if(i+1 == accounts.size())
							System.out.println("��ġ�ϴ� �̸��� �����ϴ�.");
					}
					break;
					
				// �Ա�
				case 3:
					System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���.");
					money = sc.nextInt();
					currAccount.doReceive(money);
					break;
					
				// ���
				case 4:
					System.out.println("����Ͻ� �ݾ��� �Է��ϼ���.");
					money = sc.nextInt();
					currAccount.doDefray(money);
					break;
					
				//����
				case 5:
					System.out.println("���� ���¸� �����ϰڽ��ϴ�.");
					break;
					
				default:	
					System.out.println("�ٽ� �Է��ϼ���.");	
					break;
				
			}
		}
	}
	
}
