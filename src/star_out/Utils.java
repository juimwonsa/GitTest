package star_out;

public class Utils {
	public static boolean compareName(String accountName, String inputName) {
		return accountName.equals(inputName);
	}
	
	//��� �Ǻ�
	public static boolean isPositiveNumber(int money) {
		if(money < 0) {
			System.out.printf(BankMSG.ERR_INPUTDUALNUMBER);
			return false;
		}
		return true;
	}	
	
	//���� �ܾ��� ��ݾ׺��� ū�� �Ǻ�
	public static boolean withDraw(int money,int currMoney) {
		if(currMoney<money) {
			System.out.printf(BankMSG.ERR_LESSDEPOSIT);
			return false;
		}
		return true;
	}
}
