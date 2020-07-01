package game;

import java.util.ArrayList;

public class World {
	ArrayList<Character> characters = new ArrayList<Character>();
	CharacterManager characterManager = new CharacterManager();
	
	public boolean createCharacter(String characterName) {
		for(Character character : characters) {
			if(character.getName().equals(characterName)) {
				System.out.printf(GameMSG.ERR_SAMENAME);
				return false;
			}
		}
		System.out.printf(GameMSG.MSG_CREATECHARACTER, characterName);
		this.characters.add(this.characterManager.createCharacter(characterName));
		return true;
	}
	

}
