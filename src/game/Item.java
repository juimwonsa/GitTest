package game;

public class Item {
	private String itemName;
	private int itemCount;
	private int itemID;
	private long guid;

	public Item(String itemName, int itemCount, int itemID, long guid) {
		this.itemName 	= itemName;
		this.itemCount 	= itemCount;
		this.itemID 	= itemID;
		this.guid 		= guid;
	}

	public static Item createItem(String itemName, int itemCount, int itemID, long guid) {
		return new Item(itemName, itemCount, itemID, guid);
	}
	
	public String getItemName() {
		return this.itemName;
	}
	
	public long getItemGUID() {
		return this.guid;
	}
}
