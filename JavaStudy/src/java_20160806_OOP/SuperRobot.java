package java_20160806_OOP;

public class SuperRobot extends Robot {
	
	// constructor
	SuperRobot(){
		this.fly = new FlyYes(); // Fly fly = new FlyYes(); 결국 override된 FlyYes객체의 메서드를 이용할 수 있게 된다
		this.knife = new KnifeLazer();
		this.missile = new MissileYes();
	}
	
}
