package shoppingMall;

// Product 추상 클래스를 구현한 휴대폰 클래스
public class CellPhone extends Product{
	
	// instance variable
	String carrier;
	
	// constructor
	CellPhone(){
		
	}
	
	// 생성자로 상품 이름과 가격, 통신사 정보를 받아서 처리한다.
	CellPhone(String pName, int price, String carrier){
		
		this.pName = pName;
		this.price = price;
		this.carrier = carrier;
		
	}
	
	// method
	@Override
	void printExtra(){
		// 추가 정보인 통신사 정보를 출력한다.
		System.out.println("통신사 : " + carrier);
	}

}
