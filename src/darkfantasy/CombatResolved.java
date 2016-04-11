package darkfantasy;

import java.util.Scanner;

public class CombatResolved{
	
	public void CombatResolution(Player Player, NPC Enemy1){CombatResolution(Player, Enemy1, null, null);}
	public void CombatResolution(Player Player, NPC Enemy1, NPC Enemy2){CombatResolution(Player, Enemy1, Enemy2, null);}
	
	public static void CombatResolution(Player Player, NPC Enemy1, NPC Enemy2, NPC Enemy3){
		
		int playerHP = Player.getHealth();
		int totalEnemyHP = Enemy1.getHealth()+Enemy2.getHealth()+Enemy3.getHealth();
		int playerDMG = Player.getDmg();
		
		while (playerHP > 0 && totalEnemyHP > 0){
			System.out.println("What do you want to do?\n 1) Attack \n 2) Defend");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			if (choice == 2){
				System.out.println("Sorry there will be no defending today");
			}
			totalEnemyHP -= playerDMG;
			if(totalEnemyHP > 0)
				theirTurn();
				System.out.println("The enemies look warry, their current hp is:" + totalEnemyHP);
		}
		System.out.println("You win");
	}
		
	private static void theirTurn(){
		System.out.println("They do some damage... I Guess");
	}
	
	private double calcDMGMod(String[] atktypes, Character Defender){
		double atkMod = 1.0;
		
		for (int i = 0 ; i < atktypes.length; i++){
			switch (atktypes[i].toLowerCase()){
				case "piercing": atkMod *= Defender.piercingRes; break;
				case "bashing": atkMod *= Defender.bashingRes; break;
				case "slashing": atkMod*= Defender.slashingRes; break;
				case "blast": atkMod *= Defender.blastRes; break;
				case "fire": atkMod *= Defender.fireRes; break;
				case "electricity": atkMod *= Defender.elecRes; break;
				case "ice": atkMod *= Defender.iceRes; break;
				case "earth": atkMod *= Defender.earthRes; break;
				case "dark": atkMod *= Defender.darkRes; break;
				case "holy": atkMod *= Defender.holyRes; break;
				case "nature": atkMod *= Defender.natureRes; break;
				case "spirit": atkMod *= Defender.spiritRes; break;
			}
		}		
		return atkMod;
	}
	
	private int playerdealDamage(Player Attacker, NPC Defender){
		int newHealth = 25;
		

		
		if (newHealth < 0){
			newHealth = 0;
		}
		return newHealth;
	}

	private double npcDealDamage(NPC Attacker, Character Defender){
		double newHealth = 25;
		double dmgMod = calcDMGMod(Attacker.dmgType, Defender);
		newHealth = Attacker.damage * dmgMod;
		
		if (newHealth < 0){
			newHealth = 0;
		}
		
		//round this down
		return newHealth;
	}
	
}