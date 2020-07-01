package game;

import java.util.HashMap;

public class ItemManager {
	private long guid = 100000000L;
	private HashMap<Object, String> itemMap = new HashMap<Object, String>();
	
	public ItemManager() {
		initItems();
	}
	
	private void initItems() {
		this.itemMap.put(ItemDef.RED_STICK, "red stick");
		this.itemMap.put(ItemDef.HEALING_POTION, "healing potion");
		this.itemMap.put(ItemDef.ROTTEN_APPLE, "rotten apple");
		this.itemMap.put(ItemDef.SHORT_KNIFE, "short knife");
		this.itemMap.put(ItemDef.DAGGER, "dagger");
		this.itemMap.put(ItemDef.AXE, "axe");
		this.itemMap.put(ItemDef.DIRTY_PANTS, "dirty pants");
		this.itemMap.put(ItemDef.BLONDIE_HAIR, "blondie hair");
		this.itemMap.put(ItemDef.TELEPORT_SCROLL, "teleport scroll");
	}

	public long getGuid() {
		this.guid += 1;
		return this.guid;
	}

	public Item createItem(int itemID, int itemCount) {
		Object itemName = this.itemMap.get(itemID);
		if (itemName == null)
			return null;
		
		return Item.createItem((String)itemName, itemCount, itemID, guid);
	}
}
