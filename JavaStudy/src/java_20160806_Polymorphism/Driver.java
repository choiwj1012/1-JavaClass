package java_20160806_Polymorphism;

public class Driver {
	
	public static void main(String[] args){
		
		Penguin pororo = new Penguin();
		
		pororo.name = "뽀로로";
		pororo.habitat = "남극";
		
		pororo.showName();
		pororo.showName("초보람보");
		pororo.showHabitat();
		
		Animal pingu = new Penguin();
		pingu.name = "찡구";
		pingu.showName();
		// Animal 타입의 pingu지만, showName()은 Override된 Penguin객체의 showName()을 실행한다
	}
	
}
