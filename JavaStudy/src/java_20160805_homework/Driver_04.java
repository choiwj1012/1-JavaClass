package java_20160805_homework;

public class Driver_04 {
	public static void main(String[] args){
		
		Fly fly1 = new Bat();
		fly1.fly();
		
		Fly fly2 = new Sparrow();
		fly2.fly();
		
		Swim[] swims = new Swim[2];
		
		swims[0] = new Whale();
		swims[1] = new Penguin();
		
		for(Swim swim : swims){
			swim.swim();
		}
		
	}
}
