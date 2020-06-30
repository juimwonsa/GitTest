package game;

public class Item {
	private String itemName;
	private String itemType;
	private int requiredLevel;
	private int itemID;
	private long guid;
	
	Item(String itemName, String itemType, int itemID, long guid){
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemID = itemID;
		this.guid = guid;
	}
	
	String getItemName() {
		return this.itemName;
	}
}
