package java_20160806_OOP;

public class LowRobot extends Robot {

	//constructor
	LowRobot(){
		this.fly = new FlyNo();
		this.knife = new KnifeNo();
		this.missile = new MissileNo();
	}
	
}
