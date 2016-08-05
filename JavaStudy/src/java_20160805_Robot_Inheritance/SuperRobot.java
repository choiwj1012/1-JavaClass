package java_20160805_Robot_Inheritance;

public class SuperRobot extends Robot{

	// constructor
	SuperRobot(){
		
	}
	
	// special function
	@Override
	public void actionFly(){
		
		System.out.println("로봇이 날아요");
		
	} // actionFly() end
	
	@Override
	public void actionMissile(){
		
		System.out.println("로봇이 미사일을 쏩니다");
		
	} // actionMissile() end
	
	@Override
	public void actionKnife(){
		
		System.out.println("로봇이 레이저 검을 쏘고 있습니다");
		
	} // actionKnife() end
	
}
