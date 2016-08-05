package java_20160805_StrategyPattern_Practice;

public class Hunter extends Fighter {

	public Hunter() {
		this.fly = new FlyMiddle();
		this.attackMissile = new AirAttack();
		this.attackHandToHand = new SwordAttack();
		this.defence = new EscapeField();
	}
	
	@Override
	public void identity() {

		System.out.println("Hunter를 선택하셨습니다");

	}

	@Override
	public void goToField() {
		
		System.out.println("전장으로 이동합니다");
		System.out.println("수풀에 숨어 대기합니다");

	}

}
