package java_20160805_homework;

public class Penguin extends Birds implements Swim{

	Penguin(){
		myClass = "펭귄";
	}

	@Override
	public void swim() {
		System.out.println(myClass + "수영 중, 푸아아아아아아앆!");
		
	}
	
}
