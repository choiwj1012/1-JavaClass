package java_20160805_StrategyPattern_Practice;

public class Eagle extends Fighter {

	public Eagle() {
		this.fly = new FlyHigh();
		this.attackMissile = new AirAttack();
		this.attackHandToHand = new FistAttack();
		this.defence = new EscapeField();
	}
	
	@Override
	public void identity() {

		System.out.println("Eagle을 선택하셨습니다");

	}

	@Override
	public void goToField() {

		System.out.println("공중에서 정찰중입니다");
		
	}

}
