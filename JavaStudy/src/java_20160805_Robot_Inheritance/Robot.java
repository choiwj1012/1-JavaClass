package java_20160805_Robot_Inheritance;

// abstract class => Can`t create instance 
public abstract class Robot extends UnusualAction{
	
	// method
	// common function
	public void shape(){
		
		System.out.println("로봇은 머리, 몸통, 팔, 다리가 만들어 졌습니다");
		
	} // shape() end
	
	public void actionWalk(){
		
		System.out.println("로봇이 걷습니다");
		
	} // actionWalk() end
	
	public void actionRun(){
		
		System.out.println("로봇이 달립니다");
		
	} // actionRun() end
	
	
	
}
