package game;

import java.util.ArrayList;

public class Character {
	private ArrayList<Item> items;
	private ArrayList<Skill> skills;
	private String name;
	private int level;
	private long guid;
	private ItemManager itemManager;
	private SkillManager skillManager;			
			
	public Character(String name, long guid) {
		this.name 			= name;
		this.level 			= 1;
		this.items 			= new ArrayList<Item>();
		this.skills 		= new ArrayList<Skill>();
		this.guid 			= guid;
		this.itemManager	= new ItemManager();
		
		initItems();
		initSkills();
	}
	
	private void initItems() {
		createItem(ItemDef.AXE, 1);
		createItem(ItemDef.HEALING_POTION, 3);
		createItem(ItemDef.DIRTY_PANTS, 1);
		createItem(ItemDef.DAGGER, 1);		
	}
	
	private void initSkills() {
		createSkill(SkillDef.BASIC_ATTACK);
	}
	
	public boolean createItem(int itemID, int itemCount) {
		this.items.add(this.itemManager.createItem(itemID, itemCount));
		return true;
	}
	
	public boolean createSkill(int skillID) {
		this.skills.add(this.skillManager.createSkill(skillID));
		return true;
	}
	
	public boolean removeItem(long guid) {
		for(Item items : this.items) {
			if(items.getItemGUID()==guid) {
				this.items.remove(this.items.indexOf(items));
				return true;
			}
		}
		return false;
	}
	
	public void getItem(Item item) {
		System.out.printf(GameMSG.MSG_GETITEM, item.getItemName());
		this.items.add(item);
	}
	
	public void getSkill(Skill skill) {
		System.out.printf(GameMSG.MSG_GETSKILL, skill.getSkillName());
		this.skills.add(skill);
	}
	
	public void showItems() {
		for(Item items : this.items) {
			System.out.printf("%s%n", items.getItemName());
		}
	}
}
