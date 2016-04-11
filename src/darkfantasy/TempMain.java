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
