package game;

public class Skill {
	private String skillName;
	private int skillID;
	
	public Skill(String skillName, int skillID) {
		this.skillName	 	= skillName;
		this.skillID 		= skillID;
	}
	
	public static Skill createSkill(String skillName, int skillID) {
		return new Skill(skillName, skillID);
	}
	
	public String getSkillName() {
		return this.skillName;
	}
}
