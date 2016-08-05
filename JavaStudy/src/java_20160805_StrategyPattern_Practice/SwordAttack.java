package java_20160805_StrategyPattern_Practice;

public class SwordAttack implements AttackHandToHand {

	@Override
	public void attackHand() {
		System.out.println("검으로 공격합니다");

	}

}
