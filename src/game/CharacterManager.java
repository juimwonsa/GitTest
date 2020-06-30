package game;

public class CharacterManager {
	public static void main(String[] args) {
		Character kim = new Character("kim",1);
		kim.getItem(new Item("itemName","itemType",1,2));
	}
}
