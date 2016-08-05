package java_20160805_Robot_Interface;

public class StandardRobot extends Robot{
	
	Fly fly;
	Missile missile;
	Knife knife;
	
	public void setFly(Fly fly) {
		this.fly = fly;
	}
	
	public void setMissile(Missile missile) {
		this.missile = missile;
	}
	
	public void setKnife(Knife knife) {
		this.knife = knife;
	}
	
}
