package java_20160802;

public class Ch6_OOP_03 {
	public static void main(String[] args){
		
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = "+ Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 10;
	}
	
	/*int iv; // instance variable
	
	static int cv; // class variable
	// 인스턴스마다 독립적인 저장공간을 갖는 인스턴스변수와는 달리, 클래스 변수는 모든 인스턴스가 공통된 저장공간(변수)을 공유하게 된다.
	// 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야하는 속성의 경우, 클래스 변수로 선언해야 한다.
	
	// 인스턴스변수는 반드시 인스턴스가 생성되있어야 사용가능하지만, 클래스 변수는 클래스이름.클래스변수와 같은 형식으로 객체생성없이 사용가능하다.
	// 즉 클래스 변수는 클래스가 메모리에 로딩될 때 생성되어 프로그램이 종료될 때 까지 유지되며, public을 앞에 붙이면 같은 프로그램 내에서 어디서나 접근할 수 있는 전역변수의 성격을 갖는다.
	
	void method(){
		int lv = 0; // local variable
	}*/
}

class Card{
	
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	
}
