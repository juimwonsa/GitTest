package game;

public class StartGame {
	public static void main(String[] args) {
		Character kim = new Character("KIM",1);
		kim.showItems();
		kim.removeItem(100000000L);
	}
}
