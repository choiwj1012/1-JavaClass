package java_20160806_Polymorphism;

public class Penguin extends Animal{

	public String habitat;
	
	public void showHabitat(){
		System.out.printf("%s는 %s에 살아\n", name, habitat);
	}
	
	// Overriding - redefine : 상위클래스의 메서드와 같은 메스드 이름, 같은 인자 리스트
	public void showName(){
		System.out.println("어머 내 이름은 알아서 뭐하게요?");
	}
	
	// Overloading 
	// repetition definition : same method name, different parameter list
	public void showName(String yourName){
		System.out.printf("%s 안녕, 나는 %s라고 해\n", yourName, name);
	}
}
