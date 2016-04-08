package darkfantasy;

public class Create_NPC {
	public String name;
	public int maxHP;
	public int currentHP;
	public int damage;
	public boolean inCombat = false;
	
	public Create_NPC(String NPC_name, int maxHealth, int currentHealth, int damageDealing, boolean Combat){
		name = NPC_name;
		maxHP = maxHealth;
		currentHP = currentHealth;
		damage = damageDealing;
		inCombat = Combat;
	}
	
	public Create_NPC(){
		this(null, 0, 0, 0, false);
	}
	

	
}
