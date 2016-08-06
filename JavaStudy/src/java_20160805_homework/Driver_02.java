package java_20160805_homework;

public class Driver_02 {
	public static void main(String[] args){
		
		// 객체지향에서 상속(확장)의 의미 : 하위 클래스는 상위 클래스다
		Animal animal = new Animal();
		Animal mammalia = new Whale(); // 포유류는 동물이다
		Animal bird = new Birds(); // 조류는 동물이다
		Animal whale = new Whale(); // 고래는 동물이다
		Animal bat = new Bat(); // 박쥐는 동물이다
		Animal sparrow = new Sparrow(); // 참새는 동물이다
		Animal penguin = new Penguin(); // 펭귄은 동물이다
		
		animal.showMe();
		mammalia.showMe();
		bird.showMe();
		whale.showMe();
		bat.showMe();
		sparrow.showMe();
		penguin.showMe();
		
	}
}
