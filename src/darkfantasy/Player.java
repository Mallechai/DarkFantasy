package darkfantasy;

public class Player {
	public String name;
	public int maxHP;
	public int currentHP;
	public int damage;
	public boolean inCombat = false;
	//private static boolean playerpresent = false;
	
	public Player(String PC_name, int maxHealth, int currentHealth, int damageDealing, boolean Combat){
		name = PC_name;
		maxHP = maxHealth;
		currentHP = currentHealth;
		damage = damageDealing;
		inCombat = Combat;
	}
	
	public int getDmg(){
		return damage;
	}

	
	public Player(String name){
		this.name = name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/
	
	public String getName(){
		return this.name;
	}
	
	public int getMaxHP(){
		return maxHP;
	}
}
