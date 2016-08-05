package java_20160805_StrategyPattern_Practice;

public class Defender extends Fighter {

	public Defender() {
		this.fly = new FlyLow();
		this.attackMissile = new GroundAttack();
		this.attackHandToHand = new FistAttack();
		this.defence = new BodyDefence();
	}
	
	@Override
	public void identity() {

		System.out.println("Defender를 선택하셨습니다");
		
	}

	@Override
	public void goToField() {

		System.out.println("주위를 살핍니다");
		System.out.println("전장으로 이동합니다");
		
	}

}
