package java_20160806_OOP;

public class Main {
	
	public static void main(String[] args){
		
		Robot robot = new SuperRobot();
		robot.shape();
		robot.actionRun();
		robot.actionWalk();
		robot.actionFly();
		robot.actionKnife();
		robot.actionMissile();
		
		Robot robot2 = new StandardRobot();
		robot2.shape();
		robot2.actionRun();
		robot2.actionWalk();
		robot2.actionFly();
		robot2.actionKnife();
		robot2.actionMissile();
		
		Robot robot3 = new LowRobot();
		robot3.shape();
		robot3.actionRun();
		robot3.actionWalk();
		robot3.actionFly();
		robot3.actionKnife();
		robot3.actionMissile();
		
	}
	
}
