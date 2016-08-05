package java_20160805_StrategyPattern_Practice;

public class Main {

	public static void main(String[] args) {
		
		Fighter warrior = new Warrior();
		Fighter hunter = new Hunter();
		Fighter defender = new Defender();
		Fighter eagle = new Eagle();
		
		warrior.meetTogether();
		
		System.out.println();
		
		warrior.identity();
		warrior.goToField();
		warrior.fly();
		warrior.attackMissile();
		warrior.attackHandToHand();
		warrior.defence();
		
		System.out.println();
		
		hunter.identity();
		hunter.goToField();
		hunter.fly();
		hunter.attackMissile();
		hunter.attackHandToHand();
		hunter.defence();
			
		System.out.println();
		
		defender.identity();
		defender.goToField();
		defender.fly();
		defender.attackMissile();
		defender.attackHandToHand();
		defender.defence();
		
		System.out.println();
		
		eagle.identity();
		eagle.goToField();
		eagle.fly();
		eagle.attackMissile();
		eagle.attackHandToHand();
		eagle.defence();

	}

}
