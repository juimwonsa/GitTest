package game;

public class CharacterManager {
	private long guid = 200000000L;	

	public long getGuid() {
		this.guid += 1;
		return this.guid;
	}

	public Character createCharacter(String characterName) {
		guid = getGuid();
		return Character.createCharacter((String)characterName, guid);
	}
}
