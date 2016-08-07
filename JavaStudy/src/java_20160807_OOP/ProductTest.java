package java_20160807_OOP;

class Product{
	
	static int count = 0; // 생성된 인스턴스의 수를 저장하기 위한 변수
	// count가 static 변수이기 때문에 처음 클래스가 생성될 때 메모리에 저장이 되어 
	// 객체가 생성되어도 초기화 되지 않는다. 즉 변수를 변경 가능하다.
	// count변수를 인스턴스 변수로 선언했다면 인스턴스 생성때마다 초기화가 되어
	// 0만 저장되고 serialNo는 1만 저장될 것이다.
	
	int serialNo; // 인스턴스 고유의 번호
	
	{
		++count; // 인스턴스가 생성되면 count수를 1씩 늘려라
		serialNo = count; // 늘어난 count를 serialNo에 넣어라
	}
	
	// constructor
	public Product(){
		
	}
	
}

public class ProductTest {
	
	public static void main(String[] args){
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 제품번호 (serial No)는 " + p1.serialNo);
		System.out.println("p1 제품번호 (serial No)는 " + p2.serialNo);
		System.out.println("p1 제품번호 (serial No)는 " + p3.serialNo);
		
	}
	
}
