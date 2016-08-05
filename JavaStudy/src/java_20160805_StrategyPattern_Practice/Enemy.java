package java_20160805_StrategyPattern_Practice;

public class Enemy extends Fighter{

	@Override
	public void identity() {
		System.out.println("몬스터");
	}

	@Override
	public void goToField() {
		System.out.println("몬스터가 캐릭터의 앞을 막아섭니다");
	}

}
