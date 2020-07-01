package game;

import java.util.HashMap;

public class SkillManager {
	private HashMap<Object, String> skillMap = new HashMap<Object, String>();
		
		public SkillManager() {
			initSkills();
		}
		
		private void initSkills() {
			this.skillMap.put(SkillDef.BASIC_ATTACK, "basic attack");
			this.skillMap.put(SkillDef.STRIKE, "strike");
			this.skillMap.put(SkillDef.THUNDERBOLT, "thunderbolt");
			this.skillMap.put(SkillDef.FIREBALL, "fireball");
			this.skillMap.put(SkillDef.HEAL, "heal");
		}
	
		public Skill createSkill(int skillID) {
			Object skillName = this.skillMap.get(skillID);
			if (skillName == null)
				return null;
			return Skill.createSkill((String)skillName, skillID);
		}
}
