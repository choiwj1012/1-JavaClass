package java_20160806_OOP;

public class Robot {

	// variable
	Fly fly;
	Knife knife;
	Missile missile;
	
	// constructor
	Robot(){
		
	}
	
	// setter
	void setFly(Fly fly){
		this.fly = fly;
	}
	
	void setKnife(Knife knife){
		this.knife = knife;
	}
	
	void setMisiile(Missile missile){
		this.missile = missile;
	}
	
	// method
	// common method
	void shape(){
		System.out.println("로봇의 머리, 몸통, 팔, 다리가 생성됩니다");
	}
	
	void actionWalk(){
		System.out.println("로봇이 걷습니다");
	}
	
	void actionRun(){
		System.out.println("로봇이 뜁니다");
	}
	
	// special method
	void actionFly(){
		this.fly.fly();
	}
	
	void actionKnife(){
		this.knife.knife();
	}
	
	void actionMissile(){
		this.missile.missile();
	}
	
}
