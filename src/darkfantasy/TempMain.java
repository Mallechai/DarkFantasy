<<<<<<< HEAD
package darkfantasy;

import java.util.Scanner;

public class TempMain {
	public static void main(String[] args){
		
		Create_NPC p = new PatheticDemonologist("Alfred", 40, 30, 200, true);
		Create_NPC q = new PatheticDemonologist("Jim", 40, 30, 200, true);
		
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
		System.out.println("The enemies look wary, their hp is:" + totalEnemyHP);

		}
		System.out.println("You win");
		
	}
}
=======
package darkfantasy;

import darkfantasy.CombatResolved;

public class TempMain {
	public static void main(String[] args){
		Player p = new Player("Jeroen", 200, 175, 30, false);
		NPC q = new PatheticDemonologist("Jim", "Summoner", 40, 30, 5, true);
		NPC r = new PatheticDemonologist("Flamey", "Elemental", 40, 30, 10, true);
		NPC s = new PatheticDemonologist("Alfred", "Cult leader", 40, 30, 8, true);
		
		System.out.println(""+q.fireRes +" " + q.holyRes);
		CombatResolved.CombatResolution(p,q,r,s);


		
	}
}
>>>>>>> branch 'master' of https://github.com/jwponline/DarkFantasy.git
