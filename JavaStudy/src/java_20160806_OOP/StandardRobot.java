package java_20160806_OOP;

public class StandardRobot extends Robot {

	// constructor
	StandardRobot(){
		this.fly = new FlyNo();
		this.knife = new KnifeWood();
		this.missile = new MissileYes();
	}
	
}
