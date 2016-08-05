package java_20160805_Robot_Polymorphism;

public class Main {
	public static void main(String[] args){
		
		Robot robot = new SuperRobot();
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.actionFly();
		robot.actionMissile();
		robot.actionKnife();
		
	}
}
