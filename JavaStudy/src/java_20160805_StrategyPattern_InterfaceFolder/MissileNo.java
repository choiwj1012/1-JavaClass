package java_20160805_StrategyPattern_InterfaceFolder;

public class MissileNo implements Missile_Interface {

	@Override
	public void missile() {
		System.out.println("미사일을 쏠 수 없습니다");

	}

}
