package java_20160805_StrategyPattern_Practice;

public class FlyLow implements Fly {

	@Override
	public void fly() {
		
		System.out.println("낮게 날고 있습니다");
	}

}
