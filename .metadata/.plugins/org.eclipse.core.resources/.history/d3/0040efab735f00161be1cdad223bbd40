package shop;

// 상품의 기본 구조와 정보 출력 기능이 있는 추상 클래스
public abstract class Product {
	
	// 상품 배열 선언
	final static int MAX_PRODUCT = 30;
	static Product[] products = new Product[MAX_PRODUCT];
	static int productCount = 0;
	
	
	// variable
	String pName;
	int price;
	
	// constructor
	Product(){
		
	}
	
	// method
	// 상품의 기본 정보인 상품 이름과 가격을 출력한다.
	// 상세 정보를 출력하려고 printExtra()메서드를 호출한다.
	void printDetail(){
		System.out.println("상품명 : " + pName);
		System.out.println("가격 : " + price);
		printExtra();
		System.out.println("");
	}
	
	// 추상 메서드로, 실제 구현은 서브 클래스에서 한다.
	// printDetail()에서 자동으로 호출하므로, printExtra()에 구현된 내용도 자동으로 함께 출력된다.
	abstract void printExtra();
	
}
