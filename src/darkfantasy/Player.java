package darkfantasy;

public class Player extends Character{
	public String name;
	public int maxHP;
	public int currentHP;
	public int damage;
	public boolean inCombat = false;
	//private static boolean playerpresent = false;
	
	public Player(String PC_name, int maxHealth, int currentHealth, int damageDealing, boolean Combat){
		super(maxHealth, currentHealth);
		name = PC_name;
		maxHP = maxHealth;
		currentHP = currentHealth;
		damage = damageDealing;
		inCombat = Combat;
	}
	
	public int getDmg(){
		return damage;
	}

	
	public void setPlayerName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
	
	public int getHealth(){
		return currentHP;
	}
}
