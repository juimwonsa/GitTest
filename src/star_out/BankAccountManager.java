package star_out;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountManager {	
	public static void main(String args[]){	
		ArrayList<BankAccount> accounts = new ArrayList<>();
		int money;
		String choose;
		String name;
		String[] account;
		BankAccount currAccount = null;
			
		while(true) {
			Scanner sc = new Scanner(System.in);
			if(currAccount != null) {
				System.out.print("���� ���´� "+currAccount.accountName()+"���� �����Դϴ�.\n");
			}

			System.out.println("������ �������ּ���.");
			choose = sc.nextLine();
			
			switch(choiceNum.valueOf(choose)) {
				// ���� ����
				case ����:
					System.out.println("������ �Է����ּ���. (���¹�ȣ,�̸�,�ܾ�)");		
					account = (sc.next()).split(",");
					if(account.length!=3) System.out.println("�߸��� ������ �Է��Ͽ����ϴ�.");
					else {
						System.out.println("���°� �����Ǿ����ϴ�.");
						accounts.add(new BankAccount(account[0], account[1], Integer.parseInt(account[2])));
					}
					break;
					
				// �˻�
				case �˻�:
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
				case �Ա�:
					if(currAccount == null) {
						System.out.println("���¸� ���� �������ּ���.");
						break;
					}
					
					System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���.");
					money = sc.nextInt();
					currAccount.doReceive(money);
					break;
					
				// ���
				case ���:
					if(currAccount == null) {
						System.out.println("���¸� ���� �������ּ���.");
						break;
					}
					
					System.out.println("����Ͻ� �ݾ��� �Է��ϼ���.");
					money = sc.nextInt();
					currAccount.doDefray(money);
					break;
					
				//����
				case ����:
					System.out.println("���� ���¸� �����ϰڽ��ϴ�.");
					break;
					
				default:	
					System.out.println("�ٽ� �Է��ϼ���.");	
					break;
			}
		}
	}
}
