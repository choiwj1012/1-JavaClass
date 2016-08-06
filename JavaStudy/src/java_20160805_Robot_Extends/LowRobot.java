package java_20160805_Robot_Extends;

public class LowRobot extends Robot{

	// constructor
	LowRobot(){
		
	}
	
	// special function
	@Override
	public void actionFly(){
		
		System.out.println("로봇이 날 수 없습니다");
		
	} // actionFly() end
	
	@Override
	public void actionMissile(){
		
		System.out.println("로봇이 미사일을 쏠 수 없습니다");
		
	} // actionMissle() end
	
	@Override
	public void actionKnife(){
		
		System.out.println("로봇이 검이 없습니다");
		
	} // actionKnife() end
	
}
