package java_20160805_Robot_Interface;

public class Main {

	public static void main(String[] args){
	
		LowRobot robot = new LowRobot();
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		
		//Fly fly = new FlyNo();
		Fly fly = new FlyYes();
		robot.setFly(fly);
	
		Missile missile = new MissileNo();
		robot.setMissile(missile);
		
		Knife knife = new KnifeNo();
		robot.setKnife(knife);
		
		robot.fly.actionFly();
		robot.missile.actionMissile();
		robot.knife.actionKnife();
		
	}
	
}
