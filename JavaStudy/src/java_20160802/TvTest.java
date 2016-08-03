package java_20160802;

class Tv{
	// 클래스는 '객체를 생성하기 위한 틀'이며, '클래스는 속성과 기능으로 정의되어있다'
	
	
	// Tv의 속성 (멤버변수)
	String color;  // tv 색상
	boolean power; // tv 전원
	int channel;   // tv 채널
	
	// Tv의 기능(메서드)
	void power(){ // return type + method name, void는 return 값이 없는 경우에 사용
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
}

class TvChild extends Tv{
	
	void channelUp(){
		channel = channel + 2;
	}
	void channelDown(){
		channel = channel - 2;
	}
	
}

public class TvTest {
	public static void main(String[] args){
		
		Tv t;           // Tv 인스턴스를 참조하기 위한 변수 t를 선언
		// Tv 클래스 타입의 참조변수 t를 선언한다. 메모리에 참조변수 t를 위한 공간이 마련된다. 아직 인스턴스가 생성되지 않았으므로 참조변수로 아무것도 할 수 없다.
		
		t = new Tv();   // Tv 인스턴스를 생성한다
		// new 연산자에 의해 Tv클래스의 인스턴스가 메모리의 빈 공간에 생성된다. 멤버변수는 각 자료형에 해당하는 기본값으로 초기화된다.
		
		t.channel = 7;  // Tv 인스턴스의 멤버변수 channel의 값을 7로 한다
		// 참조변수 t에 저장된 주소에 있는 인스턴스의 멤버변수 channel에 7을 저장한다. 속성을 사용하려면 다음과 같이 참조변수.멤버변수 로 작성하면 된다.
		
		System.out.println("현재 채널은 " + t.channel + "입니다."); // t.channel == 7;
		
		t.channelUp(); // Tv 클래스의 channelUp()메소드를 사용한다 => 메소드를 호출한다.
		System.out.println("현재 채널은 " + t.channel + "입니다."); // t.channel == 8;
		
		t.channelDown(); // Tv 클래스의 channelDown()메소드를 사용한다 => 메소드를 호출한다.
		System.out.println("현재 채널은 " + t.channel + "입니다."); // t.channel == 7;
		
		System.out.println("---------------------------------------------------------------------------");
		
		TvChild tChild = new TvChild(); // tChild 인스턴스 생성. 선언과 생성을 동시에 작성
		
		tChild.channel = 7; //tChild 인스턴스의 멤버변수 channel의 값을 7로 한다.
		// tChild의 클래스에는 .channel 속성이 없지만 부모에게 상속받아 사용할 수 있다.
		
		System.out.println("현재 채널은 " + tChild.channel + "입니다."); // tChild.channel == 7;
		
		tChild.channelUp(); // => channelUp() 메소드를 호출한다.
		System.out.println("현재 채널은 " + tChild.channel + "입니다."); // tChild.channel == 9;
		
		tChild.channelDown(); // => channelDown() 메소드를 호출한다.
		System.out.println("현재 채널은 " + tChild.channel + "입니다."); // tChild.channel == 7;
		
		System.out.println("---------------------------------------------------------------------------");
		
		Calculator cal = new Calculator();
		
		int sumResult = cal.add(1,2);         // Math클래스의 add()메서드 호출
		int subResult = cal.subtract(5,1);    // Math클래스의 subtract()메서드 호출
		int mulResult = cal.multiply(3,5);    // Math클래스의 multiply()메서드 호출
		double divResult = cal.divide(7, 3);  // Math클래스의 divide()메서드 호출
		
		System.out.println(sumResult + "," + subResult + "," + mulResult + "," + divResult);
	}  
}

class Calculator{
	
	int add(int a, int b){   // 메서드 호출시 parameter의 갯수, 타입은 일치해야 작동한다
		int result = a + b;
		return result;       // void타입이 아니면 반드시 return값이 존재해야 하며, parameter는 여러개 가능하나 return은 단 하나만 가능하다.
	}
	
	int subtract(int a, int b){
		int result = a - b;
		return result;
	}
	
	int multiply(int a, int b){
		int result = a * b;
		return result;
	}
	
	double divide(int a, int b){
		int result = a / b;
		return result;
	}
	
}



