package shoppingMall;

// Product 추상 클래스를 구현한 SmartTV 클래스
public class SmartTV extends Product{

	// variable
	String resolution;
	
	// constructor
	SmartTV(){
		
	}
	
	// 생성자로 상품 이름과 가격, 해상도 정보를 받아 처리한다.
	SmartTV(String pName, int price, String resolution){
		
		this.pName = pName;
		this.price = price;
		this.resolution = resolution;
		
	}
	
	// method
	@Override
	void printExtra(){
		// 해상도 정보를 출력한다.
		System.out.println("해상도 " + resolution);
	}

}
