package darkfantasy;

import java.util.Scanner;

public class TempMain {
	public static void main(String[] args){
		
		NPC p = new PatheticDemonologist("Alfred", 40, 30, 200, true);
		NPC q = new PatheticDemonologist("Jim", 40, 30, 200, true);
		
		System.out.println("" + p.name);
		System.out.println("" + q.name);
		
		int playerHP = 100;
		int warriorHP = 35;
		int rangerHP = 20;
		int mageHP = 15;
		int totalEnemyHP = warriorHP + rangerHP + mageHP;
		
		while (playerHP > 0 && totalEnemyHP > 0){
		System.out.println("how much dmg do you want to do?");
		Scanner input = new Scanner(System.in);
		int dmg = input.nextInt();
		totalEnemyHP -= dmg;
		if(totalEnemyHP > 0)
		System.out.println("The enemies look warry, their hp is:" + totalEnemyHP);

		}
		System.out.println("You win");
		
	}
}
