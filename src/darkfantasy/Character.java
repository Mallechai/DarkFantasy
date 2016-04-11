package darkfantasy;

public class Character {
	
	//Defensive stats
	public int maxHP;
	public int currentHP;
	public int dodge;
	public int parry;
	
	//armor resistance
	public double piercingRes, bashingRes, slashingRes, blastRes;
	
	//resistance
	public double fireRes, elecRes, iceRes, earthRes, darkRes, holyRes, natureRes, spiritRes;
	
	public Character(int maxHealth, int currentHealth){
		maxHP = maxHealth;
		currentHP = currentHealth;
		//sets all resistance multipliers to 1.0
		piercingRes = bashingRes = slashingRes = blastRes = fireRes = elecRes = iceRes = earthRes = darkRes = holyRes = natureRes = spiritRes = 1.0;
	}
	public int getMaxHealth(){
		return maxHP;
	}
	
	public int getHealth(){
		return currentHP;
	}
}

