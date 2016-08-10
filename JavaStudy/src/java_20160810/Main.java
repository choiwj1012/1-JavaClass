package java_20160810;

public class Main {

	int num1; // member variable => (non-static) instance variable
	static int num2; // member variable => (static) class variable
	
	public static void main(String[] args){
		
		/* local variable
		    - method실행시 생성되었다가 method 종료시 없어짐
		    - memory는 stack
		
		   int i = 0; // declare local variable 
		   System.out.println(i);
		   local variable에 trash value가 저장되어 있을 수 있기 때문에 반드시 initialize해야 한다.
		*/
		
		int sum;
		for(int i=1; i<11; i++){
			sum = 0;
			sum = sum + i; // the local variable sum may not have been initialized
		}
		
		/*
		  parameter로 쓰이는 local variable은 initialize가 필요없다.
		   이는 method call 시에 data가 전달될 것이기 때문
		
		  Member variable
		   1) static variable -> class variable
           2) non-static variable -> instance variable
		
		   A a = new A(); 일때, a => instance reference variable
		*/
		
		// instance variable
		// instance reference variable
		
		// -> constructor 실행시 create되었다가 instance reference variable에 null이 입력되거나
		//    instance reference variable가 local variable형태여서 method가 return될 때 소멸한다.
		Main m1 = new Main(); // m -> instance reference variable
		m1.num1 = 10;         // num1 -> instance variable
		System.out.println(m1.num1);
		
		Main m2 = new Main();
		m2.num1 = 20;
		System.out.println(m1.num1 + "," + m2.num1);
		
		m1.num1 = 100;
		m2.num1 = 200;
		System.out.println(m1.num1 + "," + m2.num1);
		
		// member variable => (static) class variable
		// -> program이 실행되자마자 생성되었다가 class variable에 null을 입력하거나 program이 종료될 때 소멸한다.
		// -> class(method) area
		System.out.println("num2 : " + num2);
		Main.num2 = 100;
		System.out.println("num2 : " + num2);
		
	}
	
}
