package java_20160805_homework;

public class MouseDriver_02 {
	
	int i;
	
	public static void main(String[] args){

		Mouse mickey = new Mouse(); 
		Mouse jerry = new Mouse();
		Mouse mightyMouse = new Mouse();
		
		// static 변수의 경우 객체 생성없이 객체이름.속섬명 으로 사용할 수 있다.
		System.out.println(mickey.countOfTail_02);
		System.out.println(jerry.countOfTail_02);
		System.out.println(mightyMouse.countOfTail_02);
		
		System.out.println(Mouse.countOfTail_02);
	
		// static 메서드 안에서는 static 변수만 사용이 가능하다.
		// i = 5; 위에 int i;로 선언된 변수를 static 메서드 안에서는 사용이 불가능하다.
		// 이런식으로 static메서드 안에서는 같은 클래스 내라고 할지라도 객체를 생성하여 접근해야 사용가능하다.
			
		MouseDriver_02 abc = new MouseDriver_02();
		abc.i = 5;
		
	}	
}
