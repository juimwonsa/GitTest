package game;

import java.util.ArrayList;

public class Character {
	private ArrayList<Item> items;
	private ArrayList<Skill> skills;
	private String name;
	private int level;
	private long guid;
	
	Character(String name,long guid){
		this.name = name;
		this.level = 1;
		this.items = new ArrayList<Item>();
		this.skills = new ArrayList<Skill>();
		this.guid = guid;
	}
	
	void getItem(Item item) {
		System.out.printf(GameMSG.MSG_GETITEM, item.getItemName());
		this.items.add(item);
	}
	
	void getSkill(Skill skill) {
		System.out.printf(GameMSG.MSG_GETSKILL, skill.getSkillName());
		this.skills.add(skill);
	}
	
	
}
