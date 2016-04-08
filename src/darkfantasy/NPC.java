package darkfantasy;

public class NPC {
	public String name;
	public String profession;
	public int maxHP;
	public int currentHP;
	public int damage;
	public boolean inCombat = false;
	
	public NPC(String NPC_name, String job, int maxHealth, int currentHealth, int damageDealing, boolean Combat){
		name = NPC_name;
		profession = job;
		maxHP = maxHealth;
		currentHP = currentHealth;
		damage = damageDealing;
		inCombat = Combat;
	}
	
	public NPC(){
		this(null, null, 0, 0, 0, false);
	}
	
	public int getHealth(){
		return currentHP;
	}
	

	
}
