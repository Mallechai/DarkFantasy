package darkfantasy;

import java.util.Scanner;

public class CombatResolved{
	
	public void CombatResolution(Player Player, NPC Enemy1){CombatResolution(Player, Enemy1, null, null);}
	public void CombatResolution(Player Player, NPC Enemy1, NPC Enemy2){CombatResolution(Player, Enemy1, Enemy2, null);}
	
	public static void CombatResolution(Player Player, NPC Enemy1, NPC Enemy2, NPC Enemy3){
		
		int playerHP = 100;
		int e1HP = Enemy1.getHealth();
		int e2HP = Enemy2.getHealth();
		int e3HP = Enemy3.getHealth();
		int totalEnemyHP = e1HP+e2HP+e3HP;
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
				System.out.println("The enemies look warry, their current hp is:" + totalEnemyHP);
		}
		System.out.println("You win");
	}
		
		
	
	private int dealDamage(){
		int newHealth = 25;
		
		if (newHealth < 0){
			newHealth = 0;
		}
		return newHealth;
	}
	
	
	private double elementalMod(){
		double damagemultiplier = 2.5;
		return damagemultiplier;
	}
	
}
