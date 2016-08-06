package java_20160805_homework;

public class Mouse {
	
	// variable
	public String name;
	public int age;
	public int countOfTail_01;
	
	// static variable
	public static int countOfTail_02 = 1; // 클래스 멤버 변수 (MouseDriver_02에서 사용)
	
	// constructor
	Mouse(){
		
	}
	
	// method
	public void sing(){
		System.out.println(name + "찍찍 !!");
	}
}
