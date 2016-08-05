package java_20160805_StrategyPattern_Practice;

public class Warrior extends Fighter {

	public Warrior() {
		this.fly = new FlyLow();
		this.attackMissile = new GroundAttack();
		this.attackHandToHand = new SwordAttack();
		this.defence = new ShieldDefence();
	}
	
	@Override
	public void identity() {
		
		System.out.println("Warrior를 선택하셨습니다");
		
	}

	@Override
	public void goToField() {
		
		System.out.println("전장으로 뛰어갑니다");
		
	}

}
