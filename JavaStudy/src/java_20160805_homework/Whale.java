package java_20160805_homework;

public class Whale extends Mammal implements Swim{

	Whale(){
		myClass = "고래";
	}

	@Override
	public void swim() {
		System.out.println(myClass + "수영 중 어프어프!!");
	}
	
}
