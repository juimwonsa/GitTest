package game;

public class Skill {
	private String skillName;
	private String skillType;
	private int skillDamage;
	private int skillID;

	
	Skill(String skillName, String skillType, int skillDamage, int skillID) {
		this.skillName = skillName;
		this.skillType = skillType;
		this.skillDamage = skillDamage;
		this.skillID = skillID;
	}
	
	String getSkillName() {
		return this.skillName;
	}
}
