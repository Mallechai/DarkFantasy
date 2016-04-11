package darkfantasy;

public class NPC extends Character {
	
	//general stats (for story purposes mostly)
	public String name;
	public String profession;
	public String thoughtDescription;


	public boolean inCombat = false;
	

	
	
	//Defensive stats

	//public int armor;
	public String armorDescription;
	

	
	
	public NPC(String NPC_name, String job, int maxHealth, int currentHealth, int damageDealing, boolean Combat){
		super(maxHealth, currentHealth);
		name = NPC_name;
		profession = job;
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