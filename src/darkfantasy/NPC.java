<<<<<<< HEAD
package darkfantasy;

public class NPC extends Character {
	
	//general stats (for story purposes mostly)
	public String name;
	public String profession;
	public String thoughtDescription;


	public boolean inCombat = false;
	
	//Offensive stats
	public int damage;
	public String dmgType;
	public String attackDescription;
	
	
	//Defensive stats
	public int maxHP;
	public int currentHP;
	public int armor;
	public int dodge;
	public int parry;
	public String armorDescription;
	
	//armor resistance
	public double piercingRes, bashingRes, slashingRes, blastRes;
	
	//resistance
	public double fireRes, elecRes, iceRes, earthRes, darkRes, holyRes, natureRes, spiritRes;
	
	
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
=======
package darkfantasy;

public class NPC extends Character {
	
	//general stats (for story purposes mostly)
	public String name;
	public String profession;
	public String thoughtDescription;


	public boolean inCombat = false;
	
	//Offensive stats
	public int damage;
	public String[] dmgType;
	public String attackDescription;
	
	
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
>>>>>>> 91183bae4ba1e1b3d509626bec369c7d35ce5112
