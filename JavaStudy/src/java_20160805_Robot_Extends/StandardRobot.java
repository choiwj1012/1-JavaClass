package java_20160805_Robot_Extends;

public class StandardRobot extends Robot{

	// constructor
	StandardRobot(){
		
	}
	
	// special function
	@Override
	public void actionFly(){
		
		System.out.println("로봇이 날 수 없습니다");
		
	} // actionFly() end
	
	@Override
	public void actionMissile(){
		
		System.out.println("로봇이 미사일을 쏩니다");
		
	} // actionMissle() end
	
	@Override
	public void actionKnife(){
		
		System.out.println("로봇이 목검을 휘두릅니다");
		
	} // actionKnife() end
	
}
